package Data;

public class TeamData {

	static String time_sec                        = ""+System.currentTimeMillis();
	
	public static String IO_TEAM_NAME				            = "AutoIOTeam"+ time_sec.substring(6, 12),
			             REPORTING_TEAM_NAME				    = "AutoReportingTeam"+ time_sec.substring(6, 12),
			             REPORTINGHQ							= "Reporting HQ *",
			             POLICE_STATION							= "Police Station *",
			             RANK									= "Rank *",
			             PRIMARY_ROLE							= "Primary Role *",
			             OTHER_ROLES							= "Other Roles";
			             
			             
						
}
