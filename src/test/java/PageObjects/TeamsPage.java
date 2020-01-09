package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import BaseTest.BaseTest;
import Locators.Teams.locators;
import step_definitions.ConfigBrowser;

public class TeamsPage extends BrowserBot {

	public TeamsPage(WebDriver driver) {
		super(driver);
		driver = BaseTest.driver;
	}

	private static final Logger logger = LogManager.getLogger(TeamsPage.class.getName());
	public String teamname;

	public void clickOnTeams() throws Exception {
		click(locators.TEAMS, "xpath");
	}

	public void VerifyAddTeamPage() throws Exception {
		waitForElementAppearance(locators.ADD_TEAM_HEADER, "xpath");
		isElementPresent(locators.ADD_TEAM_HEADER, "xpath");
	}

	public void selectIOTeam() throws Exception {
		click(locators.SELECT_IO_TEAM, "xpath");
	}

	public void selectRepTeam() throws Exception {
		click(locators.SELECT_REPORTING_TEAM, "xpath");
	}

	public void selectReportingTeam() throws Exception {
		click(locators.SELECT_REPORTING_TEAM, "xpath");
	}

	public void enterTeamName(String teamName) throws Exception {
		waitForElementAppearance(locators.TEAM_NAME, "css");
		sendKeys(locators.TEAM_NAME, "css", teamName);
	}

	public void selectTeamlead(String Leadname) throws Exception {
		sendKeys(locators.SELECT_LEAD, "xpath", Leadname);
		clickByEnterKey(locators.SELECT_LEAD, "xpath");
	}

	public void selectMember(String Iomembername) throws Exception {
		sendKeys(locators.SELECT_MEMBER, "xpath", Iomembername);
		clickByEnterKey(locators.SELECT_MEMBER, "xpath");
	}

	public void clickonSumbit() throws Exception {
		click(locators.SUMBIT_BUTTON, "xpath");
	}

	public void verifyTeamCreatedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.SUCESS_MSG, "xpath");
		verifyTextIsPresent(locators.SUCESS_MSG, "xpath", "Error info: Team Created success message is not display");
	}

	public void verifyTeaminMangeTeams() throws Exception {
		System.out.println(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH);
		waitForElementAppearance(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH,
				"xpath");
		isElementPresent(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH,
			"xpath");
	}

	public void selectSecondMember(String Iomembername) throws Exception {
		sendKeys(locators.ADD_SECOND_IO_MEMBER, "xpath", Iomembername);
		clickByEnterKey(locators.ADD_SECOND_IO_MEMBER, "xpath");
	}
	
	public void verifyTeamUpdatedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.TEAM_SUCESS_UPDATED_MSG, "xpath");
		verifyTextIsPresent(locators.TEAM_SUCESS_UPDATED_MSG, "xpath", "Error info: Team Updated success message is not display");
	}
	
	public void clearTeamName() throws Exception {
		clearInPutField(locators.TEAM_NAME, "css");
	}
	
	public void clearIoLead() throws Exception {
		waitForElementAppearance(locators.CLAER_TEAMLEAD, "xpath");
	}

	public void clearIoMember() throws Exception {
		waitForElementAppearance(locators.CLEAR_TEAM_MEMBER, "xpath");
	}
	
    public void clickTeamsInLeftPanel() throws Throwable {
    	waitForElementAppearance(locators.CLICK_TEAMS, "xpath");
	    clickByJS(locators.CLICK_TEAMS, "xpath");
	}

    public void verifyTeamsShouldDisplaySuccessfully() throws Throwable {
    	waitForElementAppearance(locators.VIEW_TEAMS, "xpath");
    	verifyTextIsPresent(locators.VIEW_TEAMS, "xpath", "Error info: Teams Not Found");
	    
	}
}

