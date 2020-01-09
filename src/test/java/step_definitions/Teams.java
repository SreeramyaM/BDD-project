package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.ExcelData;
import Data.TeamData;
import PageObjects.TeamsPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teams extends BaseTest {
	public WebDriver driver;

	public Teams() throws Exception {
		driver = BaseTest.driver;
		PageFactory.initElements(driver, TeamsPage.class);
	}
	
	TeamsPage teams                             = PageFactory.initElements(driver, TeamsPage.class);
	ReaderAndWriteDataFromExcel readAndWrite 	= new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String filePath                             = readPropertyFiles.pathToUploadFile("CaseData");
	
	
	@When("^Select Team Type Io Lead$")
	public void select_Team_Type_Io_Lead() throws Throwable {
		teams.selectIOTeam();
	}

	@When("^Select Team Type Reporting Team$")
	public void Select_Team_ReportingTeam() throws Throwable {
		teams.selectReportingTeam();
	}

	@When("^Enter io Team name$")
	public void enterIOTeamName() throws Throwable {
		teams.enterTeamName(TeamData.IO_TEAM_NAME);
		readAndWrite.writeDataToExcelFile(TeamData.IO_TEAM_NAME, ExcelData.TEAM_DATA_SHEET, ExcelData.IO_TEAM_COLUMN, filePath);
	}
	
	@When("^Enter Reporting Team name$")
	public void enterReportingTeamName() throws Throwable {
		teams.enterTeamName(TeamData.REPORTING_TEAM_NAME);
		readAndWrite.writeDataToExcelFile(TeamData.REPORTING_TEAM_NAME, ExcelData.TEAM_DATA_SHEET, ExcelData.REPORTING_TEAM_COLUMN, filePath);
	}

	@When("^Select Team Lead from the drop-down$")
	public void selectIOLeadName() throws Throwable {
	String iOLead = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_NAME, filePath);
		teams.selectTeamlead(iOLead);
	}

	@When("^Select Team Member for the drop-down$")
	public void selectIOMemberName() throws Throwable {
		String iOMember = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_MEMBER_NAME, filePath);
		teams.selectMember(iOMember);
	}
	
	@When("^Select Reporting Lead from the drop-down$")
	public void selectReportingLead() throws Throwable {
	String iOLead = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_NAME, filePath);
		teams.selectTeamlead(iOLead);
	}

	@When("^Select Reporting Member for the drop-down$")
	public void selectReportingMember() throws Throwable {
		String iOMember = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_NAME, filePath);
		teams.selectMember(iOMember);
	}
	
	@When("^Verify Team created success message is display$")
	public void verifyTeamCreatedSuccessMessage() throws Throwable {
		teams.verifyTeamCreatedSuccessMessage();
	}

	@When("^Select Second Team Member for the drop-down$")
	public void select_Second_Team_Member_for_the_drop_down() throws Throwable {
	    
		String iOMember2 = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_NAME, filePath);
		teams.selectSecondMember(iOMember2);
	}
	
	@When("^Verify Team Updated success message is display$")
	public void verifyTeamUpdatedSuccessMessage() throws Throwable {
		teams.verifyTeamUpdatedSuccessMessage();
	}


	@When("^Clear Team Name and Add new team Name$")
	public void clear_Team_Name_and_Add_new_team_Name() throws Throwable {
		teams.clearTeamName();
		teams.enterTeamName(TeamData.IO_TEAM_NAME);
		readAndWrite.writeDataToExcelFile(TeamData.IO_TEAM_NAME, ExcelData.TEAM_DATA_SHEET, ExcelData.IO_TEAM_COLUMN, filePath);
	}
	
	@When("^Clear IoLead from Team$")
	public void clear_IoLead_name() throws Throwable {
		teams.clearIoLead();
	}
	
	@When("^Select Second Iolead from the drop-down$")
	public void select_Second_Iolead_from_the_drop_down() throws Throwable {
		String iOLead = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_LEAD_NAME, filePath);
		teams.selectTeamlead(iOLead);
	}
	
	@When("^Clear Io Member form team$")
	public void clear_IoMember_name() throws Throwable {
		teams.clearIoMember();
	}
	
	@When("^Select Second Team Member form the drop-down$")
	public void select_Second_Team_Member_form_the_drop_down() throws Throwable {
		String iOMember = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_NAME, filePath);
		teams.selectMember(iOMember);
	}
	
	@When("^Click on Teams in left panel$")
	public void clickTeamsInLeftPanel() throws Throwable {
	    teams.clickTeamsInLeftPanel();
	}
	
	@Then("^Verify Teams page should display successfully$")
	public void verifyTeamsShouldDisplaySuccessfully() throws Throwable {
		teams.verifyTeamsShouldDisplaySuccessfully();
	    
	}

}
