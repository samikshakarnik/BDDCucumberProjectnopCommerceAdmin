Feature: Login
 
@RightLogin
Scenario: login with Valid Credentials 
Given User navigates to url "https://admin-demo.nopcommerce.com/login"
Then User enters email as "admin@yourstore.com" and password as "admin" and click on login
Then Page Title should be "Dashboard / nopCommerce administration"
And click on Logout then page title should be "Your Store. Login"

@WrongLogin
Scenario: login with Invalid Credentials 
Given User direct to url "https://admin-demo.nopcommerce.com/login"
Then User enters email as "admin@yourstore.com" and wrong password as "Admin" and click on login
And Error should be thrown as "Login was unsuccessful. Please correct the errors and try again."
Then Page Title detected as "Your store. Login"
