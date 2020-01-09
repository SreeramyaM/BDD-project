Feature: To Verify that Super Admin can Edit a new Admin User

#Author: Asutosh
#Date: 15/05/2019
#Reviewer:  
@RegressionSuperAdminEdit1
Scenario Outline:: Verify Super Admin can Edit a new Admin User
Given User navigates to iMAGENEcsi portal
When User enters Super Admin User Name and Password
And  User click on Login button
And  Click on Admin in Menu
When Click on Manage Admin sub menu
When Click on Edit under Actions column
And Clear ReportingHQ and Add New ReportingHQ "<ReportingHQ>"
And Clear Military / Civilian Number and New Enter Military / Civilian Number
And Clear Rank and Add New Ranks "<Rank>"
And Claer Offical Phone Number and Add New Phone Number
When Click on Submit button
Then verify user details updated successfully validation message
Then User click on Logout button
Examples:
|ReportingHQ||Rank|
|AD Police GHQ 1||General|


#Author: Asutosh
#Date: 16/05/2019
#Reviewer:  
@RegressionSuperAdminEdit12
Scenario Outline:: Verify Super Admin can Edit a new Admin User
Given User navigates to iMAGENEcsi portal
When User enters Super Admin User Name and Password
And  User click on Login button
When Click on Manage Admin in dashboard
When Click on Edit under Actions column
And Clear ReportingHQ and Add New ReportingHQ "<ReportingHQ>"
And Clear Military / Civilian Number and New Enter Military / Civilian Number
And Clear Rank and Add New Ranks "<Rank>"
And Claer Offical Phone Number and Add New Phone Number
When Click on Submit button
#Then verify user details updated successfully validation message
Then User click on Logout button
Examples:
|ReportingHQ||Rank|
|AD Police GHQ 1||General|