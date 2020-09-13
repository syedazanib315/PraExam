$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("skyblue.feature");
formatter.feature({
  "line": 2,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 4178782700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "SkyBlueSteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 91923200,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 497575400,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 14941300,
  "status": "passed"
});
formatter.uri("whitebackground.feature");
formatter.feature({
  "line": 2,
  "name": "White Background Change",
  "description": "",
  "id": "white-background-change",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 3428710700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "White Background Change",
  "description": "",
  "id": "white-background-change;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "SkyBlueSteps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 34745900,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 478170800,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 11362900,
  "status": "passed"
});
});