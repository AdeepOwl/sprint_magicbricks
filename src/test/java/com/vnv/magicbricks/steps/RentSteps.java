package com.vnv.magicbricks.steps;

import com.vnv.magicbricks.pages.RentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class RentSteps {

	public static RentPage ren=new RentPage();



@Given("User has already logged in with valid credentials of MagicBricks application")
public void user_has_already_logged_in_with_valid_credentials_of_MagicBricks_application() throws InterruptedException {
    
	ren.login();
}

@And("User Is navigated to MagicBricks homepage")
public void user_Is_navigated_to_MagicBricks_homepage() throws InterruptedException {
    
	ren.homepage();
}

@Given("User enters the {string} in the search bar field of MagicBricks application")
public void user_enters_the_in_the_search_bar_field_of_MagicBricks_application(String string) throws InterruptedException {
   
	ren.searchfield(string);
}

@And("User clicks on search button of MagicBricks application")
public void user_clicks_on_search_button_of_MagicBricks_application() {
    
	ren.searchfieldclick();
}

@Then("alert message is displayed")
public void alert_message_is_displayed() {
    
	ren.searchalert();
}


@And("User Selects option in drop down link of the search bar field of MagicBricks application")
public void user_Selects_option_in_drop_down_link_of_the_search_bar_field_of_MagicBricks_application() {
	
    ren.searchoption();
	
}

@Then("Properties are displayed")
public void properties_are_displayed() throws InterruptedException {
    
	System.out.println("Properties are displayed");
	Thread.sleep(3000);
}

@Given("User navigates to rent drop down and clicks on owner properties of MagicBricks application")
public void user_navigates_to_rent_drop_down_and_clicks_on_owner_properties_of_MagicBricks_application() {
    
	ren.ownerproperties();
}

@And("User filters the properties of MagicBricks application")
public void user_filters_the_properties_of_MagicBricks_application() throws InterruptedException {
    
	ren.sortproperties();
}

@And("Filtered properties are displayed of MagicBricks application")
public void filtered_properties_are_displayed_of_MagicBricks_application() {
    
	System.out.println("Filtered properties are displayed of MagicBricks application");
}

@And("User clicks on selected property of MagicBricks application")
public void user_clicks_on_selected_property_of_MagicBricks_application() {
    
	ren.selectproperty();
}

@And("User clicks on contact agent of MagicBricks application")
public void user_clicks_on_contact_agent_of_MagicBricks_application() throws InterruptedException {
    
	ren.propertycontactagent();
}

@Then("Confirmation message is displayed")
public void confirmation_message_is_displayed() {
    
	System.out.println("Confirmation message is displayed");
}


@Given("User navigates to rent drop down and clicks on verified properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_verified_properties() {
    ren.verifiedproperties();
}

@And("User clicks on save for later of MagicBricks application")
public void user_clicks_on_save_for_later_of_MagicBricks_application() throws InterruptedException {
   
	ren.propertycontactagent();
}


@Given("User navigates to rent drop down and clicks on furnishedHomes properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_furnishedHomes_properties() {
	
    ren.furnishedHomesproperties();
}

@Given("User navigates to rent drop down and clicks on bachelorHomes properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_bachelorHomes_properties() {
	
	ren.bachelorHomesproperties();
}

@Given("User navigates to rent drop down and clicks on house properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_house_properties() {
   
	ren.houseproperties();
}
	
@Given("User navigates to rent drop down and clicks on villa properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_villa_properties() {
	
    ren.villaproperties();
}

@Given("User navigates to rent drop down and clicks on PG properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_PG_properties() {
    
	ren.pgproperties();
}

@Given("User navigates to rent drop down and clicks on OfficeSpace properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_OfficeSpace_properties() {
    
	ren.officespaceproperties();
}

@Given("User navigates to rent drop down and clicks on under ten_thousand properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_under_ten_thousand_properties() {
	
    ren.tenthousandproperties();
}

@Given("User navigates to rent drop down and clicks on fifteen_thousand properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_fifteen_thousand_properties() {
    
	ren.fifteenthousandproperties();
}

@Given("User navigates to rent drop down and clicks on twentyfive_thousand properties")
public void user_navigates_to_rent_drop_down_and_clicks_on_twentyfive_thousand_properties() {
    
	ren.twentyfivethousandproperties();
}


@Given("User navigates to rent drop down and clicks on Find Agent")
public void user_navigates_to_rent_drop_down_and_clicks_on_Find_Agent() {
    ren.findagent();
}

@Given("Agent page is displayed of MagicBricks application")
public void agent_page_is_displayed_of_MagicBricks_application() {
    
	System.out.println("Agent page is displayed");
}

@Given("User filters the Agent page of MagicBricks application")
public void user_filters_the_Agent_page_of_MagicBricks_application() {
    
	ren.filteragent();
}

@Given("Filtered Agents are displayed of MagicBricks application")
public void filtered_Agents_are_displayed_of_MagicBricks_application() {
    
	System.out.println("Filtered Agents are displayed");
}

@Given("User clicks on agent of MagicBricks application")
public void user_clicks_on_agent_of_MagicBricks_application() {
    
	ren.selectagent();
}

@Given("User clicks on Agent_contact agent of MagicBricks application")
public void user_clicks_on_Agent_contact_agent_of_MagicBricks_application() {
    
	ren.agentcontactagent();
}


}
