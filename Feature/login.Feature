Feature: SignIn feature

  Scenario Outline: User SignIn into TestMe app
    Given  SignIn homepage is open
    And  SignIn link is clicked
    When  user provides "<username>" and pass as "<password>"

   
    Then  Home Page is opened

    Examples: 
      | username        | password    |
      | lalitha         | password123 |
      | AlexUser        | Alex@123    |
      