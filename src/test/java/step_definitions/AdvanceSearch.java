package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.ExcelData;
import PageObjects.AdvanceSearchPage;
import PageObjects.CreateNewCasePage;
import Utility.DateAndTimeFunctions;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvanceSearch extends BaseTest {

	public WebDriver driver;
	DateAndTimeFunctions dateAndTime;

	public AdvanceSearch() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, CreateNewCasePage.class);
	}

	CaseData caseData = new CaseData();
	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	AdvanceSearchPage advanceSearch = new AdvanceSearchPage(driver);
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	@When("^Enter case id in search field$")
	public void enterCaseID() throws Throwable {
		String caseId = readAndWrite.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN,
				filePath);
		advanceSearch.enterCaseID(caseId);
	}

	@When("^Click on Search button$")
	public void clickOnSearchButton() throws Throwable {
		advanceSearch.clickOnSearchButton();
	}

	@When("^User mouse hover on Action button$")
	public void clickOnAction() throws Throwable {
		advanceSearch.mousehoverOnActions();
	}

	@When("^User click on View Case details button$")
	public void clickOnCaseDetailsButton() throws Throwable {
		advanceSearch.clickViewCaseDetails();
	}

	@When("^Search with the Case id$")
	public void search_with_the_Case_id() throws Throwable {
		advanceSearch.searchWithCaseId();
	}

	@When("^User click on Advance Search in main menu$")
	public void user_click_on_Advance_Search_in_main_menu() throws Throwable {

		advanceSearch.clickonAdvancesearchButtob();
	}

	@Then("^Verify Case details page is dispalyed$")
	public void verify_Case_details_page_is_dispalyed() throws Throwable {
		advanceSearch.verifyCaseDetailsBasedonId();
	}

	@Then("^Advance search home page should be displayed$")
	public void advance_search_home_page_should_be_displayed() throws Throwable {

		advanceSearch.verifyAdvancesearchText();
	}

	@Then("^Verify Result are displaed based on case id$")
	public void verify_caseidResults() throws Throwable {
		advanceSearch.verifyCaseidinAdvancesearch();
	}

	@Then("^Clear the results$")
	public void clear_the_results() throws Throwable {
		advanceSearch.clickonClearButton();
	}

	@When("^Search with Case name$")
	public void search_with_Case_name() throws Throwable {
		advanceSearch.searchWithCaseName();
	}

	@Then("^Verify Result are displaed based on case name$")
	public void verify_Result_are_displaed_based_on_case_name() throws Throwable {
		advanceSearch.verifyCaseDetailsBasedonName();
	}

	@Then("^Select Initiation from the status dropwon$")
	public void SelectInitiationfromthestatusdropwon() throws Throwable {
		advanceSearch.selectCaseInitiation(CaseData.INITIATION);
	}

	@Then("^Verify displayed results are based on initiation search$")
	public void verify_displayed_results_are_based_on_initiation_search() throws Throwable {
		advanceSearch.verifyInitiationresults();
	}

	@When("^Select Case Priority$")
	public void select_Case_Priority() throws Throwable {

	}

	@Then("^Verify result is displayed based on Priority$")
	public void verify_result_is_displayed_based_on_Priority() throws Throwable {

	}

	@When("^Select From and To date$")
	public void select_From_and_To_date() throws Throwable {

	}

	@Then("^Verify result are dispaled based on date$")
	public void verify_result_are_dispaled_based_on_date() throws Throwable {

	}

	@When("^Select Complete status under status column$")
	public void select_Complete_status_under_status_column() throws Throwable {
		advanceSearch.statusComboBox();

	}

	@Then("^Verify case status should be Complete in case details page$")
	public void verify_case_status_should_be_Complete_in_case_details_page() throws Throwable {
		advanceSearch.verifyCaseStatus();
	}

	@Then("^Verify Add comment link should not be present inside case comments section$")
	public void verify_Add_comment_link_should_not_be_present_inside_case_comments_section() throws Throwable {
		advanceSearch.addCommentLinkCheck();
	}

}
