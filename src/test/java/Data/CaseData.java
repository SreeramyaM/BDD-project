package Data;

import org.apache.commons.lang.RandomStringUtils;

public class CaseData {

		static String time_sec                        = ""+System.currentTimeMillis();

		public static String SUPER_ADMIN_NAME  		        = "SuperAdmin"+ time_sec.substring(6, 12),
							 ADMIN_NAME		   		        = "Admin"+ RandomStringUtils.randomNumeric(3),
				             IO_LEAD_NAME				    = "IOLead"+ RandomStringUtils.randomNumeric(3),
						     IO_MEMBER_NAME				    = "IOMember"+ RandomStringUtils.randomNumeric(6),
							 REPO_LEAD_NAME				    = "RepoLead"+ RandomStringUtils.randomNumeric(3),								
						     REPO_MEMBER_NAME			    = "RepoMember"+ RandomStringUtils.randomNumeric(3),
	                         ROLE_NAME                  	= "AutoRole"+ RandomStringUtils.randomNumeric(3),	                         
                             PHONE_NUMBER               	= ""+RandomStringUtils.randomNumeric(10),
		                     MILITARY_CIVILIAN_NUMBER   	= "Mil"+RandomStringUtils.randomNumeric(4);
		
	    public final String  CASE_ID                        = "Case_Id"+RandomStringUtils.randomNumeric(8),
	    		             REPO_MEMBER_CASE_ID            = "RepoCase"+RandomStringUtils.randomNumeric(6),
	                         ADMIN_TRAINING_NUMBER          = "ADMIN"+ RandomStringUtils.randomNumeric(3),
	                         IO_LEAD_TRAINING_NUMBER        = "IOLEAD"+ RandomStringUtils.randomNumeric(3),
	                         IO_MEMBER_TRAINING_NUMBER      = "IOMEM"+ RandomStringUtils.randomNumeric(3),
	                         REPO_LEAD_TRAINING_NUMBER      = "REPO"+ RandomStringUtils.randomNumeric(3),
	                         REPO_MEMBER_TRAINING_NUMBER    = "REMEM"+ RandomStringUtils.randomNumeric(3),
	                         STATION_NAME                   = "POL"+ RandomStringUtils.randomNumeric(2),
	                         ALIAS_NAME                     = "ALI"+ RandomStringUtils.randomNumeric(2);
	    
		public final static String  
				                   CASEID                    = "Case_Id",
				                   INVISTIGATION_LEAD        = "Invistigation_lead",
		                           CASE_NAME                 = "Case_name"+RandomStringUtils.randomNumeric(8),
		                           REPO_MEMBER_CASE_NAME     = "Repo_Case_name"+RandomStringUtils.randomNumeric(6),
		                           INVI_LEAD                 = "",
		                           PRIORITY_NORMAL           = "Normal",
		                           INVISTIGATION_TEAM        = "Team12403",
		                           DRAFT                     = "Draft",		                           
		                           FILE_TYPE_FISH_EYE        = "FISHEYE",
		                           EVIDENCE_IMAGE            = "EVIDENCE IMAGE",
		                           PDF 						 = "PDF",
		                           SKETCH 					 = "SKETCH",
		                           VIDEO             		 = "VIDEO",
		                           AUDIO 					 = "AUDIO",
		                           URL                       = "URL",
				                   OFFICIAL_CASE_RECORDS 	 = "FIR/Official case records",				                 
		                           PASSWORD                  = "Test@123",
		                           PASSWORDSET               = "Test@1234",
		                           IO_LEAD                   = "IO Lead",
		                           POLICE_STATION            = "",
		                           ACTIVE_STATUS             = "ACTIVE", 
		                           ZERO_CASE_COUNT           = "0",
		                           DETAILS                   = "The above case details are filled are true and correct.",
		                           REVISE_COMMENT            = "The case is need to revise",
		                           STICKER_VERSION			 = "v.1",
		                           VT_VERSION                = "VT 1.1",
		                           CASE_CLOSE_COMMENT        = "This case is closed by IO Lead",
		                           FISH_EYE_IMG1             = "fisheye4.JPG",
		                           FISH_EYE_IMG2             = "fisheye3.JPG",
		                           FISH_EYE_IMG3             = "fisheye2.JPG",
		                     	   FISH_EYE_IMG4             = "fisheye1.JPG",
									INITIATION				 = "Initiation",
									AssignTOTeam			 = "Assigned To Processing Team", 
                                    CUR_NEW_PASSWORD          = "Test@123",
		                           STATUS_VALUE                = "Complete",		                     			
		                           CUR_CONF_PASSWORD         = "Test@123",
		                           CASE_COMMENT				 = "TEST COMMENTS",
		                           URL_LINK                  = "https://www.wikipedia.org/";
		
		 public final static int   TWO_FISH_EYE_IMAGES_COUNT = 2,
				                   COUNT_ONE                 = 1;
	}
	
