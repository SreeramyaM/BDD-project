Feature: To Verify IO Lead is able to suspend a case and Resume as well

IO Lead will create a case and sumbit after that he should be able to mark suppend a case
and resume a case

@functional@suspend1
Scenario: Verify IO Lead is able to suspend and resume a case
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
When IO lead entres all case details to create New Case
When Click on Save Button
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
When Select Suspend Button and enter comment
Then Verify the sucess message Case has been successfully Suspended
Then Verify Resume button is present
When Select Resume Button and enter comment
Then Verify the sucess message Case has been successfully Resumed
Then Verify Suspend button is present