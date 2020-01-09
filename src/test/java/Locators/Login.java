package Locators;

public class Login {
	
	public class locators{
		
		public static final String EMAIL_ID                     = "email",
                                   PASSWORD                     = "textPassword",
                                   LOGIN                        = "//button[text()='Login']",
                                   LOGOUT                       = "//a[@title='Logout']",
                                   LOGOUT_SUCCESS_MESSAGE       = "//div[contains(text(),'You have been logged out successully!')]",
                                   IT_CONFIG_HOME_PAGE          = "//div[@title='Profile']/div[text()='Gen. azam it config']/following-sibling::div[text()='IT Config']",
        						   MAILINATOR_EMIAL_FIELD       =  "//input[@type='text'][@id='inboxfield']",
                                   INVALID_LOGIN_ERROR_MESSAGE  = "//span[text()='Invalid email or password']",
        						   GO_BUTTON					= "//button[contains(text(),'Go!')]",
        						   UPDATE_BUTTON				= "//button[text()='Update']",
        						   FORGOT_PASSWORD              = "//img[@title='Forgot password']",
        						   FORGOT_PASSWORD_PAGE         = "//div[text()='Forgot Password']",
        						   UPDATE_PASSWORD_PAGE		    = "//div[text()='Update Password']",
        						   NEW_PASSWORD				    = "newpassword",
        						   CONFIRM_PASSWORD			    = "confirmPassword",
        						   CURRENT_PASSWORD             = "textPassword",
        						   YES                          = "yesClick",
        						   CIRTIFICATE_NUMBER           = "certificationNo",
        						   VERIFY                       = "verifyClick",
        						   LOGO							= "refresh",
        						   TRAINING_MESSAGE             = "//div[text()='To use the iMAGENEcsi application, training is mandatory.'][text()=' Have you completed the application training?']",
		 					       PASSWORD_ATTEMPT				= "//span[text()=concat('You have made 1 unsuccessful attempt(s). The maximum retry attempts allowed for login are 5. To generate new password, use ',\"'\",'Forgot Password',\"'\",' option.')]",
								   USER_PROFILE                 = "//div[@class='editprofile ']/img",
								   CHANGE_PASSWORD 				= "//a[text()='Change Password']",
								   SUBMIT                       = "//button[contains(text(),'Submit')]",
								   SUBMIT1                      = "//button[@class='btn btn-primary']",
								   CUR_NEW_PASSWORD             =  "//input[@id='newTextPassword']",
								   PASSWORD_UPDATE_SUCCESS_MSG  = "//div[text()=' Password has been successfully updated! ']",
								   CUR_CONF_PASSWORD            = "//input[@id='confirmTextPassword']";
								   
        							       
	}

}
