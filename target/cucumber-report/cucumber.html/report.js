$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Paylink Solutions Login Functionality",
  "description": "User should able to login into Paylink Solutions",
  "id": "paylink-solutions-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3386863400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "User should able to login with valid credentials",
  "description": "",
  "id": "paylink-solutions-login-functionality;user-should-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters valid USERNAME and PASSWORD",
  "rows": [
    {
      "cells": [
        "USERNAME",
        "PASSWORD"
      ],
      "line": 9
    },
    {
      "cells": [
        "technicaltest22@protonmail.com",
        "Password99*"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify user is on account page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 586158900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_valid_USERNAME_and_PASSWORD(DataTable)"
});
formatter.result({
  "duration": 127852600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 44092900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verify_user_is_on_account_page()"
});
formatter.result({
  "duration": 1764811200,
  "status": "passed"
});
formatter.after({
  "duration": 601477300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify error message is diplayed for invalid credentials",
  "description": "",
  "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters invalid \"\u003cUSERNAME\u003e\" and \"\u003cPASSWORD\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Verify error message is displayed \"\u003cERROR MESSAGE\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "USERNAME",
        "PASSWORD",
        "ERROR MESSAGE"
      ],
      "line": 21,
      "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;;1"
    },
    {
      "cells": [
        "abc@gmail.com",
        "Password99*",
        "Incorrect username or password"
      ],
      "line": 22,
      "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;;2"
    },
    {
      "cells": [
        "technicaltest22@protonmail.com",
        "abc123",
        "Incorrect username or password"
      ],
      "line": 23,
      "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1509368700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 22,
  "name": "Verify error message is diplayed for invalid credentials",
  "description": "",
  "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters invalid \"abc@gmail.com\" and \"Password99*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Verify error message is displayed \"Incorrect username or password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 441479100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 21
    },
    {
      "val": "Password99*",
      "offset": 41
    }
  ],
  "location": "LoginPageSteps.userEntersInvalidAnd(String,String)"
});
formatter.result({
  "duration": 131992700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 34903800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect username or password",
      "offset": 35
    }
  ],
  "location": "LoginPageSteps.verifyErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 1036196200,
  "status": "passed"
});
formatter.after({
  "duration": 568642400,
  "status": "passed"
});
formatter.before({
  "duration": 1547983800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 23,
  "name": "Verify error message is diplayed for invalid credentials",
  "description": "",
  "id": "paylink-solutions-login-functionality;verify-error-message-is-diplayed-for-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enters invalid \"technicaltest22@protonmail.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Verify error message is displayed \"Incorrect username or password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 427039500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "technicaltest22@protonmail.com",
      "offset": 21
    },
    {
      "val": "abc123",
      "offset": 58
    }
  ],
  "location": "LoginPageSteps.userEntersInvalidAnd(String,String)"
});
formatter.result({
  "duration": 137176900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 35782100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect username or password",
      "offset": 35
    }
  ],
  "location": "LoginPageSteps.verifyErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 1034928300,
  "status": "passed"
});
formatter.after({
  "duration": 583404300,
  "status": "passed"
});
});