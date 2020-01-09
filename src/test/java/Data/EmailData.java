package Data;

import Utility.ReaderAndWriteDataFromExcel;

public class EmailData {
	
	public EmailData() throws Exception{
	}
	ReaderAndWriteDataFromExcel readAndWriteToExcel = new ReaderAndWriteDataFromExcel();
	
	static String fileName                          =  "CaseData",
			      time_sec                          = ""+System.currentTimeMillis();
	
	public static final String USER_NAME            = "User_name",
			                   USER_EMAIL_ID		= "Emailid",
			                   MALINATOR_URL        = "https://www.mailinator.com/";
				              				              
    public static String SUPER_ADMIN_EMAIL          = "sup"+ time_sec.substring(5, 12)+"@mailinator.com",
                         ADMIN_USER_EMAIL           = "ad"+ time_sec.substring(5, 12)+"@mailinator.com",
    		             IO_LEAD_EMAIL_ID           = "ioLead"+ time_sec.substring(5, 12)+"@mailinator.com",
    		             IO_MEMBER_EMAIL_ID         = "ioMember"+ time_sec.substring(5, 12)+"@mailinator.com",
    		             REPORTING_LEAD_EMAIL_ID    = "repoLead"+ time_sec.substring(5, 12)+"@mailinator.com",
    		             REPORTING_MEMBER_EMAIL_ID  = "repoMember"+ time_sec.substring(5, 12)+"@mailinator.com", 		            
    		             IO_LEAD_EMAIL_ID2          = "ioLead2"+ time_sec.substring(5, 12)+"@mailinator.com",
    		             IO_MEMBER_EMAIL_ID2        = "ioMember2"+ time_sec.substring(5, 12)+"@mailinator.com";
    
    public static int COUNT_ZERO                    = 0;

}
