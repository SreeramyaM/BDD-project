package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;
import Data.ExcelData;
import PageObjects.ManageCasesPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ManageCase extends BaseTest {
	public WebDriver driver;
	
	public ManageCase()throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver,ManageCasesPage.class);
	}
	
	ManageCasesPage managecase= PageFactory.initElements(driver, ManageCasesPage.class);
	ReaderAndWriteDataFromExcel readandwrite = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	@Given("^Enter case id in search box$")
	public void enter_case_id_in_search_box() throws Throwable {
	   String caseid= readandwrite.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
	   managecase.searchcase(caseid);
	}

	@Then("^Verify Case should be displayed$")
	public void verify_Case_should_be_displayed() throws Throwable {
		String caseid= readandwrite.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		managecase.verifyCases(caseid);
	}
	
	@And("^Click on Home button$")
	public void clickHome() throws Exception {
		managecase.clickHome();
	}
	
	
}
