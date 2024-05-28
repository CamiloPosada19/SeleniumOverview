Feature: Register User
  As a user I register on the site
  and check the tooltip with ACCOUNT CREATED is visible.
  After I delete the account created
  
  Scenario: Register User
    Given I as a user enter the website
    When I click on singup/login, I enter the data to create an account.
    Then I check the Account Created tooltip
    And I delete the account with the button
    Then I check the Account Deleted tooltip 