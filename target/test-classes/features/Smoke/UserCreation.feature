Feature: To Verify IT Config and Admin is able to Create all type of users

#Author: Srinivas
#Date: 11/04/2019
#Reviewer:  
@smoke1
Scenario Outline:: Verify IT Config can Create a new Super Admin User
Given User navigates to iMAGENEcsi portal
When IT Config enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify IT Config is able to see home page Sucessfully
And  Click on Super Admin in left panel
And Click on Add Super Admin under
And Select Reporting HQ "<ReportingHQ>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Super Admin name
And Enter Super Admin User Official Email Id
And Enter official Phone Number
And Enter Admin Training Certification Number
When Click on Submit button
#Then Verify Super Admin Added success message
Then Verify created super Admin User is displayed in Manage Super admin page "<ReportingHQ>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter Super Admin Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Super Admin name and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter Admin training certificate number
Then Verify Dashboard page is display

Examples:
|username||password||ReportingHQ||Rank|
|azamitconfig@yopmail.com||Test@123456||AD Police GHQ 1||General|

#Author: Srinivas
#Date: 11/02/2019
#Reviewer:  
@smoke1
Scenario Outline:: Verify Super Admin can Create a new Admin User
Given User navigates to iMAGENEcsi portal
When User enters Super Admin User Name and Password
And  User click on Login button
And  Click on Admin in Menu
When Click on Add Admin sub menu
And Select Reporting HQ "<ReportingHQ>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Admin name
And Enter Admin User Official Email Id
And Enter official Phone Number
And Enter Admin Training Certification Number
When Click on Submit button
Then Verify created Admin User is displayed in Manage users page "<ReportingHQ>" "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter Admin Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Admin name and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter Admin training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||Rank|
|AD Police GHQ 1||General|

#Author: Srinivas
#Date: 11/02/2019
#Reviewer:  
@smoke1
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
Then Verify created IO Lead User isk displayed in Manage users page "<IO Lead>" "<ReportingLead>" "<PoliceStation>" and "<Rank>"
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
#Date: 12/02/2019
#Reviewer:  
@smoke1
Scenario Outline:: Verify Admin can create a new Reporting Lead
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Reporting Lead Name
And Select Primary Role "<Reporting Lead>"
And Select Other Roles "<IO Lead>"
And Select user Role Name
And Enter Reporting Lead Official Email Id
And Enter Reporting Lead Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify created Reporting Lead User is displayed in Manage users page "<Reporting Lead>" "<IO Lead>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter Reporting Lead Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Reporting Lead User Name and Temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter Reporting Lead training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||Reporting Lead||IO Lead|
|Global||Saudi_station||General||Reporting Lead||IO Lead|

#Author: Srinivas
#Date: 12/02/2019
#Reviewer:  
@smoke1
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
#Date: 13/02/2019
#Reviewer:  
@smoke1
Scenario Outline:: Verify Admin can create a new Reporting Member
Given User navigates to iMAGENEcsi portal
When User enters Admin User Name and Password
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Users under Users in left panel
When Select Reporting HQ "<ReportingHQ>"
When Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter Reporting Member Name
And Select Primary Role "<Reporting Member>"
And Select Other Roles "<IO Member>"
And Enter Reporting Member Official Email Id
And Enter Reporting Member Training Certification Number
And Enter official Phone Number
When Click on Submit button
Then Verify created Reporting Member User is displayed in Manage users page "<Reporting Member>" "<IO Member>" "<PoliceStation>" and "<Rank>"
When User click on Logout button
When User navigates to Mailinator.com
When Enter Reporting Member Email id and click on Go Button
Then Verify user should get Welcome email
Then Verify user should get login credentials email
When Enter Reporting Member user name and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
And Enter Reporting Member training certificate number
Then Verify Dashboard page is display

Examples:
|ReportingHQ||PoliceStation||Rank||Reporting Member||IO Member|
|Global||Saudi_station||General||Reporting Member||IO Member|