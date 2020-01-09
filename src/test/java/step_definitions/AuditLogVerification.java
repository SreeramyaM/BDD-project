package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;
import Locators.AuditLogs.locators;
import Utility.DateAndTimeFunctions;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuditLogVerification extends BaseTest {
	
	public WebDriver driver;

	public AuditLogVerification() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, PageObjects.AuditLogPage.class);
    }

	PageObjects.AuditLogPage AuditLogPage                         = PageFactory.initElements(driver, PageObjects.AuditLogPage.class);
	ReaderAndWriteDataFromExcel readAndWrite 	                  = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		                  = new ReadPropertyFiles();
	String filePath                                               = readPropertyFiles.pathToUploadFile("CaseData");
	String time     							                  = DateAndTimeFunctions.getCurrentTime("h:mm a");
	
	@Then("^Click on Audit Trial button$")
	public void clickOnAuditTrialButton() throws Throwable {
		AuditLogPage.clickOnAuditTrialButton();
	}

	@Then("^Verify Audit Trail page displayed with case name$")
	public void verifyAuditTrailPageCaseName() throws Throwable {
		AuditLogPage.verifyTextIsPresent(locators.AUDIT_TRIAL_CASE_NAME, "xpath", "Error info: Failed to display AuditTrail");
	}

	@Then("^Verify Audit Trail showing a Log for FishEye image upload$")
	public void verifyAuditTrailLogFishEyeUpload() throws Throwable {
		AuditLogPage.verifyTextIsPresent(locators.FISH_EYE_UPLOAD_LOG, "xpath", "Error info: Failed to display AuditTrail");
	}

	@When("^User Mousehover on Action and clciks on View Audit Logs$")
	public void MousehoverOnActionAndClciksViewAuditLogs() throws Throwable {
		AuditLogPage.MousehoverOnAction();
		Thread.sleep(5000);
		AuditLogPage.ClciksViewAuditLogs();
	}

	@Then("^Verify new audit log updated for case download$")
	public void verifyAuditLogUpdatedForCaseDownload() throws Throwable {
		AuditLogPage.verifyAuditLogUpdatedForCaseDownload();
	}

	@When("^user clicks on Download button$")
	public void userClciksOnDownloadButton() throws Throwable {
		AuditLogPage.userClciksOnDownloadButton();
	}
    
	@When("^Add Comments and clcik on Download button$")
	public void addCommentsAndClcikDownloadButton() throws Throwable {
		AuditLogPage.addCommentsAndClcikDownloadButton();
	}
	
	@Then("^Verify Audit logs downloaded successfully$")
	public void verify_Audit_logs_downloaded_successfully() throws Throwable {
	    
	}
	
	
	
}
