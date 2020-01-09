Feature: To Verify all user can view cases

@ALLUSERS
Scenario: Verify io lead can view case
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
When Click on Save Button
Then Verify case created success message
And click on Cases in left panel
And Enter case id in search box
Then Verify Case should be displayed

 @ALLUSERS1
Scenario: Verify io Member can view case
Given User navigates to iMAGENEcsi portal
When User enters IO Member User Name and Password
And  User click on Login button
And click on Cases in left panel
And Enter case id in search box
Then Verify Case should be displayed
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
And Select fish eye images check box
And Click on MoveTo folder button
And Select police station name
And Click on Station plus icon
Then Verify added images are displayed in police station
When Click on Submit button
When User click on Proceed Button to submit files
#When Get auto assign case Reporting Lead user name


@ALLUSERS1
Scenario Outline: Verify Reporting Lead must be able to upload the final report
Given User navigates to iMAGENEcsi portal
When User enters case assign Reporting Lead user Name and Password
And User click on Login button
And Select "<Reporting lead>" from the droupdown
And click on Cases in left panel
And Enter case id in search box
Then Verify Case should be displayed
And Click on Home button
And User clicks on View Details link in card layout
When User click on Accept button
And Select report member from dropdown
And User click on Assign Button
And Get reporting member for case
When User click on Logout button
When User enter Rm User name and password
And User click on Login button
And click on Cases in left panel
And Enter case id in search box
Then Verify Case should be displayed
Examples:
|Reporting lead|
|Reporting lead|
 