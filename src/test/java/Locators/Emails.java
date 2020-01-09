package Locators;

public class Emails {
	
	public class locators{
		
		public static final String CASE_CREATED                      = "//td[contains(text(),'Case Created')]",
								   WELCOME_EMAIL	  		         = "//td[contains(text(),'Welcome to iMAGENEcsi')]",
								   lOGIN_DETAILS_EMAIL	  	         = "//td[contains(text(),'iMAGENEcsi - Login details')]",
								   TEMP_PASSWORD                     =  "//tr/td/p[text()='Password:']/parent::td/parent::tr//span",
								   USRE_NAME_FROM_MAILINATOR	     = "(//a[contains(@target,'_other')])[1]";
	}

}
