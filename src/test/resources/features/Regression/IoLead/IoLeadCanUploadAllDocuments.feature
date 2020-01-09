Feature: To Verify IO Lead can upload all types of documents

#Author: Srinivas
#Date: 16/05/2019
#Reviewer:

@UploadAllFiles
Scenario: Verify IO Lead can upload all types of documents
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And User click on Login button
When Click on New Case in left panel
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
When Click on Save Button
Then Verify case created success message
And  User clicks on View Details link in card layout
When Upload fisheye images
And Upload Evidence images
And Upload PDF files
And Upload sketch images
And Upload URL's
Then Verify uploaded fish eye images counts