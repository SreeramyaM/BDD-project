package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.EmailData;
import Data.ExcelData;
import Data.TeamData;
import PageObjects.DashboardPage;
import PageObjects.UsersPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Users extends BaseTest {
	public WebDriver driver;

	public Users() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, UsersPage.class);
	}

	UsersPage user = PageFactory.initElements(driver, UsersPage.class);
	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");
	CaseData caseData = new CaseData();
	public static String tempPassword;

	@When("^Click on Add User in Dashbaord$")
	public void click_on_Add_User_in_Dashbaord() throws Throwable {
		user.clickOnAddUser();
	}

	@When("^Select Reporting HQ \"(.*?)\"$")
	public void select_Reporting_HQ(String ReportingHQ) throws Throwable {
		user.selectHQ(ReportingHQ);
	}

	@When("^Select Police Station \"(.*?)\"$")
	public void select_Police_Station(String PoliceStation) throws Throwable {
		user.selecPoliceStation(PoliceStation);
	}

	@When("^Select Ranks \"(.*?)\"$")
	public void select_Ranks(String Rank) throws Throwable {
		user.selectRank(Rank);
	}

	@When("^Select user role \"(.*?)\"$")
	public void select_User(String Role) throws Throwable {
		user.selectOtherRole(Role);
	}

	@When("^Enter Military / Civilian Number$")
	public void enter_Military_Civilian_Number() throws Throwable {
		user.enterMilitryNumber(CaseData.MILITARY_CIVILIAN_NUMBER);
	}

	@When("^Enter Admin name$")
	public void enterAdminName() throws Throwable {
		user.enterUserName(CaseData.ADMIN_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.ADMIN_NAME, ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_NAME,
				filePath);
	}

	@When("^Enter Super Admin name$")
	public void enterSuperAdminName() throws Throwable {
		user.enterUserName(CaseData.SUPER_ADMIN_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.SUPER_ADMIN_NAME, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.SUPER_ADMIN_NAME, filePath);
	}

	@When("^Enter IO Lead Name$")
	public void enterIOLeadName() throws Throwable {
		user.enterUserName(CaseData.IO_LEAD_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.IO_LEAD_NAME, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IO_LEAD_NAME, filePath);
	}

	@When("^Enter IO Member Name$")
	public void enterIOMemberName() throws Throwable {
		user.enterUserName(CaseData.IO_MEMBER_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.IO_MEMBER_NAME, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IO_MEMBER_NAME, filePath);
	}

	@When("^Enter Reporting Lead Name$")
	public void enterReportingLeadName() throws Throwable {
		user.enterUserName(CaseData.REPO_LEAD_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.REPO_LEAD_NAME, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_LEAD_NAME, filePath);
	}

	@When("^Enter Reporting Member Name$")
	public void enterReportingMemberName() throws Throwable {
		user.enterUserName(CaseData.REPO_MEMBER_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.REPO_MEMBER_NAME, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_MEMBER_NAME, filePath);
	}

	@When("^Enter Admin User Official Email Id$")
	public void enterAdminEmailId() throws Throwable {
		user.enterUserMailId(EmailData.ADMIN_USER_EMAIL);
		readAndWrite.writeDataToExcelFile(EmailData.ADMIN_USER_EMAIL, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.ADMIN_COLUMN, filePath);
	}

	@When("^Enter Super Admin User Official Email Id$")
	public void enterSuperAdminEmailId() throws Throwable {
		user.enterUserMailId(EmailData.SUPER_ADMIN_EMAIL);
		readAndWrite.writeDataToExcelFile(EmailData.SUPER_ADMIN_EMAIL, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.SUPER_ADMIN_COLUMN, filePath);
	}

	@When("^Enter IO Lead Official Email Id$")
	public void enterIOLeadEmialID() throws Throwable {
		user.enterUserMailId(EmailData.IO_LEAD_EMAIL_ID);
		readAndWrite.writeDataToExcelFile(EmailData.IO_LEAD_EMAIL_ID, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IO_LEAD_COLUMN, filePath);
	}

	@When("^Enter Reporting Lead Official Email Id$")
	public void enterReportingLeadEmialID() throws Throwable {
		user.enterUserMailId(EmailData.REPORTING_LEAD_EMAIL_ID);
		readAndWrite.writeDataToExcelFile(EmailData.REPORTING_LEAD_EMAIL_ID, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_LEAD_COLUMN, filePath);
	}

	@When("^Enter Reporting Member Official Email Id$")
	public void enterReportingMemberEmialID() throws Throwable {
		user.enterUserMailId(EmailData.REPORTING_MEMBER_EMAIL_ID);
		readAndWrite.writeDataToExcelFile(EmailData.REPORTING_MEMBER_EMAIL_ID, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_MEMBER_COLUMN, filePath);
	}

	@When("^Enter IO Member Official Email Id$")
	public void enterIOMemberEmialID() throws Throwable {
		user.enterUserMailId(EmailData.IO_MEMBER_EMAIL_ID );
		readAndWrite.writeDataToExcelFile(EmailData.IO_MEMBER_EMAIL_ID, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IO_MEMBER_COLUMN, filePath);
	}

	@When("^Enter official Phone Number$")
	public void enter_Official_PhoneNumber() throws Throwable {
		user.enterPhoneNumber(CaseData.PHONE_NUMBER);
	}

	@When("^Enter Admin Training Certification Number$")
	public void admin_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.ADMIN_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.ADMIN_TRAINING_NUMBER, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.ADMIN_TRAINING_NUMBER, filePath);
	}

	@When("^Enter IO Lead Training Certification Number$")
	public void IOLead_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.IO_LEAD_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.IO_LEAD_TRAINING_NUMBER, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IOLEAD_TRAINING_NUMBER, filePath);
	}

	@When("^Enter Reporting Lead Training Certification Number$")
	public void reporting_Lead_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.REPO_LEAD_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.REPO_LEAD_TRAINING_NUMBER, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_LEAD_TRAINING_NUMBER, filePath);
	}

	@When("^Enter IO Member Training Certification Number$")
	public void io_Member_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.IO_MEMBER_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.IO_MEMBER_TRAINING_NUMBER, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.IOMEMBER_TRAINING_NUMBER, filePath);
	}

	@When("^Enter Reporting Member Training Certification Number$")
	public void reporting_Member_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.REPO_MEMBER_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.REPO_MEMBER_TRAINING_NUMBER, ExcelData.LOGIN_USER_SHEET_NAME,
				ExcelData.REPORTING_MEMBER_TRAINING_NUMBER, filePath);
	}

	@When("^Select Primary Role \"(.*?)\"$")
	public void selecPrimaryRole(String userRole) throws Throwable {
		user.selectPrimaryRole(userRole);
	}

	@When("^Select Other Roles \"(.*?)\"$")
	public void selectUserRole(String userRole) throws Throwable {
		user.selectOtherRole(userRole);
	}

	@When("^Select user Role Name")
	public void enterUserRoleName() throws Throwable {
		user.enterRoleName(CaseData.ROLE_NAME);
	}

	@When("^Verify created Admin User is displayed in Manage users page \"(.*?)\" \"(.*?)\"$")
	public void verifyCreatedAdminUser(String ReportingHQ, String rank) throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.ADMIN_NAME, filePath);
		user.adminUserStatus(name, ReportingHQ, rank, CaseData.ACTIVE_STATUS);
	}

	@Then("^Verify created super Admin User is displayed in Manage Super admin page \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedSuperAdminUser(String ReportingHQ, String rank) throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.SUPER_ADMIN_NAME, filePath);
		user.superAdminUserStatus(name, ReportingHQ, rank, CaseData.ACTIVE_STATUS);
	}

	@Then("^Verify IO Lead User is displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedIOLeadUser(String primaryRole, String otherRole, String policeStation, String rank)
			throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_LEAD_NAME,
				filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}

	@When("^Verify created Reporting Lead User is displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedReportingLeadUser(String primaryRole, String otherRole, String policeStation, String rank)
			throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_LEAD_NAME,
				filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}

	@When("^Verify created IO Member Lead User is displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedIoMemberUser(String primaryRole, String otherRole, String policeStation, String rank) throws Throwable {
		
		String name = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.IO_MEMBER_NAME,
				filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}

	@When("^Verify created Reporting Member User is displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedReportingMemberUser(String primaryRole, String otherRole, String policeStation, String rank) throws Throwable {
		String name   = readAndWrite.readingDataFromExcel(ExcelData.LOGIN_USER_SHEET_NAME, ExcelData.REPORTING_MEMBER_NAME, filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}

	@When("^Enter IO Member Name2$")
	public void enterIOMemberName2() throws Throwable {
		user.enterUserName(CaseData.IO_MEMBER_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.IO_MEMBER_NAME, ExcelData.TEMP_USER,
				ExcelData.IO_MEMBER_NAME, filePath);
	}
	
	@When("^Enter IO Member Official second Email Id$")
	public void enterIOMemberEmialID2() throws Throwable {
		user.enterUserMailId(EmailData.IO_MEMBER_EMAIL_ID2);
		readAndWrite.writeDataToExcelFile(EmailData.IO_MEMBER_EMAIL_ID2, ExcelData.TEMP_USER,
				ExcelData.IO_MEMBER_COLUMN, filePath);
	}
	
	@When("^Enter Second IO Member Training Certification Number$")
	public void second_io_Member_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.IO_MEMBER_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.IO_MEMBER_TRAINING_NUMBER, ExcelData.TEMP_USER,
				ExcelData.IOMEMBER_TRAINING_NUMBER, filePath);
	}
	
	@When("^Verify created Second IO Member Lead User is displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedSecondIoMemberUser(String primaryRole, String otherRole, String policeStation, String rank) throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_MEMBER_NAME,
				filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}
	
	@When("^Enter Second IO Lead Name$")
	public void enterSecondIOLeadName() throws Throwable {
		user.enterUserName(CaseData.IO_LEAD_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.IO_LEAD_NAME, ExcelData.TEMP_USER,
				ExcelData.IO_LEAD_NAME, filePath);
	}

	@When("^Enter Second IO Lead Official Email Id$")
	public void enterSecondIOLeadEmialID() throws Throwable {
		user.enterUserMailId(EmailData.IO_LEAD_EMAIL_ID2);
		readAndWrite.writeDataToExcelFile(EmailData.IO_LEAD_EMAIL_ID2, ExcelData.TEMP_USER,
				ExcelData.IO_LEAD_COLUMN, filePath);
	}

	@When("^Enter Second IO Lead Training Certification Number$")
	public void SeccondIOLead_Training_Certification_Number() throws Throwable {
		user.enterTrainingNumber(caseData.IO_LEAD_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.IO_LEAD_TRAINING_NUMBER, ExcelData.TEMP_USER,
				ExcelData.IOLEAD_TRAINING_NUMBER, filePath);
	}

	@Then("^Verify created Second IO Lead User isk displayed in Manage users page \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void verifyCreatedSeccondIOLeadUser(String primaryRole, String otherRole, String policeStation, String rank)
			throws Throwable {
		String name = readAndWrite.readingDataFromExcel(ExcelData.TEMP_USER, ExcelData.IO_LEAD_NAME,
				filePath);
		user.userStatus(name, primaryRole, otherRole, CaseData.ZERO_CASE_COUNT, policeStation, rank,
				CaseData.ACTIVE_STATUS);
	}
	
	@When("^Clear ReportingHQ and Add New ReportingHQ \"(.*?)\"$")
	public void clearReportingHQAndAddNewReportingHQ(String ReportingHQ) throws Throwable {
		user.clear(TeamData.REPORTINGHQ);
		user.selectHQ(ReportingHQ);	
	}
	
	@When("^Clear Police Station and Add New Police Station \"(.*?)\"$")
	public void clearPoliceStationandAddNewPolice_Station(String PoliceStation) throws Throwable {
		user.clear(TeamData.POLICE_STATION);
		user.selecPoliceStation(PoliceStation);
	}
	
	@When("^Clear Military / Civilian Number and New Enter Military / Civilian Number$")
	public void clearMilitaryAndNewEnterMilitaryNumber() throws Throwable {
	   user.clearMilitaryNumber();
	   user.enterMilitryNumber(CaseData.MILITARY_CIVILIAN_NUMBER);
	}

	@When("^Clear Rank and Add New Ranks \"(.*?)\"$")
	public void clearRankAndAddNewRanks(String Rank) throws Throwable {
	   user.clear(TeamData.RANK);
	   user.selectRank(Rank);
	}
	
	@When("^Claer Primay Role And New Role \"(.*?)\"$")
	public void claerPrimayRoleAndNewRole(String userRole) throws Throwable {
		user.clear(TeamData.PRIMARY_ROLE);
		user.selectPrimaryRole(userRole);
	}
	
	@When("^Clear Other Roles and New Other Role \"(.*?)\"$")
	public void clearOtherRolesAndNewOtherRole(String userRole) throws Throwable {
		user.clear(TeamData.OTHER_ROLES);
		user.selectOtherRole(userRole);
	}
	
	@When("^Claer Offical Phone Number and Add New Phone Number$")
	public void claer_Offical_Phone_Number_and_Add_New_Phone_Number() throws Throwable {
		user.clearPhoneNumber();
		user.enterPhoneNumber(CaseData.PHONE_NUMBER);
	}
	@When("^Enter Admin name in Temp Sheet$")
	public void enter_Admin_name_in_Temp_Sheet() throws Throwable {
	   
		user.enterUserName(CaseData.ADMIN_NAME);
		readAndWrite.writeDataToExcelFile(CaseData.ADMIN_NAME, ExcelData.TEMP_USER, ExcelData.ADMIN_NAME,
				filePath);
	}

	@When("^Enter Admin Training Certification Number in Temp Sheet$")
	public void enter_Admin_Training_Certification_Number_in_Temp_Sheet() throws Throwable {
		user.enterTrainingNumber(caseData.ADMIN_TRAINING_NUMBER);
		readAndWrite.writeDataToExcelFile(caseData.ADMIN_TRAINING_NUMBER, ExcelData.TEMP_USER,
				ExcelData.ADMIN_TRAINING_NUMBER, filePath);
	}
	
}
