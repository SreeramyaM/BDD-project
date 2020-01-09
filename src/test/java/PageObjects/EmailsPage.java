package PageObjects;

import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Data.ExcelData;
import Locators.Emails.locators;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;

public class EmailsPage extends BrowserBot {

	public EmailsPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(UsersPage.class.getName());
	public String temppwd;
	public static String userName;
	public static String tempPsw;
	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	public void switchToTab(int tabCount) throws Exception {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabCount));
	}

	public void verifyWelcomeEmail() throws Exception {
		if (isElementPresent(locators.WELCOME_EMAIL, "xpath") == false) {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(5000);
				browserRefresh();
				if (isElementPresent(locators.WELCOME_EMAIL, "xpath") == true) {
					break;
				}
			}
		}
	}

	public void verifyCaseCreatedMessage() throws Exception {
		if (isElementPresent(locators.WELCOME_EMAIL, "xpath") == false) {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(5000);
				browserRefresh();
				if (isElementPresent(locators.WELCOME_EMAIL, "xpath") == true) {
					break;
				}
			}
		}
	}

	public void getTemporaryPassword(int tabCount) throws Exception {
		if (isElementPresent(locators.lOGIN_DETAILS_EMAIL, "xpath") == false) {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(5000);
				browserRefresh();
				if (isElementPresent(locators.lOGIN_DETAILS_EMAIL, "xpath") == true) {
					break;
				}
			}
		}
		click(locators.lOGIN_DETAILS_EMAIL, "xpath");
		logger.info("Sucessfully Verified  USer recevied Login Details Email");
		switchToFrameById("msg_body");
		tempPsw = getText(locators.TEMP_PASSWORD, "xpath");
		readAndWrite.writeDataToExcelFile(tempPsw, ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.TEMP_PASSWORD, filePath);
		switchToTab(tabCount);
	}
	
	public void verifyCaseCreatedEmail() throws Exception {
		click(locators.CASE_CREATED, "xpath");
	}

	public void clickOnCaseCreatedNotification() throws Exception {
		click(locators.CASE_CREATED, "xpath");
	}
	
}
