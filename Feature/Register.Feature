Feature: Register feature

Scenario: User Registers himself in test me App
Given Homepage is open
And SignUp link is clicked
When user enters "qazxsw" as username
And user provides first name as "King"
And user enters last name as "Queen"
And user enters password as "kingqueen"
And User re-enters password as "kingqueen"
And user selects Gender as "Male"
And user provides Email id as "king@gmail.com"
And user enters Mobile number as "0123456789"
And user enters Date of Birth as "01/01/1996"
And user provides Address as "Bengaluru"
And user selects Security Question as "What is your Birth Place?"
And user provides Answer to the Security Question as "India"
And user clicks on Register button
Then user will find testmeapp LogIn homepage