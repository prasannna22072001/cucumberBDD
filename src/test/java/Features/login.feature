@SmokeScenario
Feature: feature to test login functionality

	@SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page


#we have to add "Outline" word when we are passing parameters in scenario
  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
