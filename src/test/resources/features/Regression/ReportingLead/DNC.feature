Feature: To Verify Reporting Lead is able to mark DNC

IO Lead sumbit a case it will be auto assign to any Reporting Lead
Repoting Lead should be able to Mark as a DNC


@functional@DNC
Scenario: Verify Reporting Lead is able to Mark case Data Non Compliance
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
When IO lead entres all case details to create New Case
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
When Click on Submit button
When User click on Proceed Button to submit files
When Get auto assign case Reporting Lead user name
When User click on Logout button
When User enters case assign Reporting Lead user Name and Password
And User click on Login button
And User clicks on View Details link in card layout
Then Verify user should be navigate to the case details page of particular case
When Select DNC Button and enter comment
Then Verify the sucess message Case has been successfully updated to Data non-compliance





