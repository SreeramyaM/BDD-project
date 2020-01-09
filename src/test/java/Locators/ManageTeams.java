package Locators;

public class ManageTeams {
	
public class locators{
		
		public static final String 
		
		
		SEARCH               		      = "//input[@placeholder='search']",						  							
		ACTIONS_PART1					  =	"//tr/td[text()='",
		ACTIONS_PART2					  = "']/ancestor::tr/td/span[contains(text(),'Actions')]",
		EDIT_TEAM                         = "//span[@class='actionsDropdown actionsDropdownLevel1']/descendant::ul/li[contains(text(),'Edit Team')]",												
		VIEW_MEMBER						  = "//span[text()='View Member']",
		MEMBER_PART1                      = "//table/thead/tr/th[contains(text(),'Team Members')]/ancestor::table//tbody/tr/td[text()='",
		MEMBER_PART2					  =	"']",
		TEAM_LEAD_PART1					  = "//table/thead/tr/th[contains(text(),'Team Lead')]/ancestor::table//tbody/tr/td[text()='",
		TEAM_LEAD_PART2					  = "']";
				
                                   
	}

}
