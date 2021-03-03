$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserManagementPageSmokeTest.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the librarian logged in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.UserGroupDropdownStepDefs.the_librarian_logged_in_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Management Page Smoke Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@PROF-248"
    }
  ]
});
formatter.step({
  "name": "the librarian clicked on Users on top the page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.UserGroupDropdownStepDefs.the_librarian_clicked_on_on_top_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the librarian navigates to \"User Management\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.UserGroupDropdownStepDefs.the_librarian_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});