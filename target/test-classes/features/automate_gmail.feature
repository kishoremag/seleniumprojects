 Feature: Automation on Gmail through chrome browser

  Scenario Outline: 
    Given open the "chrome" browser
    When launch site using mail "http://www.gmail.com"
    When do login using "Magnitia27@gmail.com" and "Magnitia@it"
    Then compose is displayed
    When click on compose
    Then fields should be displayed
    When fill the fields "<to>","<subject>","<body>" and "<attachment>"
    Then send is enabled
    When click on send
    #Then "Message sent" should be displayed
    When do logout
    Then login page should be redisplayed
    When close site

    Examples: 
      | to                         | subject | body     | attachment                   |
      | kuruvakishore561@gmail.com | wishes  | Hi bro   | C:\\Downloads\\spiderman.jpg |
      | rummy.kishore427@gmail.com | wishes  | namasthe | C:\\Downloads\\spiderman.jpg |
