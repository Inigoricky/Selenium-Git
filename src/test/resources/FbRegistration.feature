Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the browser and maximise the window
When To url of fb application
And To click the create new account button
And To pass first name in first name text box
|Selenium|java|python|testing|
And To pass second name in second text box
And To pass mobileno or email in email text box
|inigo@gmail.com|8248617847|ricky@gmail.com|8428617847|
|9600801244|jeevan@gmail.com|jeeva@gmail.com|9600701234|
|Testing@gmail.com|8468742120|9863254710|8248627846|
And To create new password using new password text box
Then To close the chrome browser




