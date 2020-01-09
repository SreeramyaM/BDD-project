Feature: To verify IO Lead can add Case Comments fishey Note to the case

#Author: Dinesh
#Date: 13/05/2019
#Reviewer: Srinivas  

@UserCaseCommentandReply
Scenario Outline:: Verify Io lead should be able to create a Case and Add Case Comments And Notes
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
Then Verify case created success message
And  User clicks on View Details link in card layout
Then Verify case status should be in "<Initiation>" in case details page
When Upload fisheye images
When Click on FishEye images droup down
And Click on Add Notes and Add Note
Then Verify Case Comment Sucess message should be displayed
And Click on Case Comments section
And Click on Add Comments and Add comment 
Then Verify Case Comment Sucess message should be displayed

Examples:
|Initiation|
|Initiation|

#Author: Dinesh
#Date: 13/05/2019
#Reviewer: Srinivas 

@UserCaseCommentandReply
Scenario: Verify Io Member able to reply the case comments and Notes
Given User navigates to iMAGENEcsi portal
When User enters IO Member User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
Then Verify Assignd case is displayed in his Dashboard
And  User clicks on View Details link in card layout
When Click on FishEye images droup down
And Click on reply for the fisheye notes
Then Verify Case Comment Sucess message should be displayed
And Click on Case Comments section
And Click on reply case Comments and reply
Then Verify Case Comment Sucess message should be displayed