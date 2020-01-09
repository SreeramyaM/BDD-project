package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.EmailData;
import Data.ExcelData;
import PageObjects.EmailsPage;
import PageObjects.LoginPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Emails extends BaseTest {

	public WebDriver driver;

	public Emails() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, LoginPage.class);		
	}
	
	EmailsPage email                                 = new EmailsPage(driver);
	LoginPage login 							= PageFactory.initElements(driver, LoginPage.class);
	ReaderAndWriteDataFromExcel readAndWrite	= new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	@When("^User navigates to Mailinator\\.com$")
	public void user_navigates_to_Mailinator_com() throws Throwable {
		login.openNewTab();
		navigate("malinator");
	}

	@When("^Enter Admin Email id and click on Go Button$")
	public void enterAdminEmialAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}
	
	@When("^Enter Super Admin Email id and click on Go Button$")
	public void enterSuperAdminEmialAndClickGoButton() throws Throwable {
		String emailId = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.SUPER_ADMIN_COLUMN, filePath);
		login.enterUserNameInMailinator(emailId);
		login.clickOnGoButton();
	}

	@Then("^Verify user should get Welcome email$")
	public void verify_user_should_get_Welcome_email() throws Throwable {
		email.verifyWelcomeEmail();
	}

	@Then("^Verify user should get login credentials email$")
	public void verify_user_should_get_login_credentials_email() throws Throwable {
		email.getTemporaryPassword(EmailData.COUNT_ZERO);
	}

	@Then("^Verify case created email notification is received$")
	public void verifyCaseCreatedEmailNotification() throws Throwable {
		email.verifyCaseCreatedEmail();
	}
	
}
