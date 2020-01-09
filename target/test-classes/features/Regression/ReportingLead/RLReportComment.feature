Feature: To Verify Reporting lead comment to uploaded report

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@RLreportCommentandReply
Scenario Outline:: Verify Io lead should be able to create a Case
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
Then Verify case created success message
And  User clicks on View Details link in card layout
Then Verify case status should be in "<Initiation>" in case details page
When User click on Logout button
Examples:
|Initiation|
|Initiation|

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@RLreportCommentandReply
Scenario: Verify IO Member is able to View Created case by IO Lead
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
And  User clicks on View Details link in card layout
When Upload fisheye images
When Click on FishEye images droup down
And Click on MoveTo folder button
And Click on add new station button 
And Enter Station name and Alias name
And Click on Add Station button
And Verify minimum four fish eye images validation message
And Select fish eye images check box
And Click on MoveTo folder button
And Select police station name
And Click on Station plus icon
Then Verify added images are displayed in police station
When Click on Submit button
When User click on Proceed Button to submit files
When Get auto assign case Reporting Lead user name

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@RLreportCommentandReply
Scenario Outline: Verify Reporting Lead must be able to upload report and Comment report
Given User navigates to iMAGENEcsi portal
When User enters case assign Reporting Lead user Name and Password
And User click on Login button
And Select "<Reporting Lead>" from the droupdown
And User clicks on View Details link in card layout
Then Verify user should be navigate to the case details page of particular case
Then Verify case status should be in "<processing>" in case details page
When User click on Accept button
And User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And User select a valid .zip Report file
When Click on Upload button on Popup
And Click on Report Comment accordion
And Click on Add Comments and add comment
Then Verify Report Comment Sucess message should be displayed

Examples:
|Reporting Lead||processing|
|Reporting Lead||Processing|


@RLreportCommentandReply
Scenario: Verify Io Lead accept Case and reply report comment
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
And User clicks on View Details link in card layout
And User click on Report button
And Click on Report Comment accordion
And Click on reply reports Comments and reply
Then Verify Report Comment Sucess message should be displayed 
