@login
Feature: login Page
Scenario: verify login funcationality
Given I am on homepage 
When I click on login link
And I enter login details
|email|test@test.com|
|password|qatest123|
Then I should be able to login to the webpage

