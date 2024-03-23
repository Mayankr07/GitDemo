
Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site

#Before ->Background->Scenario ->After 

@Regression  @NetBanking
Scenario: User Page Default login


Given User is on Netbanking landing page
When  User login into application with "Mayank" and password "9876"
Then Home page is displayed
And Cards are displayed

#Senario Outline to execute one scenario multiple times

@SmokeTest @Regression @Mortgauge
Scenario Outline: User Page Default login


Given User is on Netbanking landing page
When  User login into application with <Username> and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
  |Username|Password|
  |Mayank  |Pass231 |
  |Parth   |Aswer   |
  
 