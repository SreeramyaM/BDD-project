package PageObjects;

import org.openqa.selenium.WebDriver;
import Locators.ManageTeams;
import Locators.ManageUsers.locators;
import step_definitions.ConfigBrowser;

public class ManageUsersPage extends BrowserBot {

	public ManageUsersPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	public void searchUser(String User) throws Exception {
		waitForElementAppearance(ManageTeams.locators.SEARCH, "xpath");
		sendKeys(ManageTeams.locators.SEARCH, "xpath", User);
	}  	
	
	public void clickEdit() throws Exception {
		waitForElementAppearance(locators.EDIT_USER, "xpath");
		click(locators.EDIT_USER, "xpath");
	}
	
}
