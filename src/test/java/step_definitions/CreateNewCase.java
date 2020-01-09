package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.ExcelData;
import Locators.CreateNewCase.locators;
import PageObjects.CreateNewCasePage;
import PageObjects.LoginPage;
import Utility.DateAndTimeFunctions;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewCase extends BaseTest {

	public WebDriver driver;
	DateAndTimeFunctions dateAndTime;

	public CreateNewCase() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, CreateNewCasePage.class);
	}

	CaseData caseData 							= new CaseData();
	ReaderAndWriteDataFromExcel readAndWrite    = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	LoginPage login                      		= PageFactory.initElements(driver, LoginPage.class);
	CreateNewCasePage createCase 				= PageFactory.initElements(driver, CreateNewCasePage.class);
	String issueDate 							= DateAndTimeFunctions.getCurrentDate("MM/dd/yyyy");
	String time     							= DateAndTimeFunctions.getCurrentTime("h:mm a");
	String dateAndtime                          = issueDate+" "+time;
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");

	@Then("^Verify the Create New Case page is display$")
	public void verify_the_Create_New_Case_page_is_displayed() throws Throwable {
		createCase.verifyNewCasePage();
	}

	@When("^IO lead entres all case details to create New Case$")
	public void ioLeadCaseDetails() throws Throwable {
		String ioTeamName = readAndWrite.readingDataFromExcel(ExcelData.TEAM_DATA_SHEET, ExcelData.IO_TEAM_COLUMN, filePath);
		createCase.enterIOLeadCaseDetails(caseData.CASE_ID, filePath, CaseData.CASE_NAME, dateAndtime, ioTeamName, CaseData.PRIORITY_NORMAL, CaseData.DETAILS);
	}

	@When("^Reporting Lead entres all case details to create New Case$")
	public void repoLeadCaseDetails() throws Throwable {
		String investigationLeadName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_NAME, filePath);
		String ioTeamName = readAndWrite.readingDataFromExcel(ExcelData.TEAM_DATA_SHEET, ExcelData.IO_TEAM_COLUMN, filePath);
		createCase.enterReportingLeadCaseDetails(caseData.REPO_MEMBER_CASE_ID, filePath, CaseData.REPO_MEMBER_CASE_NAME, dateAndtime, investigationLeadName, ioTeamName,  CaseData.PRIORITY_NORMAL, CaseData.DETAILS);
	}
	
	@When("^Click on Save Button$")
	public void clickSaveButton() throws Throwable {
		createCase.clickSave();
	}

	@Then("^Verify case created success message$")
	public void verifyCaseCreatedSuccessMessage() throws Throwable {
		createCase.caseCreatedSuccessMessage();
	}
	
	@Then("^User clicks on Cases link from the left menu$")
	public void userClicksOnCasesFromTheLeftMenu() throws Throwable {
		createCase.userClicksOnCasesFromTheLeftMenu(); 
	}

	@Then("^Verify that list of cases should be displayed and newly created case at the top$")
	public void verifyListOfCasesDisplayedAndNewlyCreatedCaseOnTop() throws Throwable {
		createCase.verifyTextIsPresent(locators.VIEW_CASES, "xpath", "Error info: List of cases not displayed");
		String caseId= readAndWrite.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		createCase.verifyListOfCasesDisplayedAndNewlyCreatedCaseOnTop(caseId);
	}

	@When("^User clciks on Download icon of the newly created case$")
	public void userClciksOnDownloadOfNewlyCreatedCase() throws Throwable {
		Thread.sleep(8000);
	  createCase.userClciksOnDownloadOfNewlyCreatedCase(); 
	}
	
	@When("^Click on iMAGENEcsi logo on the left corner$")
	public void clickOniMAGENEcsiLogo() throws Throwable {
		Thread.sleep(3000);
	    createCase.clickOniMAGENEcsiLogo();
	}
		
}
