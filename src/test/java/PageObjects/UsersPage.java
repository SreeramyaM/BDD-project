package PageObjects;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Locators.Dashboard;
import Locators.Users.locators;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;

public class UsersPage extends BrowserBot {

	public UsersPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(UsersPage.class.getName());
	public String teamname;
	public String emailid;
	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String filePath = readPropertyFiles.pathToUploadFile("CaseData");

	public void clickOnAddUser() throws Exception {
		click(locators.ADD_USER, "xpath");
	}

	public void verifyAddUserpage() throws Exception {
		isElementPresent(locators.ADD_USER_HEADER, "xpath");
	}

	public void selectHQ(String ReportingHQ) throws Exception {
		sendKeys(locators.SELECT_HQ, "xpath", ReportingHQ);
		clickByEnterKey(locators.SELECT_HQ, "xpath");
	}

	public void selecPoliceStation(String PoliceStation) throws Exception {
		sendKeys(locators.SELECT_POLICE_STATION, "xpath", PoliceStation);
		clickByEnterKey(locators.SELECT_POLICE_STATION, "xpath");
	}

	public void enterMilitryNumber(String militaryNumber) throws Exception {
		enterNumbers(locators.MILITRY_NUMBER, "xpath", "MiltaryNum", 5);
	}

	public void selectPrimaryRole(String Role) throws Exception {
		sendKeys(locators.SELECT_ROLE, "xpath", Role);
		clickByEnterKey(locators.SELECT_ROLE, "xpath");
	}

	public void selectOtherRole(String Role) throws Exception {
		sendKeys(locators.OTHER_ROLE, "xpath", Role);
		clickByEnterKey(locators.OTHER_ROLE, "xpath");
	}

	public void selectRank(String Rank) throws Exception {
		sendKeys(locators.RANK, "xpath", Rank);
		clickByEnterKey(locators.RANK, "xpath");
	}

	public void enterUserName(String username) throws Exception {
		sendKeys(locators.USER_NAME, "xpath", username);
	}

	public void enterUserMailId(String Email) throws Exception {
		sendKeys(locators.EMAIL, "xpath", Email);
	}

	public void enterPhoneNumber(String Email) throws Exception {
		sendKeys(locators.PHONE_NUMBER, "id", Email);
	}

	public void enterTrainingNumber(String trainingNumber) throws Exception {
		sendKeys(locators.TRAINING_NUMBER, "id", trainingNumber);
	}

	public void selectUserRole(String userRole) throws Exception {
		sendKeys(locators.USER_ROLE, "xpath", userRole);
		clickByEnterKey(locators.USER_ROLE, "xpath");
	}

	public void enterRoleName(String Role) throws Exception {
		sendKeys(locators.ROLE_NAME, "id", Role);
	}

	public void superAdminUserStatus(String name, String policeStation, String rank, String status) throws Exception {
		waitForElementAppearance(locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + policeStation
				+ locators.USER_STATUS_PART2 + rank + locators.USER_STATUS_PART2 + status
				+ Dashboard.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(
				locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + policeStation
						+ locators.USER_STATUS_PART2 + rank + locators.USER_STATUS_PART2 + status
						+ Dashboard.locators.CLOSE_XPATH,
				"xpath", "Error Info: Created user is not display in Dashboard");
	}

	public void userStatus(String name, String primaryRole, String otherRole, String caseCount, String policeStation,
			String rank, String status) throws Exception {
		waitForElementAppearance(locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + primaryRole
				+ locators.USER_STATUS_PART2 + otherRole + locators.USER_STATUS_PART2 + caseCount
				+ locators.USER_STATUS_PART2 + policeStation + locators.USER_STATUS_PART3 + rank
				+ locators.USER_STATUS_PART4 + status + Dashboard.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(
				locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + primaryRole
						+ locators.USER_STATUS_PART2 + otherRole + locators.USER_STATUS_PART2 + caseCount
						+ locators.USER_STATUS_PART2 + policeStation + locators.USER_STATUS_PART3 + rank
						+ locators.USER_STATUS_PART4 + status + Dashboard.locators.CLOSE_XPATH,
				"xpath", "Error Info: Created user is not display in Dashboard");
	}

	public void adminUserStatus(String name, String policeStation, String rank, String status) throws Exception {
		waitForElementAppearance(locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + policeStation
				+ locators.USER_STATUS_PART3 + rank + locators.USER_STATUS_PART4 + status
				+ Dashboard.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.USER_STATUS_PART1 + name + locators.USER_STATUS_PART2 + policeStation
						+ locators.USER_STATUS_PART3 + rank + locators.USER_STATUS_PART4 + status+ Dashboard.locators.CLOSE_XPATH,
				"xpath", "Error Info: Created user is not display in Dashboard");
	}
	
	public void clear(String textBoxName) throws Exception {
		waitForElementAppearance(locators.CLEAR_ALL_PART1 +textBoxName+locators.CLEAR_ALL_PART2, "xpath");
		click(locators.CLEAR_ALL_PART1 +textBoxName+locators.CLEAR_ALL_PART2, "xpath");
	} 

	public void clearMilitaryNumber() throws Exception{
		clearInPutField(locators.MILITRY_NUMBER, "xpath");
	}

	public void clearPhoneNumber() throws Exception {
		clearInPutField(locators.PHONE_NUMBER, "id");
	}
}
