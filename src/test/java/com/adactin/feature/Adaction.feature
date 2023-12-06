Feature: Test The Adactin Hotel Booking Application

@smoketest
Scenario Outline: Checks The Login Functionality

Given launch The Url Of Adactin Application
When user Enters The Username "<Usernames>" In The Inputbox
And user Enters The Password "<Passwords>" In The Inputbox
Then user Clicks The Loginbutton and Its Navigates In The Searchhotel Page

Examples: 
					|Usernames|Passwords|
          |dinesh123|djh8989jd|
          |ram1213|jdhjk389|

