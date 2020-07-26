$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17570660400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to register successfully,so that user can use all functionality on my website",
  "description": "",
  "id": "registration-feature;user-should-able-to-register-successfully,so-that-user-can-use-all-functionality-on-my-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters all required -submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should able to register sucessfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 4667557300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 5876668900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_registration_details()"
});
formatter.result({
  "duration": 71700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_submit_button()"
});
formatter.result({
  "duration": 41100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_sucessfuly()"
});
formatter.result({
  "duration": 146496200,
  "status": "passed"
});
formatter.after({
  "duration": 179100,
  "status": "passed"
});
});