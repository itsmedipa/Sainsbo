$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 5609705100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verify login funcationality",
  "description": "",
  "id": "login-page;verify-login-funcationality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter login details",
  "rows": [
    {
      "cells": [
        "email",
        "test@test.com"
      ],
      "line": 7
    },
    {
      "cells": [
        "password",
        "qatest123"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be able to login to the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_am_on_homepage()"
});
formatter.result({
  "duration": 246840400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_login_link()"
});
formatter.result({
  "duration": 1651877700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_enter_login_details(DataTable)"
});
formatter.result({
  "duration": 742141500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_be_able_to_login_to_the_webpage()"
});
formatter.result({
  "duration": 18987400,
  "status": "passed"
});
formatter.after({
  "duration": 108331400,
  "status": "passed"
});
});