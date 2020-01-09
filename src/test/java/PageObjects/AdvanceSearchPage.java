package PageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Data.ExcelData;
import Data.CaseData;
import Locators.AdvanceSearch.locators;
import Locators.CreateNewCase;
import Locators.Dashboard;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;

public class AdvanceSearchPage extends BrowserBot {

	public AdvanceSearchPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	ReaderAndWriteDataFromExcel readData = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	public void enterCaseID(String caseID) throws Exception {
		waitForElementAppearance(locators.CASE_ID, "id");
		sendKeys(locators.CASE_ID, "id", caseID);
	}

	public void clickOnSearchButton() throws Exception {
		click(locators.SEARCH_CASE, "xpath");
	}

	public void mousehoverOnActions() throws Exception {
		waitForElementAppearance(locators.ACTION, "xpath");
		click(locators.ACTION, "xpath");
	}

	public void clickViewCaseDetails() throws Exception {
		waitForElementAppearance(locators.VIEW_CASE_DETAILS, "xpath");
		clickByJS(locators.VIEW_CASE_DETAILS, "xpath");
	}

	public void searchWithCaseId() throws Exception {
		waitForElementAppearance(locators.Searchcases_textbox, "xpath");
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		sendKeys(locators.Searchcases_textbox, "xpath", caseId);
		clickByEnterKey(locators.Searchcases_textbox, "xpath");
	}

	public void clickonAdvancesearchButtob() throws Exception {
		waitForElementAppearance(locators.ADVANCE_SEARCH_BUTTON, "xpath");
		clickByJS(locators.ADVANCE_SEARCH_BUTTON, "xpath");
	}

	public void verifyCaseDetailsBasedonId() throws Exception {
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		verifyGetText(Dashboard.locators.VIEW_DETAILS_PART1 + caseId + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE,
				"xpath", caseId);
	}

	public void verifyAdvancesearchText() throws Exception {
		waitForElementAppearance(locators.ADVANCE_SEARCH_TEXT, "xpath");
		verifyTextIsPresent(locators.ADVANCE_SEARCH_TEXT, "xpath", "Error Info: Advance Search page is not displayed");
	}

	public void verifyCaseidinAdvancesearch() throws Exception {
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		verifyGetText(locators.CaseidFirstPart + caseId + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE, "xpath",
				caseId);
	}

	public void statusComboBox() throws Exception {
		waitForElementAppearance(locators.STATUS_COMBOBOX, "xpath");
		sendKeys(locators.STATUS_COMBOBOX, "xpath", CaseData.STATUS_VALUE);
		clickByJS(locators.COMPLETE_TEXT, "xpath");
	}

	public void clickonClearButton() throws Exception {
		waitForElementAppearance(locators.Clear_button, "xpath");
		click(locators.Clear_button, "xpath");
	}

	public void searchWithCaseName() throws Exception {
		waitForElementAppearance(CreateNewCase.locators.CASE_NAME, "id");
		String caseName = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_NAME_COLUMN,
				filePath);
		sendKeys(CreateNewCase.locators.CASE_NAME, "id", caseName);
	}

	public void verifyCaseDetailsBasedonName() throws Exception {
		String caseName = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		verifyGetText(locators.CaseidFirstPart + caseName + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE, "xpath",
				caseName);
	}

	public void selectCaseInitiation(String initiation) throws Exception {
		sendKeys(locators.Status_Dropdown, "xpath", initiation);
		clickByEnterKey(locators.Status_Dropdown, "xpath");
	}

	public void verifyInitiationresults() throws Exception {
		List<WebElement> myList = driver.findElements(By.xpath("//tbody/tr/td[4]"));
		List<String> all_elements_text = new ArrayList<String>();
		for (int i = 0; i < myList.size(); i++) {
			all_elements_text.add(myList.get(i).getText());
			System.out.println(myList.get(i).getText());
			try {
				Assert.assertTrue(all_elements_text.contains("Initiation"), "not matching status");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void verifyCaseStatus() throws Exception {
		waitForElementAppearance(locators.CASE_STATUS_COMPLETE, "xpath");
		verifyTextIsPresent(locators.CASE_STATUS_COMPLETE, "xpath",
				"Error Info: Case status complete is not displayed");
	}

	public void addCommentLinkCheck() throws Exception {
		verifyTextIsNotPresent(locators.ADD_COMMENT_LINK, "xpath", "Error info: Add Comment text is present");
	}
	public void selectPriority(String priority) throws Exception {
		sendKeys(CreateNewCase.locators.PRIORITY, "xpath", priority);
		clickByEnterKey(CreateNewCase.locators.PRIORITY, "xpath");
		
	}

}
