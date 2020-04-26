package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


@RunWith(Cucumber.class)
public class stepDefinition {

	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given step");
	}

	 @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String uname, String pass) throws Throwable {
		 System.out.println("when step");
		 System.out.println("uname:"+uname+", pass: "+pass);
	    }

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then step");
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String status) throws Throwable {
		System.out.println("and step");
		 System.out.println("status: "+status+"\n");
    }
	
	
	
	
	

}
