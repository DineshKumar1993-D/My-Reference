$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adaction.feature");
formatter.feature({
  "line": 1,
  "name": "Test The Adactin Hotel Booking Application",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Url Of Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username \"\u003cUsernames\u003e\" In The Inputbox",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"\u003cPasswords\u003e\" In The Inputbox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates In The Searchhotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "Usernames",
        "Passwords"
      ],
      "line": 12,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;1"
    },
    {
      "cells": [
        "dinesh123",
        "djh8989jd"
      ],
      "line": 13,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;2"
    },
    {
      "cells": [
        "ram1213",
        "jdhjk389"
      ],
      "line": 14,
      "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Url Of Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username \"dinesh123\" In The Inputbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"djh8989jd\" In The Inputbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates In The Searchhotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Stepdef.launch_The_Url_Of_Adactin_Application()"
});
formatter.result({
  "duration": 2248478400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dinesh123",
      "offset": 26
    }
  ],
  "location": "Adactin_Stepdef.user_Enters_The_Username_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 194499400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "djh8989jd",
      "offset": 26
    }
  ],
  "location": "Adactin_Stepdef.user_Enters_The_Password_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 68839600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Stepdef.user_Clicks_The_Loginbutton_and_Its_Navigates_In_The_Searchhotel_Page()"
});
formatter.result({
  "duration": 308359200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "test-the-adactin-hotel-booking-application;checks-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch The Url Of Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Username \"ram1213\" In The Inputbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The Password \"jdhjk389\" In The Inputbox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Clicks The Loginbutton and Its Navigates In The Searchhotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Stepdef.launch_The_Url_Of_Adactin_Application()"
});
formatter.result({
  "duration": 236399500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ram1213",
      "offset": 26
    }
  ],
  "location": "Adactin_Stepdef.user_Enters_The_Username_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 119716500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jdhjk389",
      "offset": 26
    }
  ],
  "location": "Adactin_Stepdef.user_Enters_The_Password_In_The_Inputbox(String)"
});
formatter.result({
  "duration": 77542000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin_Stepdef.user_Clicks_The_Loginbutton_and_Its_Navigates_In_The_Searchhotel_Page()"
});
formatter.result({
  "duration": 335489400,
  "status": "passed"
});
});