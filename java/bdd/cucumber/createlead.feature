Feature: Leaftaps create lead
Background:
Given Open the chrome browser
And load the application url
And Enter the username
And Enter the password
And Click on the login button
And ClickCRMSFALINK
And click Leads menu
And Click Create Lead

Scenario: TC001 -Create new lead-postive with singledata

And Enter the Companyname as 'testleaf'
And Enter the firstname as 'firstname'
And Enter the Lastname as 'lastname'
When Click Createlead button
Then Verify that the new lead is created 	

Scenario Outline: TC002 -Create new lead-postive with multipledata
And Enter the Companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the Lastname as <lastname>
When Click Createlead button
Then Verify that the new lead is created 
Examples:
|companyname|firstname|lastname|	
|'testleaf1'|'firstname1'|'lastname1'|
|'testleaf2'|'firstname2'|'lastname2'|