Feature: gmail mail compose
  Scenario: 
  Given  open "chrome" browser
  And launch  the site using "https://www.gmail.com"
  When do login using "practicesweety@gmail.com" and "9059109797sS#" credentials
  Then compose should be displayed
  When click on compose 
  Then fields should be displayed
  When fill fields with "<to>","<send>","<body>" and "<attachement>"
  |to        |subject|   body   | attachment |
  |sabithashankeshi97@gmail.com| wishes|hi sweety|"C:\\Users\\DELL\\Downloads\\sabitha Automation testing.pdf"|
  |sabithashankeshi97@gmail.com| wishes2|hi sweety|"C:\\Users\\DELL\\Downloads\\sabitha Automation testing.pdf"|
  
  Then send is enabled
  When click on send
  Then "Message send" should be displayed
  When do logout
  Then login page should be redisplayed
  When close site
