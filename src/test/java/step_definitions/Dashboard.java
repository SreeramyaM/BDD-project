package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.ExcelData;
import PageObjects.CaseDetialsPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dashboard extends BaseTest {
	public WebDriver driver;

	public Dashboard() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, DashboardPage.class);
	}

	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
	CaseDetialsPage casedetails = PageFactory.initElements(driver, CaseDetialsPage.class);
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	ReaderAndWriteDataFromExcel readData = new ReaderAndWriteDataFromExcel();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	@When("^Verify Dashboard page is display$")
	public void verifyDashboardPageIsDisplay() throws Throwable {
		dashboard.verifyDashboardPageIsDisplay();
	}

	@When("^User click on Dashboard Icon$")
	public void clickOnDashboard() throws Throwable {
		dashboard.clickOnDashboard();
	}

	@When("^Click on New Case in left panel$")
	public void clickNewCaseButton() throws Throwable {
		dashboard.selectNewCase();
	}

	@Then("^Verify case status should be in \"(.*?)\"$")
	public void verifyStatus(String status) throws Throwable {
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		dashboard.verifyCaseStatus(caseId, status);
	}

	@When("^User clicks on View Details link in card layout$")
	public void clickOnViewDetailsButton() throws Throwable {
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		dashboard.clickOnViewDetailsButton(caseId);
	}

	@When("^Verify Assignd case is displayed in his Dashboard$")
	public void verifyAssignedCase() throws Throwable {
		String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		dashboard.verifyAssignedCaseID(caseId);
	}

	@Then("^Verify case is not displayed in Dashboard$")
	public void user_should_not_see_the_case_in_his_dashboard() throws Throwable {
		// String caseId = readData.readingDataFromExcel(ExcelData.CASE_DATA_SHEET,
		// ExcelData.CASE_ID_COLUMN, filePath);
		// dashboard.verifyCaseIsNotDisplay(caseId);
	}

	@When("^Click on Admin in Menu$")
	public void click_Admin_in_Menu() throws Throwable {
		dashboard.clickOnAdminMenu();
	}

	@When("^Click on Super Admin in left panel$")
	public void click_Super_Admin_Panel() throws Throwable {
		dashboard.clickSuperAdminMenu();
	}

	@When("^Click on Add Super Admin under$")
	public void add_Super_Admin() throws Throwable {
		dashboard.clickAddSuperAdminMenu();
	}

	@When("^Click on Add Users under Users in left panel$")
	public void click_Users() throws Throwable {
		dashboard.clickOnAddUsers();
	}
	
	@When("^Click on Manage Users under Users in left panel$")
	public void clickOnManageUsers() throws Throwable {
		dashboard.clickOnManageUsers();
	}
	
	@When("^Click on Add Admin sub menu$")
	public void click_on_Add_Admin() throws Throwable {
		dashboard.clickOnAddAdminButton();
	}

	@When("^Click on Add Team under Teams in left panel$")
	public void selectAddTeamUnderTeams() throws Throwable {
		dashboard.clickOnAddTeamUnderTeams();
	}
	
	@When("^Click on Manage Team under Teams in left panel$")
	public void selectManageTeamUnderTeams() throws Throwable {
		dashboard.clickOnManageTeamUnderTeams();
	}
	
	@When("^User click on Advance Search in left panel$")
	public void clickOnAdvanceSearch() throws Throwable {
		dashboard.clickOnAdvanceSearch();
	}

	@And("^Select \"(.*?)\" from the droupdown$")
	public void selectUserRole(String roleName) throws Throwable {
		
		dashboard.selectUser(roleName);
	}

	@When("^Select Not To Proceed Button and enter comment$")
	public void select_Not_To_Proceed_Button_and_enter_comment() throws Throwable {
		dashboard.clickOnNTP();
		dashboard.enterNTPComment();
		dashboard.clickOnNTPBTN();
	}

	@Then("^Verify the sucess message Case has been successfully updated to NTP$")
	public void verify_the_sucess_message_Case_has_been_successfully_updated_to_NTP() throws Throwable {
		dashboard.verifyNTPSucessMsg();
	}

	@When("^Select DNC Button and enter comment$")
	public void select_DNC_Button_and_enter_comment() throws Throwable {
		dashboard.clickOnDNC();
		dashboard.enterDNCComment();
		dashboard.clickOnDataNonCompliance();
	}

	@Then("^Verify the sucess message Case has been successfully updated to Data non-compliance$")
	public void verify_the_sucess_message_Case_has_been_successfully_updated_to_Data_non_compliance() throws Throwable {
		dashboard.VerifyDNCSucessMsg();
	}

	@When("^Select Suspend Button and enter comment$")
	public void select_Suspend_Button_and_enter_comment() throws Throwable {
		dashboard.clickOnSuspendButton();
		dashboard.enterSuspendComment();
		dashboard.clickOnSuspendButtononcomment();
	}
	
	@When("^Select Resume Button and enter comment$")
	public void select_Resume_Button_and_enter_comment() throws Throwable {
		dashboard.clickOnResumeButton();
		dashboard.enterResumeComment();
		dashboard.clickOnResumeButtonOnComment();
	}

	@Then("^Verify the sucess message Case has been successfully Suspended$")
	public void verify_the_sucess_message_Case_has_been_successfully_Suspended() throws Throwable {
		dashboard.VerifySuspendSucessMsg();
	}

	@Then("^Verify Resume button is present$")
	public void verify_Resume_button_is_present() throws Throwable {
		dashboard.resumebtnPresent();
	}

	@Then("^Verify the sucess message Case has been successfully Resumed$")
	public void verify_the_sucess_message_Case_has_been_successfully_Resumed() throws Throwable {
		dashboard.verifyResumeSucessMsg();
	}

	@Then("^Verify Suspend button is present$")
	public void verify_Suspend_button_is_present() throws Throwable {
		dashboard.suspendbtnPresent();
		
	}
	@When("^Select Cases from Menus$")
	public void select_Cases_from_Menus() throws Throwable {
		dashboard.clickOnCases();
	}
	
	@Then("^Click on Download button$")
	public void click_on_Download_button() throws Throwable {
		dashboard.clickOnDownloadBtn();
	}

	@Then("^verify user details updated successfully validation message$")
	public void verify_user_details_updated_successfully_validation_message() throws Throwable {
		dashboard.toasterUserDetaisUpdated();		
	}

	@Then("^Verify the Case List pdf file is Downaloded$")
	public void verify_the_Case_List_pdf_file_is_Downaloded() throws Throwable {
		dashboard.verifyFileDownload();

	}
	
	@When("^Click on Manage Admin in dashboard$")
	public void click_on_Manage_Admin_in_dashboard() throws Throwable {
		dashboard.manageAdminDasboard();
	}

	@Then("^Verify downloaded file is password protected$")
	public void VerifydownloadedfileisPasswordprotected() throws Throwable {
		dashboard.verifyFileprotected();
	}

	@When("^Click on Teams in Main Menu$")
	public void click_on_Teams_in_Main_Menu() throws Throwable {
		dashboard.teamMenu();		
	}
	
	@When("^Click on edit team under action dropdown$")
	public void click_on_edit_team_under_action_dropdown() throws Throwable {	   
		dashboard.editTeamAdmin();	
	}	
	@When("^Click on Manage Admin sub menu$")
	public void click_on_Manage_Admin_sub_menu() throws Throwable {
		dashboard.manageAdminMenu();
	}

	@When("^Click on Edit under Actions column$")
	public void click_on_Edit_under_Actions_column() throws Throwable {
		dashboard.editAdmin();
	}
}