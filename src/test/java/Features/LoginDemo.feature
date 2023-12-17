Feature: Test login functionlity

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username                 | password |
      | prasannakumar@gmail.com  | 22072001 |
      | prasanakumar44@gmail.com |   123456 |
