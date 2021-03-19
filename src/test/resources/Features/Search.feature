Feature: Search for a product on the Home Page
Scenario: Verify search funationality
Given I am on home page
When I click on search 
And I click on "Dress"
Then I should be able to see that product on Search page
@Search
Scenario Outline: Verify search with valid and invalid data
Given I am on home page
When I click on search 
And I enter "<keyword>"
Then I should be able to see  search "<related>" page 
Examples:
|keyword|related|
|Top|Search results for: Top | Tu clothing|
|uniform|Search results for: uniform | Tu clothing|
|136400097|Search results for: 136400097 | Tu clothing|
|121212121|Search results for: 121212121 | Tu clothing|
|pink| Search results for: pink | Tu clothing|
|Water| Search results for: Water | Tu clothing|



