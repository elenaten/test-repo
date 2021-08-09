$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginFlow.feature");
formatter.feature({
  "line": 2,
  "name": "Login Flow",
  "description": "",
  "id": "login-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginflow"
    }
  ]
});
formatter.before({
  "duration": 1447200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the User is on the brainpop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicValidationSteps.the_User_is_on_the_brainpop_homepage()"
});
formatter.result({
  "duration": 4517850600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Log In Button Validation",
  "description": "",
  "id": "login-flow;log-in-button-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User should be able to see \"Log In\" button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 28
    }
  ],
  "location": "LoginFlow.userShouldBeAbleToSeeButton(String)"
});
formatter.result({
  "duration": 85411400,
  "status": "passed"
});
formatter.after({
  "duration": 675834800,
  "status": "passed"
});
formatter.before({
  "duration": 63399,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the User is on the brainpop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicValidationSteps.the_User_is_on_the_brainpop_homepage()"
});
formatter.result({
  "duration": 3523586699,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Positive scenario to Log In",
  "description": "",
  "id": "login-flow;positive-scenario-to-log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User enter the correct credential to \"Log In\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User should be able to \"Log In\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 38
    }
  ],
  "location": "LoginFlow.user_enter_the_correct_credential_to(String)"
});
formatter.result({
  "duration": 762987100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 24
    }
  ],
  "location": "LoginFlow.user_should_be_able_to(String)"
});
formatter.result({
  "duration": 2082947701,
  "status": "passed"
});
formatter.after({
  "duration": 4726372500,
  "status": "passed"
});
formatter.before({
  "duration": 69999,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the User is on the brainpop homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicValidationSteps.the_User_is_on_the_brainpop_homepage()"
});
formatter.result({
  "duration": 3334379299,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Negative scenario to Log In",
  "description": "",
  "id": "login-flow;negative-scenario-to-log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User enter the incorrect credential to \"Log In\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User should be see the error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 40
    }
  ],
  "location": "LoginFlow.user_enter_the_incorrect_credential_to(String)"
});
formatter.result({
  "duration": 784256900,
  "status": "passed"
});
formatter.match({
  "location": "LoginFlow.user_should_be_see_the_error_message()"
});
formatter.result({
  "duration": 367977201,
  "status": "passed"
});
formatter.after({
  "duration": 4730131901,
  "status": "passed"
});
});