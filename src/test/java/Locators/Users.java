package Locators;

public class Users {
	
	public class locators{
		
		public static final String ADD_USER                     = "//a[text()='Add User']",
                                   SELECT_HQ                    = "//ng-select[@id='reportingHQ']//input[@type='text']",
                                   SELECT_POLICE_STATION        = "//ng-select[@id='policeStation']//input[@type='text']",
                                   MILITRY_NUMBER               = "//input[@id='militaryNumber']",
                                   RANK							= "//ng-select[@id='rank']//input[@type='text']",
                                   USER_NAME				    = "//input[@id='name']",
                                   EMAIL             			= "//input[@id='email']",
                                   PHONE_NUMBER                 = "phone",
                                   TRAINING_NUMBER              = "trainingNumber",
                                   SELECT_ROLE					= "//ng-select[@id='role']//input[@type='text']",
                                   OTHER_ROLE                   = "//ng-select[@id='optionalRole']//input[@type='text']",
                                   ADD_USER_HEADER				= "//h4[@class='head ng-star-inserted']",
								   SUCESS_MSG					= "//div[contains(text(),'User has been added successfully')]",								  		  							      
							       USER_ROLE                    = "//ng-select[@id='role']//input[@type='text']",
							       ROLE_NAME                    = "roleNameAlias",
							       USER_STATUS_PART1            = "//tbody/tr/td[text()='",
								   USER_STATUS_PART2            = "']/parent::tr/td[text()='",
								   USER_STATUS_PART3            = "']/parent::tr/td/span[text()='",
								   USER_STATUS_PART4            = "']/parent::td/parent::tr//td[text()='",
								   CLEAR_ALL_PART1              = "//div/label[contains(text(),'",
								   CLEAR_ALL_PART2              = "')]/following-sibling::ng-select/div//span[@title='Clear all']";
	}

}
