Feature: Verifying OMRBranch Hotel Select Hotel Module

  Scenario Outline: Select last hotel name and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Deluxe   | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 |


  Scenario Outline: Select second hotel name from last and verify navigate to Book Hotel page
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the second from last hotel name and hotel price
    And User select the second from last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"

    Examples: 
      | userName                | password    | state      | city    | roomType                            | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 |
@Select
  Scenario Outline: Select the first Hotel name and dismiss the alert
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the first hotel name and hotel price
    And User select the first hotel and accept the alert
    Then User should verify after select success message "Select Hotel"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Deluxe   | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 |
