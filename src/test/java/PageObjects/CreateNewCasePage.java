package PageObjects;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import Data.CaseData;
import Data.ExcelData;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;
import Locators.CreateNewCase;
import Locators.CreateNewCase.locators;

public class CreateNewCasePage extends BrowserBot {

	public CreateNewCasePage() throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	ReaderAndWriteDataFromExcel readAndWrite    = new ReaderAndWriteDataFromExcel();
	private static final Logger logger          = LogManager.getLogger(LoginPage.class.getName());
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	
	public void verifyNewCasePage() throws Exception {
		waitForElementAppearance(locators.CREATE_NEW_CASE_PAGE, "css");
		verifyTextIsPresent(locators.CREATE_NEW_CASE_PAGE, "css", "Error Info: Create new Case page is not display");
	}

	public void selectNewCase() throws Exception {
		waitForElementAppearance(locators.NEW_CASE, "css");
		click(locators.NEW_CASE, "css");
	}

	public void enterCaseID(String caseID, String filePath) throws Exception {
		sendKeys(locators.CASE_ID, "id", caseID);
		readAndWrite.writeDataToExcelFile(caseID, ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);		
		System.out.println(locators.CASE_ID);
	}

	public void enterCaseName(String caseName) throws Exception {
		sendKeys(locators.CASE_NAME, "id", caseName);
	}

	public void verifyCurrentDate(String date) throws Exception {
		String currentDate = getAttributeValue(locators.DATE, "xpath");        
		assertEquals(currentDate, date);
	}

	public void verifyInvestigationLead(String invistigationLead) throws Exception {
		System.out.println(locators.INVISTIGATION_LEAD + invistigationLead + locators.CLOSE_XPATH);
		verifyTextIsPresent(locators.INVISTIGATION_LEAD + invistigationLead + locators.CLOSE_XPATH, "xpath", "Error info: ");
	}

	public void selectInvistigationTeam(String invistigationTeam) throws Exception {
		sendKeys(locators.INVISTIGATION_TEAM, "xpath", invistigationTeam);
		waitForElementAppearance(locators.DROUPDOWN_OPTION + invistigationTeam + locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION + invistigationTeam + locators.CLOSE_XPATH, "xpath");
	}

	public void selectCasePriority(String complexity) throws Exception {
		sendKeys(locators.PRIORITY, "xpath", complexity);
		waitForElementAppearance(locators.DROUPDOWN_OPTION +complexity+ locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION +complexity+ locators.CLOSE_XPATH, "xpath");
	}

	public void enterDetails(String details) throws Exception {
		sendKeys(locators.DETAILS, "id", details);
	}

	public void clickSave() throws Exception {
		clickByJS(locators.SAVE, "xpath");
	}

	public void selectDocType() throws Exception {
		sendKeys(locators.SELECT_DOC_TYPE, "xpath", "FISHEY");
	}

	public void clickOnProceedButton() throws Exception {
		click(locators.PROCEED_BUTTON, "xpath");
	}

	public void verifyDocumentUploadSucessMsg() throws Exception {
		click(locators.DOC_UPLOAD_SUCESS_MSG, "xpath");
	}

	public void verifyCaseDetailsPageisDisplay(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH, "xpath");		
		verifyTextIsPresent(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH,"xpath", "Error Info: Case Details page is not dispaly");
	}

	public void enterIOLeadCaseDetails(String caseID, String filePath, String caseName, String dateAndTime, String invistigationTeam, String priority, String caseData) throws Throwable {
		enterCaseID(caseID, filePath);		
		enterCaseName(caseName);
		//verifyCurrentDate(dateAndTime);
		selectInvistigationTeam(invistigationTeam);
		selectCasePriority(priority);
		enterDetails(caseData);
		clickSave();
	}
	
	public void enterReportingLeadCaseDetails(String caseID, String filePath, String caseName, String dateAndTime, String invistigationLead, String invistigationTeam, String priority, String caseData) throws Throwable {
		enterCaseID(caseID, filePath);		
		enterCaseName(caseName);
		//verifyCurrentDate(dateAndTime);
		selectInvestigationLead(invistigationLead);
		selectInvistigationTeam(invistigationTeam);
		selectCasePriority(priority);
		enterDetails(caseData);
		clickSave();
	}
	
	public void selectInvestigationLead(String leadName) throws Exception {
		sendKeys(locators.INVISTIGATION_LEAD, "xpath", leadName);
		waitForElementAppearance(locators.DROUPDOWN_OPTION + leadName + locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION + leadName + locators.CLOSE_XPATH, "xpath");
	}

	public void caseCreatedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.CASE_CREATED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsPresent(locators.CASE_CREATED_SUCCESS_MESSAGE, "xpath", "Error info: Case created success message is not display");
	}
	
	public void userClicksOnCasesFromTheLeftMenu() throws Exception {
		clickByJS(locators.CASE_LIST, "xpath");
	    
	}

	public void verifyListOfCasesDisplayedAndNewlyCreatedCaseOnTop(String caseID) throws Exception {
		verifyTextIsPresent(locators.VIEW_CASES, "xpath", "Error info: View case Text not present");
		verifyTextIsPresent(locators.CASEID_1+caseID+locators.CASEID_2, "xpath", "Error info: Case created not displayedy");
	}
	
	public void userClciksOnDownloadOfNewlyCreatedCase() throws Throwable {
	  click(locators.DOWNLOAD_PDF, "xpath");
	}
	
	public void clickOniMAGENEcsiLogo() throws Exception {
		click(locators.DASHBOARD, "xpath");
	}
}
