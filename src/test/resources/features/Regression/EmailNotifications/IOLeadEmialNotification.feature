Feature: To Verify Admin is able to create IO Team and Reporting Team

#Author: Srinivas
#Date: 13/03/2019
#Reviewer: 
@smoke1234
Scenario: Verify Admin can Create a IO Team and Reporting Team
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And User click on Login button
Then Verify Dashboard page is display
When Click on Add Team under Teams in main menu
And Select Team Type Io Lead 
And Enter io Team name
And Select Team Lead from the drop-down
And Select Team Member for the drop-down
When Click on Submit button
Then Verify Team created success message is display
When Click on Add Team under Teams in main menu
And Select Team Type Reporting Team 
And Enter Reporting Team name
And Select Reporting Lead from the drop-down
And Select Reporting Member for the drop-down
When Click on Submit button
Then Verify Team created success message is display
