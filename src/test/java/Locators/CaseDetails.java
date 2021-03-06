package Locators;

public class CaseDetails {
	public class locators {

 		public static final String CASE_DETAILS_PAGE                   = "//div/h4[text()='Case Details']",
				                   CASE_ID                             = "//div/h5[text()='",
                                   MIN_FISHEYE_VALIDATION_MSG          = "//div[@aria-live='polite'][contains(.,'Number of fish-eye image(s) for this case is 0. It should be equal to or greater than 4.')]",
                                   UPLOAD_BUTTON                       = "//button[text()='Upload']",
                                   SPINNER                             = "//div[@class='visible spinner center']/img",
                                   FISHEYE_IMAGES_COUNT_PART1          = "//div[@id='headingOne']/h5[contains(text(),'Fish Eye Images')]/span[text()='",
                                   FISHEYE_IMAGES_COUNT_PART2          = " Files)']",
                                   IMAGE_NAME_PART1                    = "(//div/span[text()='",
                                   IMAGE_NAME_PART2                    = "'])[1]",
                                   SUBMIT                              = "//button[text()='Submit']",
                                   PROCESSED                           = "//button[text()='Proceed']",
                                   ASSIGN                              = "//button[text()='Assign']",
                                   REPORTING_LEAD_INPUT                = "//div/div[text()='Reporting Lead']/parent::div/parent::div//input",
                                   REPORTING_MEMBER_INPUT              = "//div/div[text()='Reporting Member']/parent::div/parent::div//input",
                                   REPORTING_OFFICER                   = "//span[text()='Reporting Officer']/parent::li/span[text()='",
                                   SELECT_FILE_TYPE				       = "//div[text()='Select Document Type']/parent::div//div/input",
                                   BROWSE                              = "fileUpload",
                                   UPLOAD_FILE                         = "//button[text()='Upload']",
                                   ACCEPT                              = "Accept",
                                   DOWNLOAD                            = "download",
                                   DATA_NON_COMPLIANCE                 = "NonCompliance",
                                   FILE_UPLOADED_SUCCESS_MESSAGE       = "//div[text()='Document has been successfully uploaded!']",
                                   EVIDENCE_IMAGES_SKETCHES_ALERT      = "//div[contains(text(),'Evidence Images or Sketches are not uploaded, if you still want to proceed please click on PROCEED')]",
                                   THANK_YOU_FOR_SUBMITTING            = "//div[text()='Thank you for submitting the case.']",
                                   BACK                                = "//button[text()='Back']",
                                   ASSIGN_DROUP_DOWN                   = "//div[text()='Reporting Lead']/parent::div/parent::div//span/span",
                                   REPORTING_LEAD                      = "//ng-dropdown-panel//span[text()='",
                                   DOWNLOAD_IS_IN_PROGRESS             = "//div[text()=' Download is in progress!!! ']",
                                   REPORT                              = "//button[text()='Reports']",
                                   UPLOAD_REPORT                       = "//button[text()='Upload 360° Report']",
                                   FILE_UPLOAD_BROWSE                  = "//div[@id='uploadfile-css']/label",
                                   UPLOAD_ZIP_FOLDER_SUCCESS_MSG       = "//div[text()='This is only a preview. In order to upload the report and submit it to IO Lead review, please click on the Submit Report button']",
                                   SUBMIT_REPORT                       = "//button[text()='Submit Report']",
                                   REPORT_SUBMITED_SUCCESS_MESSAGE     = "//div[@aria-label='Report has been successfully submitted to the Investigation Lead!']",
                                   CLOSE  		 		   		       = "//button[text()='Close']",
                                   STATUS                              = "//div/span[text()='Status:']/parent::div/span[contains(text(),'", 	
 		      					   CLOSE_BUTTON						   =  "//button[text()='Close Case']",
 		      					   CLOSECASE_COMMENT				   = "//textarea[@name='addCommnet']",
			                       COMMENT_BOX_MESSAGE				   = "//div[contains(text(),'Are you sure you want to Close the case? If yes, please enter your comments below.')]",
				                   REVISE_REPORT_BUTTON		           = "//button[text()='Revise']",				                  
				                   STICKER_VERSION                     = "stitcherVersion",
				                   STICKER_DATE                        = "//div/input[@id='stitcherDate']/parent::div/span",
				                   CURRENT_DATE                		   = "//td[contains(@class,'day active today')]",
				                   REPORT_DATE                         = "//div/input[@id='vtDate']/parent::div/span",				                   
				                   VTVERSION 						   = "vtVersion",
				                   VTDATE 							   = "vtDate",
				                   REPORT_ACCEPTD_SUCCESS_MSG          = "//div[contains(text(),'Report has been successfully accepted!')]",
				                   COMPLETE                            = "//button[text()='Complete']",
				                   CASE_CLOSE_MESSAGE                  = "//div[contains(text(),'Are you sure you want to Complete the case? If yes, please enter your comments below.')]",
				                   CLOSE_CASE_COMMENT                  = "//div[@class='modal-content']//textarea",
				                   COMPLETE_BUTTON                     = "//button[text()='Cancel']/parent::div/button[text()='Complete']",
				                   ADVANCE_SEARCH                      = "//a[contains(text(),'Advance')]",
                                   CASE_COMMENT_EXPANSION              = "//div[@id='comments_accordion']",
 		                           ADD_COMMENTS                        = "//div[@id='collapseComments']/descendant::a[@class='float-right ng-star-inserted']",
				                   REPORTING_OFFICER_NAME              = "//li/span[text()='Reporting Officer']/parent::li/span[2]",
				                   SUPER_ADMIN_CREATED_SUCCESS_MSG     = "//div[text()='Super Admin has been succesfully added! User will receive welcome email along with login details.']",
				                   FISHEYE_DROUPDOWN                   = "headingOne",
				                   MOVE_TO_FOLDER                      = "//div[@id='collapseOne']//img[@class='move-to-folder']",
				                   CREATE_NEW                          = "//span[contains(text(),'Create New')]",
				                   STATION_NAME                        = "sName",
				                   ALIAS_NAME                          = "alias",
				                   ADD_STATION_PLUS_ICON               = "//img[@class='addStn']",
				                   ADD_STATION                         = "//button[text()='Add Station']",
				                   FISH_EYE_IMAGE_PART1                = "//input[@id='caseDocs",
 								   FISH_EYE_IMAGE_PART2                = "']",
 								   STATION_NAME_PART1                  = "(//div[text()='",
 								   STATION_NAME_PART2                  = "'])[1]",
 								   STATION_NAME_ADD                    = "(//img[@id='plusImg0'])[2]",
 								   FISH_EYE_VALIDATION_MSG             = "//div[@aria-label='Minimum 4 images should be present in each station']",
 								   REPORT_LOG                          = "//div/h5[text()='Reports Log']/parent::div//a/span/b[text()='Version 1']",
 								   SOFTWARE_VERSION_PART1              = "//tr/td[text()='iMAGENEcsi Stitcher']/parent::tr/td[text()='v.1']/parent::tr/td[text()='",
 								   SOFTWARE_VERSION_PART2 			   = "//tr/td[text()='iMAGENEcsi 360° Report']/parent::tr/td[text()='VT 1.1']/parent::tr/td[text()='", 								    								 
 								   REVISE_IN_REVISE_POPUP              = "(//button[text()='Revise'])[2]",
 								   LOGOUT_MESSAGE                      = "//div[text()='You have been logged out successully!']",
 								   PDF_PASSWORD_TXTBOX				   = "password",
 								   PDF_SUMBITBTN					   = "submit",
 								   REVISE_COMMENT                      = "addComment",
 								   REPORTS_LOG_VERSION1                = "(//div/h5[text()='Reports Log']/parent::div//a/span)[1]",
 								   REPORTS_LOG_VERSION2                = "(//div/h5[text()='Reports Log']/parent::div//a/span)[3]",  						                                
 								   CASE_COMMT_MSG					   = "//div[@aria-live='polite'][contains(.,'A new comment has been successfully added!')]",
 								   REPORT_SUBMITTED_TO_IO_SUCCESS_MSG  = "//div[text()='Report has been successfully submitted to the Investigation Lead!']",
 								   ADD_COMMENT_POPUP				   = "//button[contains(text(),'Add Comment')]",
 								   ADD_NOTES						   = "//div/h5[contains(text(),'FishEye Notes')]/parent::div/a",
 								   ADD_NOTES_TEXT_BOX				   = "//textarea[@id='addCommnet']",
 								   ADD_NOTES_POPUP					   = "//button[contains(text(),'Add Notes')]",
 								   REPORT_COMMENT					   = "//div[@id='accordionComments']/descendant::form/h5",
 								   REPORT_ADD_COMMENT				   = "//div[@id='collapseComments']/descendant::form/a",
 								   REPORT_COMMENT_TEXRBOX	           = "//textarea[@id='addComment']",
 								   REPORT_ADD_COMMENT_BUTTON		   = "//button[contains(text(),'Add Comments')]",
 		                           URL                                 = "//input[@name='url']",
 		                           SAVE_URL                            = "//button[text()='Save']",
 		                           DOC_UPLOADED_SUCCESS_MSG            = "//div[contains(text(),'Document has been successfully uploaded!')]",
 		                           URL_SAVED_SUCCESS_MSG               = "//div[contains(text(),'URL Saved Successfully')]",
 		                           FISH_EYE                			   = "//h5[contains(text(),'Fish Eye Images')]/span[text()='(",
 		                           EVIDENCE_IMAGES                     = "//h5[contains(text(),'Evidence Images')]/span[text()='(",
 		                           SKETCH                			   = "//h5[contains(text(),'Sketch')]/span[text()='(",
 		                           VIDEO 							   = "//h5[contains(text(),'Video')]/span[text()='(",
 		                           AUDIO 							   = "//h5[contains(text(),'Audio')]/span[text()='(",
 		                           PDF 								   = "//h5[contains(text(),'PDF')]/span[text()='(",
 		                           URLS 							   = "//h5[contains(text(),'URL')]/span[text()='(",
 		                           OFFICIAL_CASE_RECORDS	 		   = "//h5[contains(text(),'FIR/Official case records')]/span[text()='(",
 		                           RECORDS_COUNT_PART2                 = " Files)']",
 		                           REPORTING_MEMBER_DROPDOWN		   = "//ng-select[@id='leadName']/div/span",
 								   REPORT_MEMBER					   = "//ng-select[@id='leadName']//span[@class='ng-option-label']",
 								   REPORTING_MEMBER_NAME			   = "//div/span[text()='Assigned To:']/following-sibling::span",
 								   CASE_SUBMITED_TO_RM_MSG			   = "//div[@aria-live='polite'][contains(.,'Case has been successfully assigned to the Reporting Member!')]";
	}

}
