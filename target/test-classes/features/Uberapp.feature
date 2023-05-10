Feature: Uber Booking Feature

  Scenario: Booking Cab
  
    Given User wants to select a car type "sedan" from Uber app
   When User select a car "seden" and pick up point "Kukatpally" and drop location "Koti"
     Then Driver starts the journey
    And Driver ends the journey
    Then User pay the amount 1000 UD
