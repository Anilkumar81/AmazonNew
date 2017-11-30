Feature: add Product To Basket

Scenario: add Product to basket with Search
Given I am in home page
When I click on search textbox and enter the product name
And I click on search button
When I Select product quantity
And I click on Add to cart button
Then I should see product quantity in basket