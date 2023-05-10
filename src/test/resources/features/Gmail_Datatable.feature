Feature: Gmail Compose on Datatable

  Scenario:  
  Given open "Chrome" the browser
    And launch  the site using "http://www.gmail.com"
    When do login using  the "magnitiait72@gmail.com" and "Magnitia@007" credenatials
    Then compose is to  displayed
    When fill fields and send mail and check  the response
      | to                         | subject | body   | attachment                   |
      | rummy.kishore427@gmail.com | hi      | wishes | C:\\Downloads\\spiderman.jpg |
      | kuruvakishore561@gmail.com | hello   | amigo  | C:\\Downloads\\spiderman.jpg |
    When do the logout
    Then login the page should be redisplayed
    When close the site
