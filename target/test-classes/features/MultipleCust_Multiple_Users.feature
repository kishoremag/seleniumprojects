Feature: Create multiple customers and multiple users

  Scenario Outline: 
    Given open a "<bn>" browser
    And launch site using "http://dashboard.stripe.com/login"
    When do login using the  "<uid>" and "<pwd>" credentials
    Then customers tab should be displayed
    When add customers and verify
      | name          | email                      | description |
      | Rummy         | rummy.kishore427@gmail.com | hi bro      |
      | kishorekuruva | kuruvakishore561@gmail.com | hello       |
    When do logout the site
    Then login page should be redisplayed
    When close the  site

    Examples: 
      | bn     | uid                     | pwd           |
      | chrome | magnitiait72@gmail.com  | Magnitia@72   |
      |chrome  | kuruvakishore561@gmail.com | Magnitia@72 | 
     
