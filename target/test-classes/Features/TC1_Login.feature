Feature: Verifying OMRBranch Hotel Login Module


  Scenario Outline: Verifying login with valid credentials without Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"

    Examples: 
      | userName                | password    |
      | kprasanna2406@gmail.com | Lovely@0612 |


  Scenario Outline: Verifying login with valid credentials with Enter Key using Robot Class
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>" with enter key
    Then User should verify success message after login "Welcome Prasanna"

    Examples: 
      | userName                | password    |
      | kprasanna2406@gmail.com | Lovely@0612 |
@Login
  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName                | password    |
      | kprasanna2406@gmail.com | Lovely@0612 |
