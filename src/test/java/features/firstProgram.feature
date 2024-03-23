
Feature: Application Login

Background:
Given setUp the entries in database
When launch the browser from config variables
And hit the home page url of banking site


@Regression
Scenario: Admin Page Default login

#sending 3323 as an Integer in regex pattern 
Given User is on Netbanking landing page
When  User login into application with  3323 and password "1234"
Then Home page is displayed
And Cards are displayed


@MobileTest  
Scenario: User Page Default login


Given User is on Netbanking landing page
When  User login into application with "Mayank" and password "9876"
Then Home page is displayed
And Cards are displayed


When  User login into application with "Parth" and password "8965"

#Senario Outline to execute one scenario multiple times

@SmokeTest @Regression
Scenario Outline: User Page Default login


Given User is on Netbanking landing page
When  User login into application with <Username> and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
  |Username|Password|
  |Mayank  |Pass231 |
  |Parth   |Aswer   |
  
  
@SmokeTest
Scenario: User Page Default Sign up


Given User is on Practice landing page
When  User Signup into application
|Mayank|
|Rewatkar|
|mrewatkar@gmail.com|
|987765456789|
Then Home page is displayed
And Cards are displayed
 