Feature: To Verify Created case list must be present in Downloaded Case List

User will create a case after that he will verify case List he is able to download or not and that dwonadloed file is password protected

@functional@download
Scenario: Verify IO Lead is able to Download a case List
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
When IO lead entres all case details to create New Case
When Click on Save Button
Then Verify case created success message
When Click on New Case in left panel
When IO lead entres all case details to create New Case
Then Verify case created success message
When Select Cases from Menus
And Click on Download button
Then Verify the Case List pdf file is Downaloded
Then Verify downloaded file is password protected










