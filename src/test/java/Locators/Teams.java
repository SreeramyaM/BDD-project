package Locators;

public class Teams {
	
	public class locators{
		
		public static final String TEAMS                    =   "//a[@aria-expanded='false'][contains(.,'Teams')]",								   
								   MANAGE_TEAMS				=	"//a[contains(text(),'Teams')]",
								   SELECT_TEAM				=	" #selectTeam",
								   TEAM_NAME				=   "#teamName",
								   SELECT_LEAD				=    "//div[@class='ng-control ng-has-value']//input[@type='text']",
								   SELECT_MEMBER			=   "//div[@class='ng-control']//input[@type='text']",
								   SUMBIT_BUTTON			=  "//button[@class='btn btn-primary']",
								   ADD_TEAM_HEADER			=  "//h4[@class='head'][contains(.,'Add Team')]",
								   SELECT_IO_TEAM			=  "//input[contains(@value,'IO TEAM')]",
								   SELECT_REPORTING_TEAM   =  "//input[contains(@value,'REPORTING TEAM')]",
								   SUCESS_MSG				=  "//div[@aria-live='polite'][contains(.,'New team has been succesfully created!')]",
								   VERIFY_CREATED_TEAM		=  "//td[@class='red-tooltip'][contains(text()='",
								   ADD_SECOND_IO_MEMBER     =  "(//input[contains(@type,'text')])[4]",
								   TEAM_SUCESS_UPDATED_MSG  = "//div[@aria-live='polite'][contains(.,'Team has been succesfully updated!')]",
								   CLAER_TEAMLEAD           = "//ng-select[@id='teamLead']/descendant::span[@class='ng-clear']",   
								   CLEAR_TEAM_MEMBER	    = "//ng-select[@id='teamMember']/descendant::span[@class='ng-clear']",
								   CLICK_TEAMS              = "//span[@style='padding-left: 15%;'][contains(.,'Teams')]",
								   VIEW_TEAMS               = "//th[@class='sort'][contains(.,'Team Name')]";
								                                  
	}

}
