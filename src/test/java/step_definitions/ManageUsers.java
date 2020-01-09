package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;
import Data.ExcelData;
import PageObjects.ManageTeamsPage;
import PageObjects.ManageUsersPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.When;



public class ManageUsers extends BaseTest{
	public WebDriver driver;
	public ManageUsers() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver,ManageUsersPage.class);
	}

	ManageUsersPage manageUsersPage				= PageFactory.initElements(driver,ManageUsersPage.class);
	ManageTeamsPage	manageTeams							= PageFactory.initElements(driver,ManageTeamsPage.class);
	ReaderAndWriteDataFromExcel readAndWrite 	= new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	@When("^Search the user in the search box$")
	public void searchUser() throws Throwable {
	   String User= readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_NAME, filePath);
	   manageUsersPage.searchUser(User);
	}
	
	@When("^Click on Edit on Action Dropdown$")
	public void clickOnEdit() throws Throwable {
		manageUsersPage.clickEdit();
	}

	@When("^Click on action in User table$")
	public void click_On_Action_() throws Throwable {
	   String UserName= readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME,ExcelData.IO_LEAD_NAME, filePath);
		manageTeams.movesOveronActionButton(UserName);
	}

}
