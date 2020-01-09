Feature: To verify that Super Admin edits Team Admin 
#Author: Asutosh
#Date: 17/05/2019
#Reviewer: 

@AdminEditsTeam
Scenario Outline: Verify Super Admin creates an Admin 
Given User navigates to iMAGENEcsi portal
When User enters Super Admin User Name and Password
And  User click on Login button
And  Click on Admin in Menu
When Click on Add Admin sub menu
And Select Reporting HQ "<ReportingHQ>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Admin name in Temp Sheet
And Enter Admin User Official Email Id
And Enter official Phone Number
And Enter Admin Training Certification Number in Temp Sheet
When Click on Submit button

Examples:
|ReportingHQ||Rank|
|AD Police GHQ 1||General|

@ssss
Scenario Outline: Verify Super Admin edits Team Admin 
Given User navigates to iMAGENEcsi portal
When User enters Super Admin User Name and Password
And  User click on Login button
When Click on Teams in Main Menu
And Click on edit team under action dropdown
And Clear Team Name and Add new team Name
And Clear IoLead from Team
And Select Second Iolead from the drop-down

And Clear Iomember form team
And Select Second Team Member form the drop-down

When Click on Submit button

Then Verify Team Updated success message is display
And Enter IO team name in search box
And Click on view member 
Then Verify added IoLead user should be displayed
Then Verify added IoMember should be displayed

Examples:
|ReportingHQ||Rank|
|AD Police GHQ 1||General|


