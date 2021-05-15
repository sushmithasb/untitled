Feature: application testing

    Scenario Outline: login page test

      Given user opens login page
      Then click on free 30 day trail
      Then choose country 'India'
      #Then take a screenshot 'login page', '<comps>'
      #Then user enters username <username>
      #Then user enters password <password>
      #And user clicks on login button
      #And close the browser

Examples:
  |username|password|comps|
  |sushmitha3494@gmail.com|9@Bangalore|users|


