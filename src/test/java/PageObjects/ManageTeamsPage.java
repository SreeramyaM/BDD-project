package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Locators.ManageTeams.locators;
import step_definitions.ConfigBrowser;

public class ManageTeamsPage extends BrowserBot 
{

	public ManageTeamsPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}
	
	private static final Logger logger = LogManager.getLogger(UsersPage.class.getName());

	public void searchTeam(String teamName) throws Exception {
		waitForElementAppearance(locators.SEARCH, "xpath");
		sendKeys(locators.SEARCH, "xpath", teamName);
	}  	
	
	public void movesOveronActionButton(String TeamName) throws Exception {
		waitForElementAppearance(locators.ACTIONS_PART1+TeamName+locators.ACTIONS_PART2,"xpath");
		mouseOverByActions(locators.ACTIONS_PART1+TeamName+locators.ACTIONS_PART2, "xpath");
	} 
	
	public void clickEditbutton() throws Exception {
		waitForElementAppearance(locators.EDIT_TEAM, "xpath");
		click(locators.EDIT_TEAM, "xpath");
	}
	
	public void viewMember() throws Exception {
		waitForElementAppearance(locators.VIEW_MEMBER, "xpath");
		clickByJS(locators.VIEW_MEMBER, "xpath");
	}
	
	public void verifyNewIomemberdisplayed(String IoName) throws Exception {
		waitForElementAppearance(locators.MEMBER_PART1+IoName+locators.MEMBER_PART2, "xpath");
		verifyTextIsPresent(locators.MEMBER_PART1+IoName+locators.MEMBER_PART2, "xpath", "Error Info: Created user is not display in Team");
	} 
	public void verifyNewIoLeaddisplayed(String IoName) throws Exception {
		System.out.println(locators.TEAM_LEAD_PART1+IoName+locators.TEAM_LEAD_PART2);
		waitForElementAppearance(locators.TEAM_LEAD_PART1+IoName+locators.TEAM_LEAD_PART2, "xpath");
		verifyTextIsPresent(locators.TEAM_LEAD_PART1+IoName+locators.TEAM_LEAD_PART2, "xpath", "Error Info: Created user is not display in Team");
	} 
}
