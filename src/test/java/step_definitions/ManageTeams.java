package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.ExcelData;
import PageObjects.ManageTeamsPage;
import PageObjects.ManageUsersPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageTeams extends BaseTest
{
	public WebDriver driver;

	public ManageTeams() throws Exception{
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, ManageTeamsPage.class);
	}

	ManageTeamsPage manageTeams= PageFactory.initElements(driver, ManageTeamsPage.class);
	ReaderAndWriteDataFromExcel readandwrite = new ReaderAndWriteDataFromExcel();
	ManageUsersPage manageUsers                 = PageFactory.initElements(driver, ManageUsersPage.class);
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	@When("^Enter IO team name in search box$")
	public void search_IoTeamname() throws Throwable {
	   String TeamName=readandwrite.readingDataFromExcel(ExcelData.TEAM_DATA_SHEET, ExcelData.IO_TEAM_COLUMN, filePath);
	   manageTeams.searchTeam(TeamName);
	}

	@When("^Click on action in teamtable$")
	public void click_On_Action_() throws Throwable {
	   String TeamName= readandwrite.readingDataFromExcel(ExcelData.TEAM_DATA_SHEET,ExcelData.IO_TEAM_COLUMN, filePath);
		manageTeams.movesOveronActionButton(TeamName);
	}
	
	@When("^Click on edit in action dropdown$")
	public void click_On_Edit() throws Throwable {
		manageTeams.clickEditbutton();   
	}

	@Then("^Click on view member$")
	public void click_On_ViewMember() throws Throwable {
		manageTeams.viewMember();
	}
	
	@Then("^Verify added IoLead user should be displayed$")
	public void verify_IOUser_Displayed() throws Throwable {
	   String IoLeadName=readandwrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_LEAD_NAME, filePath);
	   manageTeams.verifyNewIoLeaddisplayed(IoLeadName);
	}

	@Then("^Verify added IoMember should be displayed$")
	public void verify_IOMember_Displayed() throws Throwable {
	   String IoMember=readandwrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_NAME, filePath);
	   manageTeams.verifyNewIomemberdisplayed(IoMember);
	}

}
