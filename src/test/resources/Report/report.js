$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginDetails.feature");
formatter.feature({
  "name": "Booking Adactin Hotel by changing Room type Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Booking Adactin Hotel by changing Room Type",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User shoud enter into Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should \"\u003cselctlocation\u003e\", \"\u003chotel\u003e\",\"\u003croom type\u003e\",\"\u003cno of rooms\u003e\",\"\u003ccheck in date\u003e\",\"\u003ccheck out date\u003e\",\"\u003cadults per room\u003e\",\"\u003cchild per room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user should select hotel and click continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cfirst name\u003e\",\"\u003clast name\u003e\",\"\u003caddress\u003e\",\"\u003ccard number\u003e\",\"\u003ccard details\u003e\",\"\u003cexpiry month\u003e\",\"\u003cexpiry year\u003e\",\"\u003cccv\u003e\" and user should click continue",
  "keyword": "And "
});
formatter.step({
  "name": "user should get order detail",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "selctlocation",
        "hotel",
        "room type",
        "no of rooms",
        "check in date",
        "check out date",
        "adults per room",
        "child per room",
        "first name",
        "last name",
        "address",
        "card number",
        "card details",
        "expiry month",
        "expiry year",
        "ccv"
      ]
    },
    {
      "cells": [
        "karthi007",
        "Karthi@1989",
        "Brisbane",
        "Hotel Hervey",
        "Standard",
        "4 - Four",
        "26-Aug-2020",
        "28-Aug-2020",
        "2 - Two",
        "0 - None",
        "Raj",
        "Kumar",
        "west streest,chennai",
        "5432 2345 7890 1234",
        "Master Card",
        "July",
        "2021",
        "234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Booking Adactin Hotel by changing Room Type",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User shoud enter into Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition.user_shoud_enter_into_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"karthi007\" and \"Karthi@1989\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenition.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should \"Brisbane\", \"Hotel Hervey\",\"Standard\",\"4 - Four\",\"26-Aug-2020\",\"28-Aug-2020\",\"2 - Two\",\"0 - None\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.user_should(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select hotel and click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.user_should_select_hotel_and_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"Raj\",\"Kumar\",\"west streest,chennai\",\"5432 2345 7890 1234\",\"Master Card\",\"July\",\"2021\",\"234\" and user should click continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.user_should_enter_and_user_should_click_continue(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get order detail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.user_should_get_order_detail()"
});
formatter.result({
  "status": "passed"
});
});