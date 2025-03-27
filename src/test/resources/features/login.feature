Feature: Login

  Scenario: Login with valid username and password
    Given user is on login page
    When user input username text box with "standard_user"
    And user input password pada text box with "secret_sauce"
    And user click login button
    Then user will redirect to homepage

  Scenario: Login with invalid username and password
    Given user is on login page
    When user input username text box with "user_lain"
    And user input password pada text box with "coba_coba"
    And user click login button
    Then user will redirect to homepage

  Scenario: Login with empty password
    Given user is on login page
    When user input username text box with "standard_user"
    And user input password pada text box with ""
    And user click login button
    Then A message appears "Password is required"