package PageObjects;

import org.openqa.selenium.WebDriver;
import Locators.UserProfile.locators;

import step_definitions.ConfigBrowser;

public class UserProfilePage extends BrowserBot {
	
	public UserProfilePage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}
	
	public void clcikOnChangePhoto() throws Exception {
		waitForElementAppearance(locators.CHANGE_PHOTO, "xpath");
		clickByJS(locators.CHANGE_PHOTO, "xpath");
	}
	
	public void clcikOnChooseFileButton() throws Exception {
		waitForElementAppearance(locators.CHOOSE_FILE, "id");
		waitForElementToBeClickable(locators.CHOOSE_FILE, "id");
		Thread.sleep(1000);
		click(locators.CHOOSE_FILE, "id");
	}
	
	public void selectPhotoandClcickOnUpdate(String profilephoto) throws Exception {
		uploadFileUsingRobot(profilephoto);
		click(locators.UPDATE_PHOTO, "xpath");
	}

	public void verifyProfilePhotoUploadedSuccessfully() throws Exception {
		waitForElementAppearance(locators.PHOTO_UPDATE_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.PHOTO_UPDATE_SUCCESS_MSG, "xpath", "Error info: Profile photo not uploaded successfully");
	}


}