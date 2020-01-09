Feature: Verify Audit tarial updating with propeer data

#Author: Pavan
#Date: 14/05/2019
#Reviewer:

@AuditTraialValidation
Scenario Outline:: Verify Io lead should be able to create a Case and download case wise PDF
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
When Click on Save Button
Then Verify case created success message
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
And Click on Audit Trial button
Then Verify Audit Trail page displayed with case name
Then Verify Audit Trail showing a Log for FishEye image upload
And User clicks on Cases link from the left menu
Then Verify that list of cases should be displayed and newly created case at the top
When User clciks on Download icon of the newly created case
And User Mousehover on Action and clciks on View Audit Logs
Then Verify new audit log updated for case download
When user clicks on Download button
And Add Comments and clcik on Download button
#Then Verify Audit logs downloaded successfully
And Click on iMAGENEcsi logo on the left corner

Examples:
|Initiation|
|Initiation|