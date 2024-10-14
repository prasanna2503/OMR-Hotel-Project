Feature: Verifying OMR Branch Hotel Book Hotel Module

  Scenario Outline: Book hotel including GST-Card(credit card)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Prasanna  | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                 | Card Type   |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Deluxe   | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need Room in High Floor | Credit Card |

  Scenario Outline: Book hotel including GST-Card(credit card)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    When User should not Enter any special request
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Prasanna  | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type   |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card |

  Scenario Outline: Book hotel without GST-Card(credit card)-with special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    When User should not add GST details 
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Prasanna  | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Request                 | Card Type   |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Deluxe   | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com | Need Room in High Floor | Credit Card |

  Scenario Outline: Book hotel without GST-Card(credit card)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    When User should not Enter GST Details and Special request
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Prasanna  | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Card Type   |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Deluxe   | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com | Credit Card |

  Scenario Outline: Book hotel without entering any field , book field and verify all the error message
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click credit card
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                 |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need Room in High Floor |

  Scenario Outline: Book hotel including GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                 | upiId                |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need Room in High Floor | seleniumtraining@vbc |

  Scenario Outline: Book hotel including GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    When User should not Enter any special request
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | upiId                |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc |

  Scenario Outline: Book hotel without GST-(UPI ID)-With special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    When User should not add GST details 
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Request                 | upiId                |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com | Need Room in High Floor | seleniumtraining@vbc |

  Scenario Outline: Book hotel without GST-(UPI ID)-Without special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    When User should not Enter GST Details and Special request
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | upiId                |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com | seleniumtraining@vbc |

@Book
  Scenario Outline: Book hotel without entering any field in upi field , book field and verify all the error message
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prasanna"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User click upi
    And User click submit without enetring payment details
    Then User should verify after payment details error message "Please provide your UPI ID"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email              | Enter Registration No. | Enter Company Name     | Enter Company Address | Request                 |
      | kprasanna2406@gmail.com | Lovely@0612 | Tamil Nadu | Chennai | Suite    | 2024-10-13 | 2024-10-15 | 1-One      | 2-Two        |            2 | Mr.               | Prasanna   | Kumar     | 7896543213 | prasanna@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need Room in High Floor |
