Feature: Verify IO lead should be able to view Teams

#Author: Pavan
#Date: 16/05/2019
#Reviewer: 

@ViewTeamReportLead
Scenario: Verify Admin edits Team
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
And  User click on Login button
When Click on Teams in left panel
Then Verify Teams page should display successfully