Feature: Customer

Scenario: Add New Customer

Given User Lounch Chrome Browser
When User Opens URL "https://demo.guru99.com/V3/"
And User Enteruserid as "mngr574314" and EnterPassword as "havyqyj"
And Click On Login 
Then User should be logged In
When User Click On New Customer Menu
Then User can view Add New Customer page
When User Fill the customer information
And Click on submit button
Then Customer Registered Successfully
When User Click On LogOut Link
Then User should be logged Out
And Close browser

Scenario: Add New Account

Given User Lounch Chrome Browser
When User Opens URL "https://demo.guru99.com/V3/"
And User Enteruserid as "mngr574314" and EnterPassword as "havyqyj"
And Click On Login 
Then User should be logged In
When User Click On New Account Menu
Then User can view Add New Account page
When User Fill the add new account information
And Click on submit button
Then Account Generated Successfully
When User Click On LogOut Link
Then User should be logged Out
And Close browser



 