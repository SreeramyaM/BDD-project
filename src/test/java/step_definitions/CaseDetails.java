package step_definitions;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.ExcelData;
import PageObjects.CaseDetialsPage;
import Utility.DataBaseOperations;
import Utility.DateAndTimeFunctions;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class CaseDetails extends BaseTest {
	public WebDriver driver;

	public CaseDetails() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, CaseDetialsPage.class);
	}

	ReaderAndWriteDataFromExcel readAndWrite         = new ReaderAndWriteDataFromExcel();
	CaseDetialsPage caseDetails 					 = PageFactory.initElements(driver, CaseDetialsPage.class);
	ReadPropertyFiles readPropertyFiles 			 = new ReadPropertyFiles();
	DateAndTimeFunctions date                        = new DateAndTimeFunctions();
	DataBaseOperations dataBase                      = new DataBaseOperations();
	CaseData caseData                                = new CaseData();
	String image1 									 = readPropertyFiles.pathToUploadFile("fisheyeimg1"),
	       image2 									 = readPropertyFiles.pathToUploadFile("fisheyeimg2"),
	       image3									 = readPropertyFiles.pathToUploadFile("fisheyeimg3"),
	       image4									 = readPropertyFiles.pathToUploadFile("fisheyeimg4"),
	       evedance_Image  							 = readPropertyFiles.pathToUploadFile("evidance"),
	       PDF 										 = readPropertyFiles.pathToUploadFile("pdf"),
	       sketch 									 = readPropertyFiles.pathToUploadFile("sketch"),
	       video 									 = readPropertyFiles.pathToUploadFile("video"),
	       audio 									 = readPropertyFiles.pathToUploadFile("audio"),
	       official_Case_Records 					 = readPropertyFiles.pathToUploadFile("pdf"),			 
	       zipFile									 = readPropertyFiles.pathToUploadFile("zip"),
	 	   filePath                                  = readPropertyFiles.pathToUploadFile("CaseData"),
	 	   currentDate 						    	 = DateAndTimeFunctions.getCurrentDate("dd/MM/yyyy"),
           fisheyeUpload[] 							 = {image1, image2, image3, image4};
		  

	@Then("^Verify user should be navigate to the case details page of particular case$")
	public void verifyCaseDetails() throws Throwable {
	    String caseId   = readAndWrite.readingDataFromExcel(ExcelData.CASE_DATA_SHEET, ExcelData.CASE_ID_COLUMN, filePath);
		caseDetails.verifyCaseDetailsPageisDisplay(caseId);
	}

	@Then("^Verify error message for registering a case it must have minimum 4 fish eye image is mandatory$")
	public void verifyFourFishEyeImagesMandatoryErrorMsg() throws Throwable {
		caseDetails.verifyErrorMessageForFishEyeImages();
	}

	@When("^Click on Submit button$")
	public void clickOnuploadButton() throws Throwable {
		caseDetails.selectSubmitButton();
	}

	@When("^Verify all fisheye images are uploaded successfully$")
	public void verifyUploadedFiles(String[] fisheyeUpload) throws Throwable {
		caseDetails.verifyUploadedFishEyeImages(fisheyeUpload);
	}

	@When("^User clicks on Submit button$")
	public void clickOnSubmitButton() throws Throwable {
		caseDetails.clickSubmit();
	}

	@When("^User click on Proceed Button to submit files$")
	public void clickOnProcessedButton() throws Throwable {
		caseDetails.clickProcessed();
	}

	@When("^User selects Reporting lead from the dropdown")
	public void selectReportingLead() throws Throwable {
		String reportingLead = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_NAME, filePath);
		caseDetails.selectReportingLead(reportingLead);
	}
	
	@When("^User selects Reporting Member from the dropdown")
	public void selectReportingMember() throws Throwable {
		String reportingMember = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_NAME, filePath);
		caseDetails.selectReportingMember(reportingMember);
	}

	@When("^User click on Assign Button$")
	public void selectAssign() throws Throwable {
		caseDetails.clickAssign();
	}

	@Then("^Verify the Case is Assigned To \"(.*?)\" Reporting Lead$")
	public void verifyAssignedReportingLead(String reportingOfficer) throws Throwable {
		caseDetails.verifyAssignedRepoOfficer(reportingOfficer);
	}

	@When("^Upload fisheye images$")
	public void uploadFishEyeImages() throws Throwable {
		caseDetails.uploadDocuments(CaseData.FILE_TYPE_FISH_EYE, fisheyeUpload);
	}
	
	@When("^Upload Evidence images$")
	public void uploadEvidenceImages() throws Throwable {
		caseDetails.uploadDocument(CaseData.EVIDENCE_IMAGE, evedance_Image);
	}
	
	@When("^Upload PDF files$")
	public void uploadPDFfiles() throws Throwable {
		caseDetails.uploadDocument(CaseData.PDF, PDF);
	}
	
	@When("^Upload sketch images$")
	public void uploadSketchs() throws Throwable {
		caseDetails.uploadDocument(CaseData.SKETCH, sketch);
	}
	
	@When("^Upload URL's$")
	public void uploadURLs() throws Throwable {
	  caseDetails.uploadURL(CaseData.URL, CaseData.URL_LINK);
	}

	@When("^Upload Videos$")
	public void uploadVideos() throws Throwable {
		caseDetails.uploadDocument(CaseData.VIDEO, video);
	}

	@When("^Upload Audios$")
	public void uploadAudios() throws Throwable {
		caseDetails.uploadDocument(CaseData.AUDIO, audio);
	}

	@When("^Upload official records$")
	public void uploadOfficialRecords() throws Throwable {
		caseDetails.uploadDocument(CaseData.OFFICIAL_CASE_RECORDS, official_Case_Records);
	}

	
	@Then("^Verify Download/Accept/Data Non Compliance buttons are displayed in case details page$")
	public void verifyDNCAcceptAndDownloadButtons() throws Throwable {
		caseDetails.verifyAcceptDNCDownloadButtons();
	}

	@Then("^Verify Evidence Images or Sketches are not uploaded alert message$")
	public void verifyAlertMessage() throws Throwable {
		caseDetails.verifyAlertMessageBody();
	}

	@When("^Click on Back button$")
	public void selectBackButton() throws Throwable {
		caseDetails.clickOnBack();
	}

	@When("^User Click on Download button$")
	public void download() throws Throwable {
		caseDetails.clickOnDownload();
	}

	@When("^User click on Accept button$")
	public void accept() throws Throwable {
		caseDetails.clickOnAccept();
	}

	@Then("^Verify Accept button is not display$")
	public void assignButtonIsNotDisplay() throws Throwable {
		caseDetails.verifyAcceptButtonIsNotDisplay();
	}

	@When("^User click on Report button$")
	public void reports() throws Throwable {
		caseDetails.clickOnReportsButton();
	}

	@When("^Clicks on Upload 360 degree Report Button$")
	public void clickOnUploadReports() throws Throwable {
		caseDetails.clickOnUploadReport();
	}

	@When("^User select a valid .zip Report file$")
	public void uploadZipFolder() throws Throwable {
		caseDetails.clickOnBrowseInUploadReport();
		caseDetails.uploadZIPFolder(zipFile);
	}

	@When("^Click on Upload button on Popup$")
	public void clickOnUpload() throws Throwable {
		caseDetails.clickOnUploadButton();		
	}
	
	@Then("^Verify the report should be uploaded and uploaded preview message is display$")
	public void verifyPreviewMessageIsDisplay() throws Throwable {
		caseDetails.verifyPreviewMsg();		
	}
	
	@Then("^User click on Submit Report$")
	public void clickOnReportSubmit() throws Throwable {
		caseDetails.submitReport();		
	}
	
	@Then("^Verify Report Submitted Investigation officer message$")
	public void verifyReportSubmittedIO_Officer() throws Throwable {
		caseDetails.ioLeadreportSubmittedSuccessMsg();		
	}
	
	@Then("^Verify report submitted success message$")
	public void verifyReportSubmitedMessage() throws Throwable {
		caseDetails.reportSubmitedSuccessMessage();		
	}
	
	@Then("^Verify Reports Log version one status in \"(.*?)\" Reports page$")
	public void verifyReportLogStatusOne(String status) throws Throwable {
		caseDetails.verifyReportLogstatusVersionOne(status);
	}
	
	@Then("^Verify Reports Log version two status in \"(.*?)\" Reports page$")
	public void verifyReportLogStatusTwo(String status) throws Throwable {
		caseDetails.verifyReportLogstatusVersionTwo(status);
	}
	
	@When("^Click on Close Case Button$")
	public void clickOnCloseButton() throws Throwable {
		caseDetails.clickOnCloseCaseButton();
	}
	
	@Then("^Verify Comment-box pop-up is displayed$")
	public void verify_Comment_box_displayed() throws Throwable {
		caseDetails.verifyCommentBox();
	}

	@When("^Enter the appropriate Comment and click on Close button on comment box$")
	public void clickCloseButtonInCommentBox() throws Throwable {
		caseDetails.enterComment();
		caseDetails.clickOnCloseButton();
	}

	@When("^Click on Revise Report Button$")
	public void clickOnReviseButton() throws Throwable {
		caseDetails.reviseReportButton();
	}

	@When("^Enter Comment and click on Revise button on comment box$")
	public void enterCommentAndclikcOnReviseButton() throws Throwable {
		caseDetails.enterReviseComment(CaseData.REVISE_COMMENT);
		caseDetails.reviseInRevisePopup();
	}
	
	@When("^Enter all mandatory details to upload report$")
	public void enterAdditionalSoftwareDetails() throws Throwable {
		caseDetails.enterAdditionalSoftwareDetails(CaseData.STICKER_VERSION, CaseData.VT_VERSION);
	}
	
	@Then("^Verify report accepted success message$")
	public void reportAcceptedSuccessMessage() throws Throwable {
		caseDetails.reportAccepted();
	}
	
	@When("^User click on Complete button$")
	public void clickOnCompleteButton() throws Throwable {
		caseDetails.clickCompleteButton();
	}
	
	@When("^User enter comment to close case$")
	public void enterCommentTocloseCase() throws Throwable {
		caseDetails.closeCaseComment(CaseData.CASE_CLOSE_COMMENT);
	}
	
	@Then("^Click on Complete button$")
	public void clickComplete() throws Throwable {
		caseDetails.clickComplete();
	}
	
	@When("^Click on Case Comments section$")
	public void click_on_Case_comments_section() throws Throwable {
		caseDetails.clickOnCaseCommentAccordion();	    
	}

	@Then("^Verify Add comment link should not be present\\.$")
	public void verify_Add_comment_link_should_not_be_present() throws Throwable {
		caseDetails.verifyAddComment();
	}

	@When("^Get auto assign case Reporting Lead user name$")
	public void getReportingLeadUserName() throws Throwable {
		String reportingOfficer = caseDetails.getReportingLeadName();
		String query = "select EMAILID from forse_db.USER where FULL_NAME = '"+reportingOfficer+"';";
		System.out.println(query);
		String repoLeadEmailId = dataBase.readDataFromDataBase(query);
		System.out.println(repoLeadEmailId);
		readAndWrite.writeDataToExcelFile(repoLeadEmailId, ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.AUTO_ASSIGN_REPORTINGLEAD, filePath);
	}
	
	@Then("^Verify Super Admin Added success message$")
	public void superAdminAddedSuccessMessage() throws Throwable {
		caseDetails.superAdminAddedSuccessMessage();
	}
	
	@When("^Click on FishEye images droup down$")
	public void clickOnFishEyeImagesDroupDown() throws Throwable {
		caseDetails.clickFishEyeDroupDown();
	}
	
	@When("^Enter Station name and Alias name$")
	public void enterStationAndAliasName() throws Throwable {
		caseDetails.aliasAndStationName(caseData.STATION_NAME, caseData.ALIAS_NAME);
	}
	
	@And("^Click on MoveTo folder button$")
	public void moveToFolder() throws Throwable {
		caseDetails.clickMoveToFolder();
	}
	 
	@And("^Click on create new station button$")
	public void createNewStation() throws Throwable {
		caseDetails.createNewStation();
	}

	@And("^Click on add new station button$")
	public void addNewStation() throws Throwable {
		caseDetails.addStation();
	}

	@And("^Click on Add Station button$")
	public void addStationButton() throws Throwable {
		caseDetails.addStationBtn();
	}
	
	@Then("^Verify minimum four fish eye images validation message$")
	public void minimumFishEyeMessage() throws Throwable {
		caseDetails.fishEyeValidationMsg();
	}
	
	@And("^Select fish eye images check box$")
	public void selectFishEyeImagesCheckBox() throws Throwable {
		String[] imagesName = {CaseData.FISH_EYE_IMG1, CaseData.FISH_EYE_IMG2, CaseData.FISH_EYE_IMG3, CaseData.FISH_EYE_IMG4}; 
		caseDetails.selectFishEyeImgesCheckBox(imagesName);
	}
	
	@And("^Select police station name$")
	public void selectStationName() throws Throwable {
		caseDetails.selectStationName(caseData.STATION_NAME);
	}
	
	@And("^Click on Station plus icon$")
	public void stationPlusIcon() throws Throwable {
		caseDetails.clickStationPlusIcon();
	}
	
	@And("^Verify added images are displayed in police station$")
	public void verifyAddedImagesToStation() throws Throwable {
		String[] imagesName = {CaseData.FISH_EYE_IMG1, CaseData.FISH_EYE_IMG2, CaseData.FISH_EYE_IMG3, CaseData.FISH_EYE_IMG4}; 
		caseDetails.verifyAddedImagesToStation(imagesName);
	}
	
	@Then("^Verify Report log version one$")
	public void verifyReportLogVersion() throws Throwable {
		caseDetails.reportLogVersion();
	}	
	
	@Then("^Verify software versions$")
	public void verifySoftwareVersions() throws Throwable {
		caseDetails.softwareVersions(currentDate);
	}
	
	@And ("^Click on Add Comments and Add comment$")
	public void clickonAddCommentsandAddcomment() throws Throwable {
		caseDetails.addComment();
	}

	@Then("^Verify case status should be in \"(.*?)\" in case details page$")
	public void verifyCaseStatusInDetailsPage(String status) throws Throwable {
		caseDetails.verifyCaseStatusInCaseDetailsPage(status);
	} 
	
	@Then("^Verify Case Comment Sucess message should be displayed$")
	public void verifyCaseCommentMessage() throws Throwable {
		caseDetails.verifyCaseCommentSuccessMessage();
	}
	
	@And("^Click on Add Notes and Add Note$")
	public void addNotesForFishEye() throws Exception {
		caseDetails.addCommentFishEye();
	}
	
	@And("^Click on Report Comment accordion$")
	public void clickReportComment() throws Exception {
		caseDetails.clickonreportcomment();
	}

	@And("^Click on Add Comments and add comment$")
	public void addComment() throws Exception {
		caseDetails.reportAddcomment();
	}
	
	@Then("^Verify Report Comment Sucess message should be displayed$")
	public void verifyReportComment() throws Exception {
		caseDetails.verifyCaseCommentSuccessMessage();
	}

	@Then("^Verify uploaded fish eye images counts$")
	public void verifyUploadedFile() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.TWO_FISH_EYE_IMAGES_COUNT);
	}

	@Then("^Verify uploaded Evidance images counts$")
	public void verifyUploadedEvidanceImagesCount() throws Exception {
		caseDetails.verifyUploadedEvidanceImagesCount(CaseData.COUNT_ONE);
	}
	
	@Then("^Verify uploaded Sketch images counts$")
	public void verifyUploadedSketchImagesCount() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.COUNT_ONE);
	}
	
	@Then("^Verify uploaded Video counts$")
	public void verifyUploadedVideoCount() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.COUNT_ONE);
	}
	
	@Then("^Verify uploaded Audio counts$")
	public void verifyUploadedAudioCount() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.COUNT_ONE);
	}
	
	@Then("^Verify uploaded PDF counts$")
	public void verifyUploadedPDFCount() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.COUNT_ONE);
	}
	
	@Then("^Verify uploaded URL counts$")
	public void verifyUploadedURLCount() throws Exception {
		caseDetails.verifyUploadedFishEyeImagesCount(CaseData.COUNT_ONE);
	}

	@And("^Select report member from dropdown$")
	public void clickMemberFromDropDown() throws Exception {
		caseDetails.clickMemberFromDropdown();
	}
	
	@And("^Get reporting member for case$")
	public void getRepoMemeberUserName() throws Exception {
		String repoMember= caseDetails.getReportingMemberName();
		String query = "select EMAILID from forse_db.USER where FULL_NAME = '"+repoMember+"';";
		System.out.println(query);
		String repoMemberEmailId = dataBase.readDataFromDataBase(query);
		System.out.println(repoMemberEmailId);
		readAndWrite.writeDataToExcelFile(repoMemberEmailId, ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.AUTO_IOMEMBER_NAME, filePath);
	}
	

}
