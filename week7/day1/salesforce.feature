Feature: Salesforce application
Background: 
Given Open the chrome browser
And load the application url
And Enter the username and password
And Click on the login button
And Click on the toggle menu button from the left corner 
And Click view All
@funtional
Scenario: TC001-CreateNewOpportunity
And click Sales from App Launcher
And Click on Opportunities tab 
And Click on New button in Opportunity
And Enter Opportunity name as 'Salesforce Automation by Naveen'
And Get the text and  Store it
And Choose close date as Today
And Select Stage as 'Needs Analysis'
When click Save 
Then VerifyOppurtunity Name
@Regression
Scenario: TC002-CreateOpportunityWithoutMandatoryFields
And click Sales from App Launcher
And Click on Opportunities tab 
And Click on New button in Opportunity
When click Save 
But Verify the Alert message

@funtional
Scenario: TC003-CreateNewDashboard
And click Dashboards from App Launcher
And Click on the New Dashboard option
And Enter Name as 'Salesforce Automation by Naveen ' and Click on Create
When Click on Save 
Then Verify Dashboard name
@funtional
Scenario: TC004-CreateIndividuals
And click Individual from App Launcher
And Click on New Individual 
And Enter the Last Name as 'Kumar'
When Click saveind
Then verify Individuals Name
@funtional
Scenario: TC005-CreateAccounts
And click Sales from App Launcher
And Click on Accounts tab
And Click on New button 
And Enter 'Naveen' as account name 
And Select Ownership as Public
When Click saveAcc 
Then verify Account name 
