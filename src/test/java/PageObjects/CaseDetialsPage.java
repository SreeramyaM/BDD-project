package PageObjects;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import Data.CaseData;
import Locators.CaseDetails.locators;
import Locators.CreateNewCase;
import Utility.ReadPropertyFiles;
import step_definitions.ConfigBrowser;

public class CaseDetialsPage extends BrowserBot {

	public CaseDetialsPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	ReadPropertyFiles readPropertyFiles 			 = new ReadPropertyFiles();
	String exePath                                   = readPropertyFiles.pathToUploadFile("FisheyUploadExe");

	public void verifyCaseDetailsPageisDisplay(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_DETAILS_PAGE, "xpath");
		waitForElementAppearance(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: Case Details page is not dispaly");
	}

	public void verifyErrorMessageForFishEyeImages() throws Exception {
		waitForElementAppearance(locators.MIN_FISHEYE_VALIDATION_MSG, "xpath");
		verifyTextIsPresent(locators.MIN_FISHEYE_VALIDATION_MSG, "xpath", "Error Info: Error message is not dispaly");
	}

	public void selectSubmitButton() throws Exception {
		waitForElementAppearance(locators.SUBMIT, "xpath");
		clickByJS(locators.SUBMIT, "xpath");
	}

	public void selectFishEyeImages(String[] imageCount) throws Exception {
		waitForElementAppearance(locators.FISHEYE_IMAGES_COUNT_PART1 + imageCount + locators.FISHEYE_IMAGES_COUNT_PART2,
				"xpath");
		clickByJS(locators.FISHEYE_IMAGES_COUNT_PART1 + imageCount + locators.FISHEYE_IMAGES_COUNT_PART2, "xpath");
	}

	public void verifyUploadedFishEyeImages(String[] imagesName) throws Exception {
		for (int i = 0; i < imagesName.length; i++) {
			waitForElementAppearance(locators.IMAGE_NAME_PART1 + i + CreateNewCase.locators.CLOSE_XPATH, "xpath");
			verifyTextIsPresent(locators.IMAGE_NAME_PART1 + i + CreateNewCase.locators.CLOSE_XPATH, "xpath",
					"Uploaded images are not display");
		}
	}

	public void clickOnUploadButton() throws Exception {
		waitForElementAppearance(locators.UPLOAD_BUTTON, "xpath");
		waitForElementToBeClickable(locators.UPLOAD_BUTTON, "xpath");
		click(locators.UPLOAD_BUTTON, "xpath");
	}

	public void clickSubmit() throws Exception {
		waitForElementAppearance(locators.SUBMIT, "xpath");
		waitForElementToBeClickable(locators.SUBMIT, "xpath");
		clickByJS(locators.SUBMIT, "xpath");
	}

	public void clickProcessed() throws Exception {
		waitForElementToBeClickable(locators.PROCESSED, "xpath");
		clickByJS(locators.PROCESSED, "xpath");
		waitForElementAppearance(locators.THANK_YOU_FOR_SUBMITTING, "xpath");
		verifyTextIsPresent(locators.THANK_YOU_FOR_SUBMITTING, "xpath",
				"Error info: success message is not display in the top");
	}

	public void clickAssign() throws Exception {
		waitForElementAppearance(locators.ASSIGN, "xpath");
		click(locators.ASSIGN, "xpath");
	}

	public void verifyAssignedRepoOfficer(String reportingOfficer) throws Exception {
		waitForElementAppearance(locators.REPORTING_OFFICER + reportingOfficer + CreateNewCase.locators.CLOSE_XPATH,
				"xpath");
		verifyTextIsPresent(locators.REPORTING_OFFICER + reportingOfficer + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: Reporting Lead is not display");
	}

	public void selectFileType(String fileType) throws Exception {
		waitForElementAppearance(locators.SELECT_FILE_TYPE, "xpath");
		sendKeys(locators.SELECT_FILE_TYPE, "xpath", fileType);
		clickByEnterKey(locators.SELECT_FILE_TYPE, "xpath");
	}

	public void clickOnBrowse() throws Exception {
		waitForElementAppearance(locators.BROWSE, "id");
		clickByJS(locators.BROWSE, "id");
	}

	public void clickOnBrowseInUploadReport() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOAD_BROWSE, "xpath");
		waitForElementToBeClickable(locators.FILE_UPLOAD_BROWSE, "xpath");
		Thread.sleep(3000);
		clickByJS(locators.FILE_UPLOAD_BROWSE, "xpath");
	}

	public void uploadFile() throws Exception {
		waitForElementAppearance(locators.UPLOAD_FILE, "xpath");
		waitForElementToBeClickable(locators.UPLOAD_FILE, "xpath");
		clickByJS(locators.UPLOAD_FILE, "xpath");
	}

	public void verifyFileUploadedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsPresent(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath",
				"Error info: File Uploaded Success message is not display");
		waitForInvisibleOfElement(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath");
	}

	public void uploadDocument(String fileType, String file) throws Exception {
		selectFileType(fileType);
		clickOnBrowse();
		uploadFileUsingRobot(file);
		uploadFile();
		waitForInvisibleOfElement(locators.DOC_UPLOADED_SUCCESS_MSG, "xpath");
	}

	public void uploadDocuments(String fileType, String[] fisheyeUpload) throws Exception {
		for (int i = 0; i < fisheyeUpload.length; i++) {
			selectFileType(fileType);
			clickOnBrowse();
			uploadFileUsingRobot(fisheyeUpload[i]);
			uploadFile();
			waitForInvisibleOfElement(locators.SPINNER, "xpath");
			waitForInvisibleOfElement(locators.DOC_UPLOADED_SUCCESS_MSG, "xpath");
		}
	}

	public void uploadURL(String fileType, String url) throws Exception {
		selectFileType(fileType);
		enterURLAndUpload(url);
		saveURL();
	}

	public void verifyAcceptDNCDownloadButtons() throws Exception {
		waitForElementAppearance(locators.DATA_NON_COMPLIANCE, "id");
		verifyTextIsPresent(locators.DATA_NON_COMPLIANCE, "id",
				"Error info: Data Non Compliance button is not display");
		verifyTextIsPresent(locators.ACCEPT, "id", "Error info: Accept button is not display");
		verifyTextIsPresent(locators.DOWNLOAD, "id", "Error info: Data Non Compliance button is not display");
	}

	public void verifyAlertMessageBody() throws Exception {
		waitForElementAppearance(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath");
		verifyTextIsPresent(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath",
				"Error info: Alert Pop up is not display");
		clickByJS(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath");
	}

	public void clickOnBack() throws Exception {
		waitForElementAppearance(locators.BACK, "xpath");
		clickByJS(locators.BACK, "xpath");
	}

	public void enterURLAndUpload(String url) throws Exception {
		waitForElementAppearance(locators.URL, "xpath");
		sendKeys(locators.URL, "xpath", url);
	}

	public void saveURL() throws Exception {
		waitForElementAppearance(locators.SAVE_URL, "xpath");
		click(locators.SAVE_URL, "xpath");
		waitForElementAppearance(locators.URL_SAVED_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.URL_SAVED_SUCCESS_MSG, "xpath", "URL Saved success message is not display");
	}

	public void selectReportingLead(String reportingLead) throws Exception {
		waitForElementAppearance(locators.ASSIGN, "xpath");
		sendKeys(locators.REPORTING_LEAD_INPUT, "xpath", reportingLead);
		waitForElementAppearance(locators.REPORTING_LEAD + reportingLead + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		clickByJS(locators.REPORTING_LEAD + reportingLead + CreateNewCase.locators.CLOSE_XPATH, "xpath");
	}

	public void selectReportingMember(String reportingMember) throws Exception {
		waitForElementAppearance(locators.ASSIGN, "xpath");
		sendKeys(locators.REPORTING_MEMBER_INPUT, "xpath", reportingMember);
		waitForElementAppearance(locators.REPORTING_LEAD + reportingMember + CreateNewCase.locators.CLOSE_XPATH,
				"xpath");
		clickByJS(locators.REPORTING_LEAD + reportingMember + CreateNewCase.locators.CLOSE_XPATH, "xpath");
	}

	public void clickOnDownload() throws Exception {
		waitForElementAppearance(locators.DOWNLOAD, "id");
		clickByJS(locators.DOWNLOAD, "id");
	}

	public void clickOnAccept() throws Exception {
		waitForElementAppearance(locators.ACCEPT, "id");
		clickByJS(locators.ACCEPT, "id");
	}

	public void verifyAcceptButtonIsNotDisplay() throws Exception {
		verifyTextIsNotPresent(locators.ACCEPT, "id", "Error Info: Accept Button is display");
	}

	public void uploadZipFolder(String zipFile) throws Exception {
		clickOnUploadReport();
		selectBrowse();
		uploadZIPFolder(zipFile);
		clickOnUploadButton();
	}

	public void clickOnReportsButton() throws Exception {
		waitForElementAppearance(locators.REPORT, "xpath");
		clickByJS(locators.REPORT, "xpath");
	}

	public void clickOnUploadReport() throws Exception {
		waitForElementAppearance(locators.UPLOAD_REPORT, "xpath");
		clickByJS(locators.UPLOAD_REPORT, "xpath");
	}

	public void selectBrowse() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOAD_BROWSE, "id");
		clickByJS(locators.FILE_UPLOAD_BROWSE, "id");
	}

	public void uploadZIPFolder(String zipFile) throws Exception {
		uploadFileUsingRobot(zipFile);
	}

	public void verifyPreviewMsg() throws Exception {
		waitForElementAppearance(locators.UPLOAD_ZIP_FOLDER_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.UPLOAD_ZIP_FOLDER_SUCCESS_MSG, "xpath",
				"Error info: Preview message is not display");
	}

	public void submitReport() throws Exception {
		waitForElementAppearance(locators.SUBMIT_REPORT, "xpath");
		clickByJS(locators.SUBMIT_REPORT, "xpath");
	}

	public void reportSubmitedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsPresent(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath",
				"Error info: Report Submited Success message is not display");
	}

	public void verifyCaseStatusInCaseDetailsPage(String status) throws Exception {
		System.out.println(locators.STATUS + status + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE);
		waitForElementAppearance(locators.STATUS + status + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE, "xpath");
		verifyTextIsPresent(locators.STATUS + status + CreateNewCase.locators.CLOSE_XPATH_WITH_BRACE, "xpath",
				"Error info: Appropriate statsus is not display");
	}

	public void clickOnCloseCaseButton() throws Exception {
		waitForElementAppearance(locators.CLOSE_BUTTON, "xpath");
		clickByJS(locators.CLOSE_BUTTON, "xpath");
	}

	public void verifyCommentBox() throws Exception {
		isElementPresent(locators.COMMENT_BOX_MESSAGE, "XPATH");
	}

	public void enterComment() throws Exception {
		sendKeys(locators.CLOSECASE_COMMENT, "xpath", "Your report is accepted/Revised");
	}

	public void clickOnCloseButton() throws Exception {
		isElementPresent(locators.CLOSE, "XPATH");
		clickByJS(locators.CLOSE, "xpath");
	}

	public void reviseReportButton() throws Exception {
		isElementPresent(locators.REVISE_REPORT_BUTTON, "xpath");
		clickByJS(locators.REVISE_REPORT_BUTTON, "xpath");
	}

	public void reviseInRevisePopup() throws Exception {
		isElementPresent(locators.REVISE_IN_REVISE_POPUP, "xpath");
		clickByJS(locators.REVISE_IN_REVISE_POPUP, "xpath");
	}

	public void enterReviseComment(String reviseComment) throws Exception {
		waitForElementAppearance(locators.REVISE_COMMENT, "id");
		sendKeys(locators.REVISE_COMMENT, "id", "reviseComment");
	}

	public void enterAdditionalSoftwareDetails(String sticker_Version, String vt_Version) throws Exception {
		enterStickerVersion(sticker_Version);
		enterStickerDate();
		enterVTVersion(vt_Version);
		enterVTDate();
	}

	public void enterStickerVersion(String sticker_Version) throws Exception {
		waitForElementAppearance(locators.STICKER_VERSION, "id");
		sendKeys(locators.STICKER_VERSION, "id", sticker_Version);
	}

	public void enterStickerDate() throws Exception {
		waitForElementAppearance(locators.STICKER_DATE, "xpath");
		click(locators.STICKER_DATE, "xpath");
		waitForElementAppearance(locators.CURRENT_DATE, "xpath");
		click(locators.CURRENT_DATE, "xpath");
	}

	public void enterVTDate() throws Exception {
		waitForElementAppearance(locators.REPORT_DATE, "xpath");
		click(locators.REPORT_DATE, "xpath");
		click(locators.CURRENT_DATE, "xpath");
	}

	public void enterVTVersion(String vt_Version) throws Exception {
		sendKeys(locators.VTVERSION, "id", vt_Version);
	}

	public void reportAccepted() throws Exception {
		waitForElementAppearance(locators.REPORT_ACCEPTD_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.REPORT_ACCEPTD_SUCCESS_MSG, "xpath",
				"Error Info: Report Acceptd success Message is not display");
	}

	public void clickCompleteButton() throws Exception {
		waitForElementAppearance(locators.COMPLETE, "xpath");
		clickByJS(locators.COMPLETE, "xpath");
	}

	public void closeCaseComment(String comment) throws Exception {
		waitForElementAppearance(locators.CASE_CLOSE_MESSAGE, "xpath");
		verifyTextIsPresent(locators.CASE_CLOSE_MESSAGE, "xpath", "Error Info: Close case message is not display");
		sendKeys(locators.CLOSE_CASE_COMMENT, "xpath", comment);
	}

	public void clickComplete() throws Exception {
		waitForElementAppearance(locators.COMPLETE_BUTTON, "xpath");
		clickByJS(locators.COMPLETE_BUTTON, "xpath");
	}

	public void clickOnCaseCommentAccordion() throws Exception {
		scrollToElement(locators.CASE_COMMENT_EXPANSION, "xpath");
		waitForElementAppearance(locators.CASE_COMMENT_EXPANSION, "xpath");
		clickByJS(locators.CASE_COMMENT_EXPANSION, "xpath");
	}

	public void verifyAddComment() throws Exception {
		waitForElementAppearance(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsNotPresent(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath",
				"Error info: Add Comment text is not present");
	}

	public String getReportingLeadName() throws Exception {
		waitForElementAppearance(locators.REPORTING_OFFICER_NAME, "xpath");
		String reportingOfficer = getText(locators.REPORTING_OFFICER_NAME, "xpath");
		System.out.println(reportingOfficer);
		return reportingOfficer;
	}

	public void superAdminAddedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.SUPER_ADMIN_CREATED_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.SUPER_ADMIN_CREATED_SUCCESS_MSG, "xpath",
				"Error info: Success message is not display");
	}

	public void clickFishEyeDroupDown() throws Exception {
//		waitForInvisibleOfElement(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath");
		waitForElementAppearance(locators.FISHEYE_DROUPDOWN, "id");
		click(locators.FISHEYE_DROUPDOWN, "id");
	}

	public void clickMoveToFolder() throws Exception {
		waitForElementAppearance(locators.MOVE_TO_FOLDER, "xpath");
		clickByJS(locators.MOVE_TO_FOLDER, "xpath");
		
	}

	public void createNewStation() throws Exception {
		waitForElementAppearance(locators.CREATE_NEW, "xpath");
		click(locators.CREATE_NEW, "xpath");
	}

	public void addStation() throws Exception {
		waitForElementAppearance(locators.ADD_STATION_PLUS_ICON, "xpath");
		click(locators.ADD_STATION_PLUS_ICON, "xpath");
	}

	public void aliasAndStationName(String name, String alias) throws Exception {
		waitForElementAppearance(locators.STATION_NAME, "id");
		sendKeys(locators.STATION_NAME, "id", name);
		System.out.println(name);
		sendKeys(locators.ALIAS_NAME, "id", alias);
	}

	public void addStationBtn() throws Exception {
		clickByJS(locators.ADD_STATION, "xpath");
		waitForInvisibleOfElement(locators.FISH_EYE_VALIDATION_MSG, "xpath");
	}

	public void selectFishEyeImgesCheckBox(String[] fisheyeImages) throws Exception {
		int count = 0;
		for (int i = 0; i < fisheyeImages.length; i++) {
			System.out.println(locators.IMAGE_NAME_PART1 + fisheyeImages[i] + locators.IMAGE_NAME_PART2);
			mouseOverByActions(locators.IMAGE_NAME_PART1 + fisheyeImages[i] + locators.IMAGE_NAME_PART2, "xpath");
			System.out.println(locators.FISH_EYE_IMAGE_PART1 + count + locators.FISH_EYE_IMAGE_PART2);
			click(locators.FISH_EYE_IMAGE_PART1 + count + locators.FISH_EYE_IMAGE_PART2, "xpath");
			count++;
		}
	}

	public void selectStationName(String stationName) throws Exception {
		waitForElementAppearance(locators.STATION_NAME_PART1 + stationName + locators.STATION_NAME_PART2, "xpath");
		click(locators.STATION_NAME_PART1 + stationName + locators.STATION_NAME_PART2, "xpath");
	}

	public void clickStationPlusIcon() throws Exception {
		waitForElementToBeClickable(locators.STATION_NAME_ADD, "xpath");
		clickByJS(locators.STATION_NAME_ADD, "xpath");
	}

	public void verifyAddedImagesToStation(String[] images) throws Exception {
		for (int i = 0; i < images.length; i++) {
			System.out.println(locators.IMAGE_NAME_PART1 + images[i] + locators.IMAGE_NAME_PART2);
			verifyTextIsPresent(locators.IMAGE_NAME_PART1 + images[i] + locators.IMAGE_NAME_PART2, "xpath",
					"Added Images are not display in station");
		}
	}

	public void fishEyeValidationMsg() throws Exception {
		verifyTextIsPresent(locators.FISH_EYE_VALIDATION_MSG, "xpath",
				"Minimum 4 images should be present in each station is not display");
		clickByJS(locators.FISH_EYE_VALIDATION_MSG, "xpath");
	}

	public void reportLogVersion() throws Exception {
		waitForElementAppearance(locators.REPORT_LOG, "xpath");
		verifyTextIsPresent(locators.REPORT_LOG, "xpath", "Appropriate Log version is not display");
	}

	public void softwareVersions(String date) throws Exception {
		System.out.println(locators.SOFTWARE_VERSION_PART1 + date + locators.FISH_EYE_IMAGE_PART2);
		waitForElementAppearance(locators.SOFTWARE_VERSION_PART1 + date + locators.FISH_EYE_IMAGE_PART2, "xpath");
		verifyTextIsPresent(locators.SOFTWARE_VERSION_PART1 + date + locators.FISH_EYE_IMAGE_PART2, "xpath",
				"Software version is not display");
		verifyTextIsPresent(locators.SOFTWARE_VERSION_PART2 + date + locators.FISH_EYE_IMAGE_PART2, "xpath",
				"Software version is not display");
	}

	public void addComment()throws Exception {
		waitForElementAppearance(locators.ADD_COMMENTS, "xpath");
		clickByJS(locators.ADD_COMMENTS, "xpath");
		waitForElementAppearance(locators.CLOSECASE_COMMENT, "xpath");
		sendKeys(locators.CLOSECASE_COMMENT, "xpath", CaseData.CASE_COMMENT);
		waitForElementAppearance(locators.ADD_COMMENT_POPUP, "xpath");
		click(locators.ADD_COMMENT_POPUP, "xpath");
	}

	public void verifyReportLogstatusVersionOne(String status) throws Exception {
		System.out.println(locators.REPORTS_LOG_VERSION1);
		String status1 = getText(locators.REPORTS_LOG_VERSION1, "xpath");
		System.out.println(status1);
		assertEquals(status1, status);
	}

	public void verifyReportLogstatusVersionTwo(String status) throws Exception {
		System.out.println(locators.REPORTS_LOG_VERSION2);
		String status1 = getText(locators.REPORTS_LOG_VERSION2, "xpath");
		System.out.println(status1);
		assertEquals(status1, status);
	}

	public void ioLeadreportSubmittedSuccessMsg() throws Exception {
		waitForElementAppearance(locators.REPORT_SUBMITTED_TO_IO_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.REPORT_SUBMITTED_TO_IO_SUCCESS_MSG, "xpath",
				"Report has been successfully submitted to the Investigation Lead! Is not display");
	}

	public void verifyCaseCommentSuccessMessage() throws Exception {
		waitForElementAppearance(locators.CASE_COMMT_MSG, "xpath");
		verifyTextIsPresent(locators.CASE_COMMT_MSG, "xpath",
				"Error info: Team Updated success message is not display");
	}

	public void addCommentFishEye() throws Exception {
		scrollToElement(locators.ADD_NOTES, "xpath");
		waitForElementAppearance(locators.ADD_NOTES, "xpath");
		clickByJS(locators.ADD_NOTES, "xpath");
		waitForElementAppearance(locators.ADD_NOTES_TEXT_BOX, "xpath");
		sendKeys(locators.ADD_NOTES_TEXT_BOX, "xpath", CaseData.CASE_COMMENT);
		waitForElementAppearance(locators.ADD_NOTES_POPUP, "xpath");
		click(locators.ADD_NOTES_POPUP, "xpath");
	}

	public void clickonreportcomment() throws Exception {
		scrollToElement(locators.REPORT_COMMENT, "xpath");
		waitForElementAppearance(locators.REPORT_COMMENT, "xpath");
		click(locators.REPORT_COMMENT, "xpath");
	}

	public void reportAddcomment() throws Exception {
		waitForElementAppearance(locators.REPORT_ADD_COMMENT, "xpath");
		click(locators.REPORT_ADD_COMMENT, "xpath");
		waitForElementAppearance(locators.REPORT_COMMENT_TEXRBOX, "xpath");
		sendKeys(locators.REPORT_COMMENT_TEXRBOX, "xpath", CaseData.CASE_COMMENT);
		waitForElementAppearance(locators.REPORT_ADD_COMMENT_BUTTON, "xpath");
		click(locators.REPORT_ADD_COMMENT_BUTTON, "xpath");
	}

	public void verifyUploadedFishEyeImagesCount(int imagesCount) throws Exception {
		System.out.println(locators.FISH_EYE + imagesCount + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.FISH_EYE + imagesCount + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.FISH_EYE + imagesCount + locators.RECORDS_COUNT_PART2, "xpath", "Fish eye Images are not display");
	}

	public void verifyUploadedEvidanceImagesCount(int counts) throws Exception {
		System.out.println(locators.EVIDENCE_IMAGES + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.EVIDENCE_IMAGES + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.EVIDENCE_IMAGES + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}

	public void verifyUploadedSketchCount(int counts) throws Exception {
		System.out.println(locators.SKETCH + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.SKETCH + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.SKETCH + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}

	public void verifyUploadedVideoCount(int counts) throws Exception {
		System.out.println(locators.VIDEO + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.VIDEO + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.VIDEO + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}

	public void verifyUploadedAudioCount(int counts) throws Exception {
		System.out.println(locators.AUDIO + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.AUDIO + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.AUDIO + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}

	public void verifyUploadedPDFCount(int counts) throws Exception {
		System.out.println(locators.PDF + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.PDF + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.PDF + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}

	public void verifyURLCount(String counts) throws Exception {
		System.out.println(locators.URL + counts + locators.RECORDS_COUNT_PART2);
		waitForElementAppearance(locators.URL + counts + locators.RECORDS_COUNT_PART2, "xpath");
		verifyTextIsPresent(locators.URL + counts + locators.RECORDS_COUNT_PART2, "xpath",
				"Fish eye Images are not display");
	}
	
	public void clickMemberFromDropdown() throws Exception {
		waitForElementAppearance(locators.REPORTING_MEMBER_DROPDOWN, "xpath");
		click(locators.REPORTING_MEMBER_DROPDOWN, "xpath");
		waitForElementAppearance(locators.REPORT_MEMBER, "xpath");
		click(locators.REPORT_MEMBER, "xpath");
	}
	
	public String getReportingMemberName()throws Exception {
		waitForInvisibleOfElement(locators.CASE_SUBMITED_TO_RM_MSG, "xpath");
//		waitForElementAppearance(locators.REPORTING_MEMBER_NAME, "xpath");
		String RepoMemName= getText(locators.REPORTING_MEMBER_NAME, "xpath");
		return RepoMemName;
	}
}
