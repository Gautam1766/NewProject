Feature: Login
Scenario Outline: Successful Login with valid input
Given user launch chrome browser
When user open ulr "https://practicetestautomation.com/practice-test-login/"
And user enter the username "<Username>" and password as "<Password>"
And click on submit button
Then Page title should be "Logged In Successfully | Practice Test Automation"
And close browser

Examples:
|Username|Password|
|student|Password123|
|College|Cls@12334|

