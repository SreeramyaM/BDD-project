package PageObjects;

import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import step_definitions.ConfigBrowser;
import Locators.Login.locators;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;

public class LoginPage extends BrowserBot {

	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	private static final Logger logger = LogManager.getLogger(LoginPage.class.getName());
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	public void userEntersAdminUserNameAndPassword(String adminUserName, String password) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", adminUserName);
		sendKeys(locators.PASSWORD, "id", password);
	}

	public void enterITConfigUserNameAndPassword(String userName, String password) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", userName);
		sendKeys(locators.PASSWORD, "id", password);
	}

	public void userEntersIOleadUserNameAndPassword(String ioleadUserName, String password) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", ioleadUserName);
		sendKeys(locators.PASSWORD, "id", password);
	}

	public void clickonLogin() throws Exception {
		waitForElementAppearance(locators.LOGIN, "xpath");
		clickByJS(locators.LOGIN, "xpath");
	}

	public void clickonlogout() throws Exception {
		waitForElementAppearance(locators.LOGOUT, "xpath");
		clickByJS(locators.LOGOUT, "xpath");
		logger.info("Clicked on logout");
	}

	public void VerifyLogout() throws Exception {
		waitForElementAppearance(locators.LOGOUT, "xpath");
		verifyTextIsPresent(locators.LOGOUT_SUCCESS_MESSAGE, "xpath", "Error info: Logout is not success");
		logger.info("Sucessfully Verified logout message");
	}

	public void verifyITConfigHomepage() throws Exception {
		waitForElementAppearance(locators.IT_CONFIG_HOME_PAGE, "xpath");
		verifyTextIsPresent(locators.IT_CONFIG_HOME_PAGE, "xpath", "Error info: Home page is not display");
	}

	public void verifyForgotPasswordPage() throws Exception {
		waitForElementAppearance(locators.FORGOT_PASSWORD_PAGE, "xpath");
		verifyTextIsPresent(locators.FORGOT_PASSWORD_PAGE, "xpath", "Error info: Forgot password page is not display");
	}

	public void enterAdminUserNameAndTempPsw(String adminUserName, String tempPassword) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", adminUserName);
		sendKeys(locators.PASSWORD, "id", tempPassword);
	}

	public void verifyTrainingNumber(String trainingNumber) throws Exception {
		verifyTrainingMessage();
		clickOnYes();
		enterTrainingNumber(trainingNumber);
		clikcVerify();
	}

	public void clickOnYes() throws Exception {
		waitForElementAppearance(locators.YES, "id");
		click(locators.YES, "id");
	}

	public void enterTrainingNumber(String trainingNumber) throws Exception {
		waitForElementAppearance(locators.CIRTIFICATE_NUMBER, "id");
		sendKeys(locators.CIRTIFICATE_NUMBER, "id", trainingNumber);
	}

	public void clikcVerify() throws Exception {
		waitForElementAppearance(locators.VERIFY, "id");
		click(locators.VERIFY, "id");
	}

	public void verifyTrainingMessage() throws Exception {
		waitForElementAppearance(locators.TRAINING_MESSAGE, "xpath");
		verifyTextIsPresent(locators.TRAINING_MESSAGE, "xpath", "Training message is not display");
	}

	public void enterIOLeadUserNameAndTempPsw(String adminUserName, String tempPassword) throws Exception {
		sendKeys(Locators.Login.locators.EMAIL_ID, "id", adminUserName);
		sendKeys(Locators.Login.locators.PASSWORD, "id", tempPassword);
	}

	public void enterIOMemberUserNamePassword(String ioMemberUserName, String tempPassword) throws Exception {
		waitForElementAppearance(locators.EMAIL_ID, "id");
		sendKeys(locators.EMAIL_ID, "id", ioMemberUserName);
		sendKeys(locators.PASSWORD, "id", tempPassword);
	}

	public void enterReportingLeadUserNamePassword(String repoLeadUserName, String tempPassword) throws Exception {
		waitForElementAppearance(locators.EMAIL_ID, "id");
		sendKeys(locators.EMAIL_ID, "id", repoLeadUserName);
		sendKeys(locators.PASSWORD, "id", tempPassword);
	}

	public void enterReportingMemberUserNamePassword(String repoMemberUserName, String tempPassword) throws Exception {
		waitForElementAppearance(locators.EMAIL_ID, "id");
		sendKeys(locators.EMAIL_ID, "id", repoMemberUserName);
		sendKeys(locators.PASSWORD, "id", tempPassword);
	}

	public void openNewTab() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void enterUserNameInMailinator(String useremailid) throws Exception {
		waitForElementAppearance(locators.MAILINATOR_EMIAL_FIELD, "xpath");
		sendKeys(locators.MAILINATOR_EMIAL_FIELD, "xpath", useremailid);
	}

	public void clickOnGoButton() throws Exception {
		click(locators.GO_BUTTON, "xpath");
	}

	public void verifyUpdatePasswordPage() throws Exception {
		isElementPresent(locators.UPDATE_PASSWORD_PAGE, "xpath");
	}

	public void enterNewPassword(String newPwd) throws Exception {
		waitForElementAppearance(locators.NEW_PASSWORD, "id");
		sendKeys(locators.NEW_PASSWORD, "id", newPwd);
		sendKeys(locators.CONFIRM_PASSWORD, "id", newPwd);
	}

	public void enternewpasswordset(String newPwdSet) throws Throwable {
		waitForElementAppearance(locators.NEW_PASSWORD, "id");
		sendKeys(locators.NEW_PASSWORD, "id", newPwdSet);
		sendKeys(locators.CONFIRM_PASSWORD, "id", newPwdSet);
	}

	public void clickOnUpdateBtn() throws Exception {
		clickByJS(locators.UPDATE_BUTTON, "xpath");
	}

	public void clickOnForgotpwdicon() throws Exception {
		click(locators.FORGOT_PASSWORD, "xpath");
	}

	public void enterUsername(String userName) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", userName);
	}

	public void clickonuserprofile() throws Throwable {
		waitForElementAppearance(locators.USER_PROFILE, "xpath");
		clickByJS(locators.USER_PROFILE, "xpath");
	}

	public void clickonchangepasswordlink() throws Throwable {
		waitForElementAppearance(locators.CHANGE_PASSWORD, "xpath");
		clickByJS(locators.CHANGE_PASSWORD, "xpath");
	}

	public void enterCurrentpasswordandnewpassword(String curPwd) throws Throwable {
		waitForElementAppearance(locators.CURRENT_PASSWORD, "id");
		sendKeys(locators.CURRENT_PASSWORD, "id", curPwd);
	}

	public void enterCurrentNewPassword(String curPwd1) throws Throwable {
		waitForElementAppearance(locators.CUR_NEW_PASSWORD, "xpath");
		sendKeys(locators.CUR_NEW_PASSWORD, "xpath", curPwd1);
	}

	public void enterCurrentConfNewPassword(String curPwd2) throws Throwable {
		waitForElementAppearance(locators.CUR_CONF_PASSWORD, "xpath");
		sendKeys(locators.CUR_CONF_PASSWORD, "xpath", curPwd2);
	}

	public void clickSubmit() throws Exception {
		waitForElementAppearance(locators.SUBMIT, "xpath");
		waitForElementToBeClickable(locators.SUBMIT, "xpath");
		clickByJS(locators.SUBMIT, "xpath");
	}

	public void verifyPasswordUpdatedSuccessfully() throws Throwable {
		waitForElementAppearance(locators.PASSWORD_UPDATE_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.PASSWORD_UPDATE_SUCCESS_MSG, "xpath",
				"Error info: New password should not be same as the current password. ");
		verifyTextIsPresent(locators.PASSWORD_UPDATE_SUCCESS_MSG, "xpath",
				"Kindly enter a different new password. Your password should be different from last three passwords. ");
		verifyTextIsPresent(locators.PASSWORD_UPDATE_SUCCESS_MSG, "xpath",
				"Error info: New password and Confirm new password does not match! ");
	}
}