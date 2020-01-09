Feature: To verify that an email is triggered to Reporting Lead when Reporting lead created a case.

#Author: Srinivas
#Date: 13/03/2019
#Reviewer: 
@smoke1234
Scenario: Verify email notification is receive to reporting lead when case is created
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
And  User click on Login button
When Click on New Case in Dashboard page
Then Verify the Create New Case page is display
When Reporting Lead entres all case details to create New Case
Then Verify case created success message
When User navigates to Mailinator.com
And Enter Admin Email id and click on Go Button
Then Verify case created email notification is received
