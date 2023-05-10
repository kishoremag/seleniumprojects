Feature: userlogin

  Background: 
    Given open browser
    When launch site

  Scenario: 
    Validate page tittle

    Then tittle should be google

  Scenario Outline: 
    Validate login opeartion

    And enter "<userid>"
    And enter "<password>"
    And click on sigin button
    Then next page should be displayed

    Examples: 
      | userid | passowrd |
      | asdf   | kish@34  |
      | asdf   |          |
      |        | kish@34  |
