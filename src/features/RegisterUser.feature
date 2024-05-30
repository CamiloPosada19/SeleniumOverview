Feature: Register User
  As a user I register on the site
  and check the ACCOUNT CREATED is visible.
  After I delete the account created
  
  Scenario: Register and delete the user
    Given I as a user enter the website "https://automationexercise.com/"
    When I click on singup/login, I enter the data to create an account.
    And I fill in the data for the creation of the account
    Then I check the "ACCOUNT CREATED!"
    And I delete the account with the button
    Then I check the "ACCOUNT DELETED!"