package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Locators.Dashboard;
import Locators.ManageCases.locators;
import Locators.ManageTeams;
import step_definitions.ConfigBrowser;

public class ManageCasesPage extends BrowserBot  {

	public ManageCasesPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(UsersPage.class.getName());
	
	

	public void searchcase(String Caseid) throws Exception {
		waitForElementAppearance(ManageTeams.locators.SEARCH, "xpath");
		sendKeys(ManageTeams.locators.SEARCH, "xpath", Caseid);
	}
	
	public void verifyCases(String caseid) throws Exception {
		waitForElementAppearance(locators.CASE_ID_1+caseid+locators.CASE_ID_2, "xpath");
		verifyTextIsPresent(locators.CASE_ID_1+caseid+locators.CASE_ID_2, "xpath", "Error Info: Created case not displayed in cases");
	}
	
	public void clickHome() throws Exception {
		waitForElementAppearance(Dashboard.locators.HOME, "xpath");
		click(Dashboard.locators.HOME, "xpath");
		
	}
}
