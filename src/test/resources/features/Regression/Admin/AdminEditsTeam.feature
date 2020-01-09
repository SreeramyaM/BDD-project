Feature: To Verify Admin edits user
#Author: Srinivas
#Date: 11/04/2019
#Reviewer: Srinivas

Scenario Outline:: Verify Admin can create a new IO Lead User
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter IO Lead Name
And Select Primary Role "<IO Lead>"
And Select Other Roles "<ReportingLead>"
And Enter IO Lead Official Email Id
And Select Primary Role "<IO Lead>"
And Select Other Roles "<Reporting Lead>"
And Enter IO Lead Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify IO Lead User is displayed in Manage users page "<IO Lead>" "<ReportingLead>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter IO Lead Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter IO Lead User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter IO Lead training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||IO Lead||ReportingLead|
|Global||Saudi_station||General||IO Lead||Reporting Lead|

#Author: Srinivas
#Date: 11/04/2019
#Reviewer: Srinivas

@AdminEditsTeam
Scenario Outline:: Verify Admin can create a new IO Member
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter IO Member Name
And Select Primary Role "<IO Member>"
And Select Other Roles "<Reporting Member>"
And Enter IO Member Official Email Id
And Enter IO Member Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify created IO Member Lead User is displayed in Manage users page "<IO Member>" "<Reporting Member>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter IO Member Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter IO Member User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter IO Member training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||IO Member||Reporting Member|
|Global||Saudi_station||General||IO Member||Reporting Member|

#Author: Srinivas
#Date: 11/04/2019
#Reviewer:  

@AdminEditsTeam
Scenario: Verify Admin can Create a IO Team 
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
When Click on Add Team under Teams in left panel
And  Select Team Type Io Lead 
And  Enter io Team name
And  Select Team Lead from the drop-down
And  Select Team Member for the drop-down
When Click on Submit button
Then Verify Team created success message is display

#Author: Dinesh
#Date: 09/05/2019
#Reviewer: Srinivas 

@AdminEditsTeam
Scenario Outline:: Verify Admin can create a Second IO Lead User
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Second IO Lead Name
And Select Primary Role "<IO Lead>"
And Select Other Roles "<ReportingLead>"
And Enter Second IO Lead Official Email Id
And Select Primary Role "<IO Lead>"
And Select Other Roles "<Reporting Lead>"
And Enter Second IO Lead Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify created Second IO Lead User isk displayed in Manage users page "<IO Lead>" "<ReportingLead>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter Second IO Lead Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Second IO Lead User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter Second IO Lead training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||IO Lead||ReportingLead|
|Global||Saudi_station||General||IO Lead||Reporting Lead|

#Author: Dinesh
#Date: 09/05/2019
#Reviewer: Srinivas

@AdminEditsTeam
Scenario Outline:: Verify Admin can create a Second IO Member
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter IO Member Name2
And Select Primary Role "<IO Member>"
And Select Other Roles "<Reporting Member>"
And Enter IO Member Official second Email Id
And Enter Second IO Member Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify created Second IO Member Lead User is displayed in Manage users page "<IO Member>" "<Reporting Member>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter second IO Member Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Second IO Member User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter IO Member training certificate number2
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||IO Member||Reporting Member|
|Global||Saudi_station||General||IO Member||Reporting Member|

#Author: Dinesh
#Date: 09/05/2019
#Reviewer: Srinivas

@AdminEditsTeam
Scenario: Verify Admin edits Team
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
When Click on Manage Team under Teams in left panel
And Enter IO team name in search box
And Click on action in teamtable
And Click on edit in action dropdown
And Clear Team Name and Add new team Name
And Clear IoLead from Team
And Select Second Iolead from the drop-down
And Clear Io Member form team
And Select Second Team Member form the drop-down
When Click on Submit button
Then Verify Team Updated success message is display
And Enter IO team name in search box
And Click on view member 
Then Verify added IoLead user should be displayed
Then Verify added IoMember should be displayed


