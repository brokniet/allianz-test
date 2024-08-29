Feature: Login

  Scenario Outline: Login with valid credentials
    Given user navigates to the swag labs web 
    When user enters "<username>" and "<password>" and clicks login button
    Then login must be "<successful>"
    Examples:
      | username 				| password 	   | successful |
      | standard_user			| secret_sauce | true   	|
      | locked_out_user			| secret_sauce | false 		|
      | problem_user			| secret_sauce | true   	|
      | performance_glitch_user | secret_sauce | true   	|