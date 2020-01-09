Feature: To verify that user is able to change the Profile photo

#Author: Pavan
#Date: 08/05/2019
#Reviewer: Srinivas

@ChangeProfilePhoto
Scenario:  Verify that IO Lead should be able to change user profile photo

Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
And  Click on user profile
And Clcik on change photo
And Clcik on choose file button
And Select photo and clcick on update
Then Verify profile photo uploaded successfully

