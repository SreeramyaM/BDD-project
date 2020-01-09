package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.ExcelData;
import PageObjects.LoginPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseTest {

	public WebDriver driver;
	
	public Login() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, LoginPage.class);		
	}
	
	LoginPage login 							= PageFactory.initElements(driver, LoginPage.class);
	ReaderAndWriteDataFromExcel readAndWrite	= new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	@Given("^User navigates to iMAGENEcsi portal$")
	public void user_navigates_to_the_SIT_page() throws Throwable {
		navigate("imgcsiSIT");
		waitForPageToLoad();
	}

	@Given("^User navigates to iMAGENEcsi portal login page$")
	public void user_navigates_to_the_login_page() throws Throwable {
		navigate("imgcsIDev");
		waitForPageToLoad();
	}

	@When("^User click on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		login.clickonLogin();
	}
	
	@When("^User enters Super Admin User Name and Password$")
	public void enterSuperUserNameAndPassword() throws Throwable {
		String superAdminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.SUPER_ADMIN_COLUMN, filePath);
		login.userEntersAdminUserNameAndPassword(superAdminUserName, CaseData.PASSWORD);
	}

	@When("^User enters Admin User Name and Password$")
	public void enterUserNameAndPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_COLUMN, filePath);
		login.userEntersAdminUserNameAndPassword(adminUserName, CaseData.PASSWORD);
	}
	
	@When("^User enters IO Lead User Name and Password$")
	public void enterIOLeadUserNameAndPassword() throws Throwable {
		String ioleadUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_COLUMN, filePath);
		login.userEntersIOleadUserNameAndPassword(ioleadUserName, CaseData.PASSWORD);
	}
	
	@When("^User enters Reporting Lead User Name and Password$")
	public void enterReportingLeadUserNameAndPassword() throws Throwable {
		String reportingLead = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_COLUMN, filePath);
		login.userEntersAdminUserNameAndPassword(reportingLead, CaseData.PASSWORD);
	}
	
	@When("^User enters Reporting Member user Name and Password$")
	public void enterReportingMemberUserNameAndPassword() throws Throwable {
		String reportingLead = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_COLUMN, filePath);
		login.userEntersAdminUserNameAndPassword(reportingLead, CaseData.PASSWORD);
	}
	
	@When("^User enters IO Member User Name and Password$")
	public void enterIOMemberUserNameAndPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_MEMBER_COLUMN, filePath);
		login.userEntersAdminUserNameAndPassword(adminUserName, CaseData.PASSWORD);
	}

	@When("^Enter Admin name and temporay password$")
	public void enterAdminNameAndTempPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_COLUMN, filePath);	
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterAdminUserNameAndTempPsw(adminUserName, tempPassword);
	}
	
	@When("^Enter Super Admin name and temporay password$")
	public void enterSuperAdminNameAndTempPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.SUPER_ADMIN_COLUMN, filePath);	
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterAdminUserNameAndTempPsw(adminUserName, tempPassword);
	}
	
	@When("^Enter Admin training certificate number$")
	public void enterAdminTrainingNumber() throws Throwable {
		String adminCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(adminCirtificateNumber);		
	}
	
	@When("^Enter IO Lead training certificate number$")
	public void enterIOLeadTrainingNumber() throws Throwable {
		String IOLeadCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IOLEAD_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(IOLeadCirtificateNumber);		
	}
	
	
	@When("^Enter Reporting Lead training certificate number$")
	public void enterReportingLeadTrainingNumber() throws Throwable {
		String reportingLeadCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(reportingLeadCirtificateNumber);		
	}
	
	@When("^Enter IO Member training certificate number$")
	public void enterIOMemberTrainingNumber() throws Throwable {
		String ioMemberCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IOMEMBER_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(ioMemberCirtificateNumber);		
	}
	
	@When("^Enter Reporting Member training certificate number$")
	public void enterReportingMemberTrainingNumber() throws Throwable {
		String repoMemberCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(repoMemberCirtificateNumber);		
	}
	
	@When("^Enter IO Lead User Name and Temporay password$")
	public void enterIOLeadNameAndTempPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterIOLeadUserNameAndTempPsw(adminUserName, tempPassword);
	}
	
	@When("^Enter IO Member User Name and Temporay password$")
	public void enterIOMemberNameAndTempPassword() throws Throwable {
		String ioMemberUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_MEMBER_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterIOMemberUserNamePassword(ioMemberUserName, tempPassword);
	}
	
	@When("^Enter Reporting Lead User Name and Temporay password$")
	public void enterReportingLeadNameAndTempPassword() throws Throwable {
		String repoLeadUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterReportingLeadUserNamePassword(repoLeadUserName, tempPassword);
	}
	
	@When("^Enter Reporting Member user name and temporay password$")
	public void enterReportingMemberNameAndTempPassword() throws Throwable {
		String repoMemberUserName = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterReportingMemberUserNamePassword(repoMemberUserName, tempPassword);
	}

	@When("^User click on Logout button$")
	public void click_Logout_Button() throws Throwable {
		login.clickonlogout();
	}

	@When("^IT Config enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void itconfig_enters_and_to_login_page(String userName, String password) throws Throwable {
		login.enterITConfigUserNameAndPassword(userName, password);
	}

	@Then("^Verify IT Config is able to see home page Sucessfully$")
	public void verify_IT_config_HomePage() throws Throwable {
		login.verifyITConfigHomepage();
	}
	
	@When("^Enter IO Lead Email id and click on Go Button$")
	public void enterIOLeadAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter IO Member Email id and click on Go Button$")
	public void enterIOMemberEmailIdAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_MEMBER_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter Reporting Lead Email id and click on Go Button$")
	public void enterReportingLeadEmailIdAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter Reporting Member Email id and click on Go Button$")
	public void enterReportingMemberEmailIdAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter user Email id and click on Go Button$")
	public void enter_userEmail_id_and_click_on_GoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter new password$")
	public void enter_new_password() throws Throwable {
		login.enterNewPassword(CaseData.PASSWORD);
	}
	
	@When("^Enter new passwordset$")
	public void enternewpasswordset() throws Throwable {
		login.enternewpasswordset(CaseData.PASSWORDSET); 
	}
	
	@Then("^Verify User should get into update password screen$")
	public void verify_User_should_get_into_update_password_screen() throws Throwable {
		login.verifyUpdatePasswordPage();
	}

	@When("^Click on Update button$")
	public void Click_Update_button() throws Throwable {
		login.clickOnUpdateBtn();
	}
	
	@When("^User enters case assign Reporting Lead user Name and Password$")
	public void loginToCaseAssignReportingLead() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.AUTO_ASSIGN_REPORTINGLEAD, filePath);
		login.userEntersAdminUserNameAndPassword(emailId, CaseData.PASSWORD);
	}
	
	@When("^Enter IO Member training certificate number2$")
	public void enterIOMemberTrainingNumber2() throws Throwable {
		String ioMemberCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IOMEMBER_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(ioMemberCirtificateNumber);		
	}	
	
	@When("^Enter second IO Member Email id and click on Go Button$")
	public void enterSecondIOMemberEmailIdAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter Second IO Member User Name and Temporay password$")
	public void enterSecondIOMemberNameAndTempPassword() throws Throwable {
		String ioMemberUserName = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterIOMemberUserNamePassword(ioMemberUserName, tempPassword);
	}
	
	@When("^Enter Second IO Lead Email id and click on Go Button$")
	public void enterSeccondIOLeadAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_LEAD_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}	

	@When("^Enter Second IO Lead User Name and Temporay password$")
	public void enterSeccondIOLeadNameAndTempPassword() throws Throwable {
		String adminUserName = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_LEAD_COLUMN, filePath);
		String tempPassword = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		login.enterIOLeadUserNameAndTempPsw(adminUserName, tempPassword);
	}

	@When("^Enter Second IO Lead training certificate number$")
	public void enterSecondIOLeadTrainingNumber() throws Throwable {
		String IOLeadCirtificateNumber = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IOLEAD_TRAINING_NUMBER, filePath);
		login.verifyTrainingNumber(IOLeadCirtificateNumber);		
	}

	@Then("^Click on user profile$")
	public void clickonuserprofile() throws Throwable {
   	    login.clickonuserprofile();
	}

	@Then("^Click on change password link$")
	public void clickonchangepasswordlink() throws Throwable {
       login.clickonchangepasswordlink();
    }

	@Then("^Enter Current password and new password$")
	public void enterCurrentpasswordandnewpassword() throws Throwable {
		login.enterCurrentpasswordandnewpassword(CaseData.PASSWORDSET);
		login.enterCurrentNewPassword(CaseData.PASSWORD);
		login.enterCurrentConfNewPassword(CaseData.PASSWORD);
	}
	
	@Then("^Verify user password updated successfully$")
	public void verify_user_password_updated_successfully() throws Throwable {
		login.verifyPasswordUpdatedSuccessfully();
	}
	
	@When("^User enter Rm User name and password$")
	public void repoLogin() throws Exception {
		String Username=readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.AUTO_IOMEMBER_NAME, filePath);
		login.userEntersAdminUserNameAndPassword(Username, CaseData.PASSWORD);
	}
}
