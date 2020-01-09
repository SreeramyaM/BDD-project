Feature: To verify that user is able to change the password

#Author: Pavan
#Date: 06/05/2019
#Reviewer: Srinivas

@ChangePassword
Scenario Outline:  Verify IO Lead should be able to change password

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
When Enter new passwordset
And Click on Update button
And Enter IO Lead training certificate number
Then Verify Dashboard page is display
And  Click on user profile
And Click on change password link
And Enter Current password and new password
And Click on Submit button
Then Verify user password updated successfully

Examples:
|ReportingHQ||PoliceStation||Rank||IO Lead||ReportingLead|
|Global||Saudi_station||General||IO Lead||Reporting Lead|



