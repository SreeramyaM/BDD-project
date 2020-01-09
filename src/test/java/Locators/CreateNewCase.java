package Locators;

public class CreateNewCase {
	
	public class locators{
		
		public static final String CREATE_NEW_CASE_PAGE           = "h4[class='head']",
				                   NEW_CASE                       = "a[href='#/io-lead/add-case']",
				                   CASE_NAME                      = "caseName",
				                   CASE_ID                        = "caseNumber",
				                   RE_ENTER_CASE_ID               = "confirmcaseNumber",
				                   DATE                           = "//div/label[text()='Incident Date & Time  In (GMT +05:30)*']/parent::div//div/input",
				                   //INVISTIGATION_LEAD             = "//div/label[text()='Investigation Lead *']/parent::div//div/span[text()='",
				                   INVISTIGATION_TEAM             = "//div/div[text()='Investigation Team']/parent::div/parent::div//input",
				                   INVISTIGATION_LEAD             = "//div/div[text()='Investigation Lead']/parent::div/parent::div//input",
				                   COMPLEXITY                     = "//div/div[text()='Complexity']/parent::div/parent::div//input",
				                   PRIORITY                       = "//div/div[text()='Case Priority']/parent::div/parent::div//input",
				                   DETAILS                        = "details",
				                   SAVE                           = "//button[text()='Save']",	
				                   DROUPDOWN_OPTION               = "//span[text()='",
				                   CLOSE_XPATH                    = "']",	
				                   CLOSE_XPATH_WITH_BRACE         = "')]",
				                   MIN_FISHE_VALIDATION			  = "//div[@aria-live='polite'][contains(.,'Number of fish-eye image(s) for this case is 0. It should be equal to or greater than 4.')]",
				                   SELECT_DOC_TYPE				  = "//div[text()='Select Document Type']/parent::div//div/input",				                   
				                   PROCEED_BUTTON				  = "//button[text()='Proceed']",
				                   DOC_UPLOAD_SUCESS_MSG		  = "//div[contains(text(),'Document has been successfully uploaded!')]",
				                   CASE_CREATED_SUCCESS_MESSAGE   = "//div[contains(text(),'New case has been successfully created!')]",
								   CASE_LIST                      = "(//a[contains(.,'Cases')])[1]",
		                           VIEW_CASES                     = "//h4[contains(.,'View Cases')]",
				   				   CASEID_1						  = "//td[@class='caseNumber'][contains(.,'",
				   				   CASEID_2						  = "')]",
				   				   DOWNLOAD_PDF                   = "//tr[@id='casedetails0']//td/img[@class='image_statndard_download']",
				   				   DASHBOARD                      = "//div[contains(@class,'sidebar-header')]//img[@id='refresh']";
	}
}
			
