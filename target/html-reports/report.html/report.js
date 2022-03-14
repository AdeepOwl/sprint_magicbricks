$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/magicbricks/Rent.feature");
formatter.feature({
  "name": "Validate Rent functionality of MagicBricks application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Rent"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has already logged in with valid credentials of MagicBricks application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_has_already_logged_in_with_valid_credentials_of_MagicBricks_application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable: javascript:void(0) has no size and location\n  (Session info: chrome\u003d99.0.4844.51)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN24009212\u0027, ip: \u0027192.168.54.220\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.51, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\adeedv\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:51497}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: af977abb6df9b969d57529e5c78da810\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat com.vnv.magicbricks.pages.RentPage.login(RentPage.java:145)\r\n\tat com.vnv.magicbricks.steps.RentSteps.user_has_already_logged_in_with_valid_credentials_of_MagicBricks_application(RentSteps.java:19)\r\n\tat ✽.User has already logged in with valid credentials of MagicBricks application(file:///C:/vnv_magic_bricks/com.vnv_magicbricks_adeep11/src/test/resources/magicbricks/Rent.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Is navigated to MagicBricks homepage",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_Is_navigated_to_MagicBricks_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Successful renting house properties",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Rent"
    },
    {
      "name": "@RentingPropertyType_House"
    }
  ]
});
formatter.step({
  "name": "User navigates to rent drop down and clicks on house properties",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_navigates_to_rent_drop_down_and_clicks_on_house_properties()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User filters the properties of MagicBricks application",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_filters_the_properties_of_MagicBricks_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Filtered properties are displayed of MagicBricks application",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.filtered_properties_are_displayed_of_MagicBricks_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on selected property of MagicBricks application",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_clicks_on_selected_property_of_MagicBricks_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on contact agent of MagicBricks application",
  "keyword": "And "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.user_clicks_on_contact_agent_of_MagicBricks_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Confirmation message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vnv.magicbricks.steps.RentSteps.confirmation_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});