Feature: Login Test
Description: Registered user can login into application using valid username and valid password


Scenario: Login with valid combination
Given user opens login page in newtours application
When user enter username as mercury and password as mercury
And Click on Submit button
Then verify login result


