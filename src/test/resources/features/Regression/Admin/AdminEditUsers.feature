Feature: To Verify Admin edits users

#Author: Srinivas
#Date: 11/02/2019
#Reviewer: Srinivas

@Dinesh3310
Scenario Outline: Verify Admin can create a new IO Lead User
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter IO Lead Name
And Select Primary Role "<IO Lead>"
And Select Other Roles "<ReportingLead>"
And Enter IO Lead Official Email Id
And Select Primary Role "<IO Lead>"
And Select Other Roles "<Reporting Lead>"
And Enter IO Lead Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify IO Lead User is displayed in Manage users page "<IO Lead>" "<ReportingLead>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter IO Lead Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter IO Lead User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter IO Lead training certificate number
Then Verify Dashboard page is display
Examples:
|ReportingHQ||PoliceStation||Rank||IO Lead||ReportingLead|
|Global||Saudi_station||General||IO Lead||Reporting Lead|

#Author: Dinesh
#Date: 10/05/2019
#Reviewer: Srinivas   

@Dinesh3310io
Scenario Outline: Verify Admin can edit new IO Lead User
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And User click on Login button
Then Verify Dashboard page is display
When Click on Manage Users under Users in left panel
When Search the user in the search box
And Click on action in User table
And Click on Edit on Action Dropdown
And Clear ReportingHQ and Add New ReportingHQ "<ReportingHQ>"
And Clear Police Station and Add New Police Station "<PoliceStation>"
And Clear Military / Civilian Number and New Enter Military / Civilian Number
And Clear Rank and Add New Ranks "<Rank>"
And Claer Primay Role And New Role "<Reporting Lead>"
And Select Other Roles "<IO Lead>"
And Claer Offical Phone Number and Add New Phone Number
When Click on Submit button
Then Verify IO Lead User is displayed in Manage users page "<Reporting Lead>" "<IO Lead>" "<PoliceStation>" and "<Rank>"

Examples:
|ReportingHQ||PoliceStation||Rank||Reporting Lead||IO Lead|
|Abu Dhabi||Srinivas||Major General||Reporting Lead||IO Lead|