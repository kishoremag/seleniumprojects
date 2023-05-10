Feature: secured_browser

  Scenario Outline: 
    open a browser for giving version

    Given open "<bn>" browser
    When launch "<url>" site
    Then Title should be contains "<title>"
    And that site should be secured
    When close site

    Examples: 
      | bn     | url                     | title    |
      | chrome | http://www.google.co.in | Google   |
      | opera  | http://www.gmail.com    | Gmail    |
      | edge   | http://www.facebook.com | Facebook |
