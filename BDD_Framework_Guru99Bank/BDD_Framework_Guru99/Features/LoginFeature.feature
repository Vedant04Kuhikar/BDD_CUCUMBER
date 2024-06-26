Feature: Login

Scenario: Successfull Login with Valid Credentials

Given User Lounch Chrome Browser
When User Opens URL "https://demo.guru99.com/V3/"
And User Enteruserid as "mngr574314" and EnterPassword as "havyqyj"
And Click On Login
Then User should be logged In
When User Click On LogOut Link
Then User should be logged Out
And Close browser

Scenario Outline: Successfull Login with Data Driven

Given User Lounch Chrome Browser
When User Opens URL "https://demo.guru99.com/V3/"
And User Enteruserid as "<userid>" and EnterPassword as "<password>"
And Click On Login
Then User should be logged In
When User Click On LogOut Link
Then User should be logged Out
And Close browser

Examples:
  | userid     | password  |
  | mngr574314 | havyqyj   |
  
  








