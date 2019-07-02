Feature:mercury

  Scenario Outline: successful login
     Given user enters Login Page
     When User enters valid "<Username>" and "<Password>"
     Then successful login
     
  Examples:
  |Username|Password|
  |mercury|mercury|
  |tutorial|tutorial|
  
  