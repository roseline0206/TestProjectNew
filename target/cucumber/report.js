$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/flipkartsearch.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Application Search",
  "description": "",
  "id": "flipkart-application-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Searching the products",
  "description": "",
  "id": "flipkart-application-search;searching-the-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "A application called Flipkart to test",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user clicks on close button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters the mobiles in search field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user validates to check mobiles are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user checks for Real me mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartSearch.a_application_called_Flipkart_to_test()"
});
formatter.result({
  "duration": 23211057700,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartSearch.user_clicks_close_button()"
});
formatter.result({
  "duration": 397921600,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartSearch.user_enters_the_mobiles_in_search_field()"
});
formatter.result({
  "duration": 436502200,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartSearch.user_clicks_on_Search_Button()"
});
formatter.result({
  "duration": 3578216600,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartSearch.user_validates_to_check_mobiles_are_displayed()"
});
formatter.result({
  "duration": 179472700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});