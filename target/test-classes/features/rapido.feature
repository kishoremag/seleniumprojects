Feature: Booking bike

  Scenario: 
    Given user want to select a bike in rapido app
    When user select bike then pickuplocation is "kukatpally" and droplocation is "Ameerpet"
    Then driver sarts the journey
    And end the journey
    Then user pay 55 rupees amount
