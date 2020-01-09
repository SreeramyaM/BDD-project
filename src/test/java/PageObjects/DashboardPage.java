package PageObjects;
import static org.testng.Assert.assertEquals;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Locators.CreateNewCase;
import Locators.Dashboard;
import Locators.Dashboard.locators;
import Utility.FileDownloaded;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;

public class DashboardPage extends BrowserBot {

	public DashboardPage(WebDriver driver) throws Exception {
		super(driver);

		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(LoginPage.class.getName());
	ReaderAndWriteDataFromExcel txtFileWriter = new ReaderAndWriteDataFromExcel();
	ReadPropertyFiles readPropertiesFiles=new ReadPropertyFiles();
	String downloadCaselist1=readPropertiesFiles.pathToUploadFile("CaseListPdf1");
	String downloadCaselist=readPropertiesFiles.pathToUploadFile("CaseListPdf");
	FileDownloaded fileDownloaded         =new FileDownloaded();
	

	public void selectNewCase() throws Exception {
		waitForElementAppearance(locators.NEW_CASE, "xpath");
		clickByJS(locators.NEW_CASE, "xpath");
	}

	public void verifyiCaseID(String caseID) throws Exception {
		waitForElementAppearance(locators.CASEID + caseID + locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASEID + caseID + locators.CLOSE_XPATH, "xpath",
				"Error Info: Case Id is not display");
	}
	

	public void selectViewDetails(String caseID) throws Exception {
		click(locators.VIEW_DETAILS_PART1 + caseID + locators.VIEW_DETAILS_PART2, "xpath");
	}

	public void verifyDashboardPageIsDisplay() throws Exception {
		waitForElementAppearance(locators.DASHBOARD, "xpath");
		verifyTextIsPresent(locators.DASHBOARD, "xpath", "Error Info: Dashboard page is not display");
	}

	public void clickOnDashboard() throws Exception {
		waitForElementAppearance(locators.DASHBOARD_ICON, "xpath");
		click(locators.DASHBOARD_ICON, "xpath");
	}

	public void verifyCaseStatus(String caseID, String status) throws Exception {
		waitForElementAppearance(locators.DRAFT_STATUS_PART1 + caseID + locators.DRAFT_STATUS_PART2, "xpath");
		String fullStatus[] = getText(locators.DRAFT_STATUS_PART1 + caseID + locators.DRAFT_STATUS_PART2, "xpath")
				.split(":");
		String actualStatus = fullStatus[fullStatus.length - 1];
		assertEquals(actualStatus, status);
	}

	public void clickOnViewDetailsButton(String caseId) throws Exception {
		waitForElementAppearance(locators.VIEW_DETAILS_PART1 + caseId + locators.VIEW_DETAILS_PART2, "xpath");
		clickByJS(locators.VIEW_DETAILS_PART1 + caseId + locators.VIEW_DETAILS_PART2, "xpath");
	}

	public void verifyAssignedCaseID(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: Assigned Case Id is not display");
	}

	public void verifyCaseIsNotDisplay(String caseID) throws Exception {
		verifyTextIsNotPresent(Dashboard.locators.DRAFT_STATUS_PART1 + caseID + Dashboard.locators.DRAFT_STATUS_PART2,
				"xpath", "case is dispaled in dashbaord");
	}

	public void verifyUserNameIsDisplayInDashboard(String userName) throws Exception {
		waitForElementAppearance(locators.USER_NAME + userName + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.USER_NAME + userName + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: User Name is not display");
	}

	public void clickOnAdminMenu() throws Exception {
		click(locators.ADMIN, "xpath");
	}

	public void clickSuperAdminMenu() throws Exception {
		click(locators.SUPER_ADMIN, "xpath");
	}

	public void clickAddSuperAdminMenu() throws Exception {
		waitForElementAppearance(locators.ADD_SUPER_ADMIN, "xpath");
		click(locators.ADD_SUPER_ADMIN, "xpath");
	}

	public void clickOnUsers() throws Exception {
		waitForElementAppearance(locators.USERS, "id");
		click(locators.USERS, "id");
	}
	
	public void clickOnAddUsers() throws Exception {
		waitForElementAppearance(locators.ADD_USER, "xpath");
		clickByJS(locators.ADD_USER, "xpath");
	}
	
	public void clickOnDownloadBtn() throws Exception {
		fileDownloaded.deleteExistingFile(downloadCaselist);
		waitForElementAppearance(locators.Download_button, "xpath");
		click(locators.Download_button, "xpath");
		Thread.sleep(2000);
	}
	
	public void clickOnCases() throws Exception {
		waitForElementAppearance(locators.CASES, "xpath");
		clickByJS(locators.CASES, "xpath");
	}

	public void clickOnManageUsers() throws Exception {
		waitForElementAppearance(locators.USERS, "id");
		click(locators.USERS, "id");
		waitForElementAppearance(locators.MANAGE_USER, "xpath");
		clickByJS(locators.MANAGE_USER, "xpath");
	}

	public void clickOnAddAdminButton() throws Exception {
		click(locators.ADD_ADMIN, "xpath");
	}

	public void clickOnAddTeamUnderTeams() throws Exception {
		waitForElementAppearance(locators.TEAMS, "id");
		click(locators.TEAMS, "id");
		waitForElementAppearance(locators.ADD_TEAMS, "xpath");
		click(locators.ADD_TEAMS, "xpath");
	}

	public void clickOnManageTeamUnderTeams() throws Exception {
		waitForElementAppearance(locators.TEAMS, "id");
		click(locators.TEAMS, "id");
		waitForElementAppearance(locators.ADD_TEAMS, "xpath");
		click(locators.MANAGE_TEAMS, "xpath");
	}

	public void clickOnAdvanceSearch() throws Exception {
		waitForElementAppearance(locators.ADVANCE_SEARCH, "xpath");
		clickByJS(locators.ADVANCE_SEARCH, "xpath");
	}

	public void clickOnNTP() throws Exception {
		waitForElementAppearance(locators.NOT_TO_PROCEED_BUTTON, "xpath");
		clickByJS(locators.NOT_TO_PROCEED_BUTTON, "xpath");
	}

	public void clickOnNTPBTN() throws Exception {
		waitForElementAppearance(locators.NOT_TO_PROCEED_BUTTON, "xpath");
		clickByJS(locators.NTP_BTN, "xpath");
	}

	public void enterNTPComment() throws Exception {
		waitForElementAppearance(locators.ADD_COMMENT, "xpath");
		sendKeys(locators.ADD_COMMENT, "xpath", "Marking as Ntp this case");
	}

	public void verifyNTPSucessMsg() throws Exception {
		waitForElementAppearance(locators.NTP_SUCESS_MSG, "xpath");
		verifyText(locators.NTP_SUCESS_MSG, "xpath", "Case has been successfully updated to 'Not to proceed' status!",
				"Not sucessfully marked as NTP");
	}

	public void clickOnDNC() throws Exception {
		waitForElementAppearance(locators.DNC_BUTTON, "xpath");
		clickByJS(locators.DNC_BUTTON, "xpath");
	}

	public void clickOnDataNonCompliance() throws Exception {
		waitForElementAppearance(locators.DATA_NON_COMPLIANCE, "xpath");
		clickByJS(locators.DATA_NON_COMPLIANCE, "xpath");
	}

	public void enterDNCComment() throws Exception {
		waitForElementAppearance(locators.ADD_COMMENT, "xpath");
		sendKeys(locators.ADD_COMMENT, "xpath", "Marking as data non compliance this case");
	}

	public void VerifyDNCSucessMsg() throws Exception {
		waitForElementAppearance(locators.NTP_SUCESS_MSG, "xpath");
		verifyText(locators.DNC_SUCESS_MSG, "xpath",
				"Case has been successfully updated to \"Data non-compliance\" status!",
				"Not sucessfully marked as DNC");
	}

	public void clickOnSuspendButton() throws Exception {
		waitForElementAppearance(locators.SUSPEND_Menu, "xpath");
		clickByJS(locators.SUSPEND_Menu, "xpath");
	}

	public void clickOnSuspendButtononcomment() throws Exception {
		waitForElementToBeClickable(locators.SUSPEND_BTN, "xpath");
		clickByJS(locators.SUSPEND_BTN, "xpath");
	}

	public void enterSuspendComment() throws Exception {
		waitForElementAppearance(locators.ADD_COMMENT, "xpath");
		sendKeys(locators.ADD_COMMENT, "xpath", "Suspending this case");
	}

	public void VerifySuspendSucessMsg() throws Exception {
		waitForElementAppearance(locators.SUSPEND_SUC_MSG, "xpath");
		verifyText(locators.SUSPEND_SUC_MSG, "xpath", "Case has been successfully suspended!", "Not Suspended");
	}

	public void clickOnResumeButton() throws Exception {
		Thread.sleep(5000);
		waitForElementAppearance(locators.RESUME_BTN, "css");
		waitForElementToBeClickable(locators.RESUME_BTN, "css");
		click(locators.RESUME_BTN, "css");
	}

	public void clickOnResumeButtonOnComment() throws Exception {
		waitForElementAppearance(locators.RESUME_Comment_btn, "xpath");
		clickByJS(locators.RESUME_Comment_btn, "xpath");
	}

	public void resumebtnPresent() throws Exception {
		waitForElementAppearance(locators.RESUME_BTN, "css");
		isElementPresent(locators.RESUME_BTN, "css");
	}

	public void suspendbtnPresent() throws Exception {
		waitForElementAppearance(locators.SUSPEND_Menu, "xpath");
		isElementPresent(locators.SUSPEND_Menu, "xpath");
	}

	public void enterResumeComment() throws Exception {
		waitForElementAppearance(locators.ADD_COMMENT, "xpath");
		sendKeys(locators.ADD_COMMENT, "xpath", "Resumeing the case");
	}

	public void verifyResumeSucessMsg() throws Exception {
		waitForElementAppearance(locators.RESUME_SUC_MSG, "xpath");
		verifyText(locators.RESUME_SUC_MSG, "xpath", "Case has been successfully resumed!", "Not able to Resume");
	}
	
	public void verifyFileDownload() throws Exception {
		fileDownloaded.verifyisFileDownloaed(downloadCaselist1, "CaseList.pdf");	
	}
	
	public void verifyFileprotected() throws Exception {
		fileDownloaded.verifyPassswordProtected(downloadCaselist);	
	}
	
	public void selectUser(String roleName) throws Exception {
		waitForElementAppearance(locators.SELECTED_ROLE, "xpath");
		//String selectUserRole = getText(locators.SELECTED_ROLE, "xpath");
		click(locators.SELECTED_ROLE, "xpath");		
		
		/*System.out.println(selectUserRole);
		if (!selectUserRole.equals(roleName))
		{
			clickByJS(locators.ROLE_DROUP_DOWN, "xpath");
			clickByJS(locators.ROLE_PART_1 + roleName + locators.CLOSE_XPATH, "xpath");
		}*/
	}


	public void selectCases() throws Exception {
		waitForElementAppearance(locators.CASES, "xpath");
		click(locators.CASES, "xpath");
	}

   public void manageAdminMenu() throws Exception {
	   waitForElementAppearance(locators.MANAGE_ADMIN, "xpath");
	   click(locators.MANAGE_ADMIN, "xpath");	
   }
	
   public void editAdmin() throws Exception{
	   waitForElementAppearance(locators.EDIT_ADMIN, "xpath");
	   clickByJS(locators.EDIT_ADMIN, "xpath");	
   }
   
   public void toasterUserDetaisUpdated() throws Exception{
	   waitForElementAppearance(locators.TOAST_USER_EDIT_UPDATED, "xpath");
	   verifyText(locators.TOAST_USER_EDIT_UPDATED, "xpath", "User details have been successfully updated!", "User Details not updated");	
   }
   
  public void manageAdminDasboard() throws Exception{
	  waitForElementAppearance(locators.MANAGE_ADMIN_DASHBOARD, "xpath");
	   clickByJS(locators.MANAGE_ADMIN_DASHBOARD, "xpath");	
  }
  
 public void teamMenu() throws Exception{
	 waitForElementAppearance(locators.TEAMS_MAINMENU, "xpath");
	   clickByJS(locators.TEAMS_MAINMENU, "xpath");	 
 }
 
  public void editTeamAdmin() throws Exception{
	  waitForElementAppearance(locators.EDIT_TEAM_SUPERADMIN, "xpath");
	  clickByJS(locators.EDIT_TEAM_SUPERADMIN, "xpath");	 
  }
  
}
