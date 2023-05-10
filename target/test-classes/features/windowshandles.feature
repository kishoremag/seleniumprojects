Feature: to open all browsers

  Scenario Outline: 
    open a browser for giving version

    Given open "<bn>" browser
    When launch "<url>" site
    When close site

    Examples: 
      | bn     | url                     |
      | chrome | http://www.google.co.in |
