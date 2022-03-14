package com.vnv.magicbricks.steps;

import com.vnv.magicbricks.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	public static LoginPage log=new LoginPage();

@Given("User is on Login Page of MagicBricks application")
public void user_is_on_Login_Page_of_MagicBricks_application() {
    log.launchWebpage();
}

@When("User enters the Email as {string} on Login Page of MagicBricks application")
public void user_enters_the_Email_as_on_Login_Page_of_MagicBricks_application(String string) throws InterruptedException {
   log.enterEmail(string);
}

@And("User clicks on Next button")
public void user_clicks_on_Next_button() {
    log.nextButton();
}

@And("User enters the Password as {string} on Login Page of MagicBricks application")
public void user_enters_the_Password_as_on_Login_Page_of_MagicBricks_application(String string) {
    log.enterPassword(string);
}

@And("User Clicks on the Login button on Login Page of MagicBricks application")
public void user_Clicks_on_the_Login_button_on_Login_Page_of_MagicBricks_application() throws InterruptedException {
    log.loginButton();
}

@Then("User should be able to navigate to the Home page of MagicBricks application")
public void user_should_be_able_to_navigate_to_the_Home_page_of_MagicBricks_application() {
	log.magicBrickstitle();
	
}


	
}
