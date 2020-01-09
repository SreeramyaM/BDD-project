Feature: To Verify Case Complete flow from Creation to Completion

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@smoke12345
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

@smoke12345
Scenario: Verify IO Member is able to View Created case by IO Lead
Given User navigates to iMAGENEcsi portal
When User enters IO Member User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
Then Verify Assignd case is displayed in his Dashboard
When User click on Logout button
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

@smoke12345
Scenario Outline: Verify Reporting Lead must be able to upload the final report
Given User navigates to iMAGENEcsi portal
When User enters case assign Reporting Lead user Name and Password
And User click on Login button
And Select "<Reporting lead>" from the droupdown
And User clicks on View Details link in card layout
Then Verify user should be navigate to the case details page of particular case
Then Verify case status should be in "<processing>" in case details page
When User click on Accept button
And User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And  User select a valid .zip Report file
When Click on Upload button on Popup
Then Verify Reports Log version one status in "<Draft>" Reports page
When User click on Submit Report
Then Verify report submitted success message
Then Verify case status should be in "<Reviewing>" in case details page
When User click on Logout button
Examples:
|Reporting lead||processing||Draft||Reviewing|
|Reporting lead||Processing||Draft||IO Reviewing|

#Author: Srinivas
#Date: 26/02/2019
#Reviewer:

@smoke12345
Scenario Outline:: Verify As an IO Lead,User must be able to review the final report and accept the report
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
And  User clicks on View Details link in card layout
When User click on Report button
When User click on Accept button
Then Verify report accepted success message
#When User click on Dashboard Icon
When User click on Complete button
And User enter comment to close case
And Click on Complete button
When User click on Advance Search in left panel
And Enter case id in search field 
When Click on Search button
And User mouse hover on Action button
And User click on View Case details button
Then Verify case status should be in "<Completed>" in case details page
When User click on Logout button

Examples:
|Complete|
|Complete|

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@smoke12345
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
And Verify minimum four fish eye image validation message
And Select fish eye images check box
And Click on MoveTo folder button
And Select police station name
And Click on Station plus icon
Then Verify added images are displayed in police station
When User click on Logout button

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@smoke12345
Scenario: Verify IO Lead is able to Sumbit a case which is Created By Reporting Lead
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
And  User clicks on View Details link in card layout
When Click on Submit button
When User click on Proceed Button to submit files
And  User click on Logout button
When User enters Reporting Lead User Name and Password
And  User click on Login button
And  User clicks on View Details link in card layout
And User click on Accept button
And User selects Reporting Member from the dropdown
And User click on Assign Button
And User click on Logout button

#Author: Srinivas
#Date: 18/02/2019
#Reviewer:

@smoke12345
Scenario: Verify Reporting Member must be able to upload report
Given User navigates to iMAGENEcsi portal
When User enters Reporting Member user Name and Password
When User click on Login button
Then Verify Dashboard page is display
Then Verify Assignd case is displayed in his Dashboard
When  User clicks on View Details link in card layout
When User click on Report button
When Clicks on Upload 360 degree Report Button
And Enter all mandatory details to upload report 
And  User select a valid .zip Report file
When Click on Upload button on Popup
When User click on Submit Report


#Author: Pavan
#Date: 13/05/2019
#Reviewer:

@smokeDownload
Scenario Outline:: Verify Io lead should be able to create a Case and download case wise PDF
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
Then Verify case created success message
And User clicks on Cases link from the left menu
Then Verify that list of cases should be displayed and newly created case at the top
When User clciks on Download icon of the newly created case
And Click on iMAGENEcsi logo on the left corner
#Then Verify that case details PDF file downloaded through browser
Examples:
|Initiation|
|Initiation|
