Feature:  To verify Closed cases user should not be able to enter any comment

#Author: Asutosh
#Date: 06/03/2019
#Testcase_ID: TC_CSI-370:
#Reviewer:
 

@RegressionCloseCaseComment
Scenario: Verify As an IO Lead user should not be able to enter any comment for closed case
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When User click on Advance Search in main menu
Then  Advance search home page should be displayed
When Select Complete status under status column
And  Click on Search button
And User click on View Case details button
Then Verify case status should be Complete in case details page
When Click on Case Comments section 
Then Verify Add comment link should not be present inside case comments section
When User click on Logout button
