Feature: Open the naukari site

Scenario Outline:

Given open the chrome "chrome" browser
And launch the site using "https://www.naukri.com"
When do login use "kuruvakishore561@gmail.com" and "9391737642" credentials 
Then open naukari homepage
When update the naukari site profile
Then close the site

 

