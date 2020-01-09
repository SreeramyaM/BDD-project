package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import PageObjects.TeamsPage;
import PageObjects.UserProfilePage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;

public class UserProfile extends BaseTest {
	
	
	public WebDriver driver;

	public UserProfile() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, TeamsPage.class);
    }

	PageObjects.UserProfilePage UserProfilePage                   = PageFactory.initElements(driver, UserProfilePage.class);
	ReaderAndWriteDataFromExcel readAndWrite 	                  = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		                  = new ReadPropertyFiles();
	String profilePhoto                                           = readPropertyFiles.pathToUploadFile("profilePhoto");

	@Then("^Clcik on change photo$")
	public void clcikOnChangePhoto() throws Throwable {
		UserProfilePage.clcikOnChangePhoto();
	}

	@Then("^Clcik on choose file button$")
	public void clcikOnChooseFileButton() throws Throwable {
	   UserProfilePage.clcikOnChooseFileButton();
	}
	
	@Then("^Select photo and clcick on update$")
	public void selectPhotoandClcickOnUpdate() throws Throwable {
		UserProfilePage.selectPhotoandClcickOnUpdate(profilePhoto);
	}
	
	@Then("^Verify profile photo uploaded successfully$")
	public void verifyProfilePhotoUploadedSuccessfully() throws Throwable {
		UserProfilePage.verifyProfilePhotoUploadedSuccessfully();
	}	
}

