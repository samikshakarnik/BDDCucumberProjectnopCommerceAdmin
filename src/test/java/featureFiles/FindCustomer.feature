Feature: Search Customer 

Scenario: Search Customer from the Customer List
When user navigates to the Admin url "https://admin-demo.nopcommerce.com/login"
Then login with email "admin@yourstore.com" and password "admin"
And Click on Customers from the left pannel and again click on Customers
Then User enters Search values
  |admin@yourstore.com|John|Smith|
And Click on Search