Feature: 
  Cross_browser

  Scenario Outline: 
    Given "<bn>" as browser
    When launch the  "<url>" site
    Then tittle should be contains "<title>"
    And site should be secured
    When close site

    Examples: 
      | bn     | url                     | title    |
      | chrome | http://www.google.co.in | Google   |
      | opera  | http://www.gmail.com    | Gmail    |
      | edge   | http://www.facebook.com | Facebook |
