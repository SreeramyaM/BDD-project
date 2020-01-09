package Locators;

public class Report {
	
	public class locators{
		
		public static final String EMAIL_ID                    = "email",
                                   PASSWORD                    = "password",
                                   LOGIN                       = "//button[text()='Login']",
                                   LOGOUT                      = "//a[@title='Logout']",
                                   LOGOUT_SUCCESS_MESSAGE      = "//div[contains(text(),'You have been logged out successully!')]",
                                   HOME_PAGE                   = "//img[@title='iMAGENEcsi']",
                                   INVALID_LOGIN_ERROR_MESSAGE = "//span[text()='Invalid email or password']",
									REPORT_BUTTON				=  "//button[contains(.,'Reports')]",
									ACCEPT_BUTTON				= "//button[text()='Accept']";
								
	}

}
