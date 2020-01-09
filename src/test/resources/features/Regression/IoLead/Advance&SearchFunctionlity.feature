Feature: To Verify Basic Search functionlity 

User will create a case and search with case id Basic search and Advance Search verification

#Author: Mohit
#Date: 14/05/2019
#Reviewer:

#@functional@search1
#Scenario: Verify IO Lead is able to Download a case List
#Given User navigates to iMAGENEcsi portal
#When User enters IO Lead User Name and Password
#And  User click on Login button
#When Click on New Case in left panel
#When IO lead entres all case details to create New Case
#When Click on Save Button
#Then Verify case created success message
#When Search with the Case id
#Then Verify Case details page is dispalyed.


@functional@search
Scenario: Verify IO Lead is able to Search from Advance Search with Case details
Given User navigates to iMAGENEcsi portal
When User enters IO Lead User Name and Password
And  User click on Login button
When Click on New Case in left panel
When IO lead entres all case details to create New Case
Then Verify case created success message
When User click on Advance Search in left panel
And Enter case id in search field 
When Click on Search button
Then Verify Result are displaed based on case id
And Clear the results
When Search with Case name
When Click on Search button
Then Verify Result are displaed based on case name
And Clear the results
When Select Initiation from the status dropwon
When Click on Search button
Then Verify displayed results are based on initiation search
And Clear the results
When Select Case Priority
Then Verify result is displayed based on Priority
And Clear the results
When Select From and To date
Then Verify result are dispaled based on date

















