Feature: Login

  Scenario Outline: Login with valid credentials
    Given user navigates to the swag labs web 
    When user enters "<username>" and "<password>" and clicks login button
    Then login must be "<result>"
    Examples:
      | username 				| password 	   | result 	  |
      | standard_user			| secret_sauce | successful   |
      | locked_out_user			| secret_sauce | unsuccessful |
      | problem_user			| secret_sauce | successful   |
      | performance_glitch_user | secret_sauce | successful   |