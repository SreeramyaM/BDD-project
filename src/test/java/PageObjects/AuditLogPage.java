package PageObjects;


import org.openqa.selenium.WebDriver;
import Locators.AuditLogs.locators;
import step_definitions.ConfigBrowser;


public class AuditLogPage extends BrowserBot {

	public AuditLogPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}
	
	public void clickOnAuditTrialButton() throws Throwable {
	   click(locators.AUDIT_TRIAL_BUTTON, "xpath"); 
	}
	
	public void verifyAuditTrailPageCaseName() throws Throwable {
		verifyTextIsPresent(locators.AUDIT_TRIAL_CASE_NAME, "xpath", "Error info: View case Text not present");
	}
	
	public void verifyAuditTrailLogFishEyeUpload() throws Throwable {
		verifyTextIsPresent(locators.FISH_EYE_UPLOAD_LOG, "xpath", "Error info: Failed to display AuditTrail");
	}
	
	public void MousehoverOnAction() throws Throwable {
		waitForElementAppearance(locators.ACTION, "xpath");
		click(locators.ACTION, "xpath");
	}

	public void ClciksViewAuditLogs() throws Exception {
		waitForElementAppearance(locators.VIEW_AUDIT_LOGS, "xpath");
		clickByJS(locators.VIEW_AUDIT_LOGS, "xpath");
	}
	public void verifyAuditLogUpdatedForCaseDownload() throws Throwable {
		waitForElementAppearance(locators.CASE_DOWNLOAD_LOG, "xpath");
		verifyTextIsPresent(locators.CASE_DOWNLOAD_LOG, "xpath", "Error info: Failed to display Case download AuditTrail Log");
	}
	public void userClciksOnDownloadButton() throws Throwable {
		waitForElementAppearance(locators.DOWNLOAD, "xpath");
		click(locators.DOWNLOAD, "xpath");
	}
	public void addCommentsAndClcikDownloadButton() throws Throwable {
	    sendKeys(locators.COMMENT_SECTION, "xpath", "Downloading Audit Trial");
	    waitForElementAppearance(locators.PDF_DOWNLOAD, "xpath");
	    click(locators.PDF_DOWNLOAD, "xpath");
	}
	
}