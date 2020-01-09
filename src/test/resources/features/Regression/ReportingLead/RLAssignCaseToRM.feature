Feature: To Verify All users are able to assign cases and submission and revision activites

#Author: Srinivas
#Date: 02/05/2019
#Reviewer:

@repoLe
Scenario: Verify Reporting lead should be able to create a Case
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
And User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When Reporting Lead entres all case details to create New Case
Then Verify case created success message
And  User clicks on View Details link in card layout
When Upload fisheye images
When Click on FishEye images droup down
And Click on MoveTo folder button
And Click on add new station button 
And Enter Station name and Alias name
And Click on Add Station button
Then Verify minimum four fish eye images validation message
And Select fish eye images check box
And Click on MoveTo folder button
And Select police station name
And Click on Station plus icon
Then Verify added images are displayed in police station
When User click on Logout button
When User enters IO Lead User Name and Password
And User click on Login button
And  User clicks on View Details link in card layout
And Click on Submit button
And User click on Proceed Button to submit files
And User click on Logout button
When User enters Reporting Lead User Name and Password
And User click on Login button
And  User clicks on View Details link in card layout
And User click on Accept button
And User selects Reporting Member from the dropdown
And User click on Assign Button
When User click on Logout button
When User enters Reporting Member user Name and Password
When User click on Login button
Then Verify Dashboard page is display
Then Verify Assignd case is displayed in his Dashboard
When User click on Logout button

#Author: Srinivas
#Date: 02/05/2019
#Reviewer:

@repoLe
Scenario Outline: Verify Reporting Member is able to upload/Submit report to Reporting Lead
Given User navigates to iMAGENEcsi portal
When User enters Reporting Member user Name and Password
When User click on Login button
Then Verify Dashboard page is display
When  User clicks on View Details link in card layout
And User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And  User select a valid .zip Report file
When Click on Upload button on Popup
Then Verify Reports Log version one status in "<Draft>" Reports page
When User click on Submit Report
Then Verify case status should be in "<ReportingLeadReviewing>" in case details page
When User click on Logout button
When User enters Reporting Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
Then Verify Report log version one
Then Verify software versions
When User click on Logout button

Examples:
|Draft||ReportingLeadReviewing|
|Draft||Reporting Lead Reviewing|

#Author: Srinivas
#Date: 06/05/2019
#Reviewer:

@repoLe
Scenario: Verify Reporting Lead is Revising a Report for Reporting Member
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
And Click on Revise Report Button
And Enter Comment and click on Revise button on comment box
When User click on Logout button

@repoLe
Scenario Outline: Verify Reporting Lead is Revising a Report for Reporting Member
Given User navigates to iMAGENEcsi portal
When User enters Reporting Member user Name and Password
When User click on Login button
When  User clicks on View Details link in card layout
And User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And  User select a valid .zip Report file
When Click on Upload button on Popup
Then Verify Reports Log version one status in "<Version1>" Reports page
When User click on Submit Report
#Verify Report is submiteded success message

Examples:
|Version1|
|Version 1|

#Author: Srinivas
#Date: 06/05/2019
#Reviewer:
@repoLe
Scenario Outline: Verify Reporting Lead submit report to IO Lead
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
Then Verify Reports Log version one status in "<Version1>" Reports page
When User click on Submit Report
When User click on Logout button
When User enters IO Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
Then Verify Reports Log version two status in "<Version2>" Reports page

Examples:
|Version1||Version2|
|Version 1||Version 2|

#Author: Srinivas
#Date: 09/05/2019
#Reviewer:
@repoLe
Scenario: Verify IO Lead Revising report to Reporting Lead 
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
When Click on Revise Report Button
And Enter Comment and click on Revise button on comment box
When User click on Logout button

@repoLe
Scenario: Verify Reporting Lead submit report to IO Lead
Given User navigates to iMAGENEcsi portal
When User enters Reporting Lead User Name and Password
When User click on Login button
Then Verify Dashboard page is display
When User clicks on View Details link in card layout
And User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And User select a valid .zip Report file
When Click on Upload button on Popup

#Author: Srinivas
#Date: 09/05/2019
#Reviewer:

@repoLe
Scenario Outline: Verify IO Lead Accept case and Complete the case
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And User click on Login button
When User clicks on View Details link in card layout
And User click on Report button
Then Verify Reports Log version one status in "<Version2>" Reports page
And User click on Accept button
#Then Verify case accepted success message
When User click on Complete button
And User enter comment to close case
And Click on Complete button

Examples:
|Version2|
|Version 2|
