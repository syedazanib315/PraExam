$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/skyblue.feature");
formatter.feature({
  "line": 2,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@blue"
    }
  ]
});
formatter.before({
  "duration": 4885635500,
  "status": "passed"
});
formatter.before({
  "duration": 3995404100,
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
  "duration": 107227300,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 258216400,
  "status": "passed"
});
formatter.match({
  "location": "SkyBlueSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 16422800,
  "status": "passed"
});
});