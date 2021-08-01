$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/zensar/featurefile/Case.feature");
formatter.feature({
  "line": 1,
  "name": "User Industries",
  "description": "\r\nAs a Registered User\r\nI want to specify log in condition",
  "id": "user-industries",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6331642200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login page",
  "description": "",
  "id": "user-industries;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TIS11-1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the log in link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should navigate to relative page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should navigate to login page as should see \"Welcome, Please Sign In!\" message",
  "keyword": "And "
});
formatter.match({
  "location": "ServiceSteps.userIsOnHomePage()"
});
formatter.result({
  "duration": 116772600,
  "status": "passed"
});
formatter.match({
  "location": "ServiceSteps.userClicksOnTheLogInLink()"
});
formatter.result({
  "duration": 17900,
  "status": "passed"
});
formatter.match({
  "location": "ServiceSteps.userShouldNavigateToRelativePage()"
});
formatter.result({
  "duration": 26000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 50
    }
  ],
  "location": "ServiceSteps.userShouldNavigateToLoginPageAsShouldSeeMessage(String)"
});
formatter.result({
  "duration": 4661800,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.zensar.cucumber.selpdefs.ServiceSteps.userShouldNavigateToLoginPageAsShouldSeeMessage(ServiceSteps.java:24)\r\n\tat ✽.And User should navigate to login page as should see \"Welcome, Please Sign In!\" message(src/test/java/com/zensar/featurefile/Case.feature:10)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 654099800,
  "status": "passed"
});
});