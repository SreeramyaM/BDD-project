package Locators;

public class AdvanceSearch {
	
	public class locators{
		
		public static final String CASE_ID			           = "caseNumber",
				                   SEARCH_CASE                 = "//button[text()='Search']",
				                   ACTION                      = "//span[contains(text(),'Actions')]",
				                   VIEW_CASE_DETAILS		   = "//li[contains(.,'View Case Details')]",
								   Searchcases_textbox		   = "//input[@type='text'][@name='searchCases']",
								   CaseidFirstPart				= "//td[contains(text(),'",
								   Clear_button				    = "//button[text()='Clear']",
								   Status_Dropdown				= " //div/label[text()='Status']/parent::div//input",
								   Initiation					= "//table/tbody/tr/td[4]",
		                           ADVANCE_SEARCH_BUTTON       = "//span[text()='Advance Search']",
		                           ADVANCE_SEARCH_TEXT         = "//h4[contains(text(),'Advance Search')]",
		                           STATUS_COMBOBOX             = "//div/label[text()='Status']/parent::div//input",  
		                           STATUS_VALUE                = "Complete",
		                           COMPLETE_TEXT               = "//span[text()='Complete']",
		                           CASE_STATUS_COMPLETE        = "//span[text()='Complete']",
	                               ADD_COMMENT_LINK            = "//div[@id='collapseComments']/descendant::a[@class='float-right ng-star-inserted']";

		
	
	}
}
