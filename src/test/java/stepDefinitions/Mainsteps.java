package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {

	
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User Landed on netbanking page");
	}
	
	//User is on Practice landing page
	

	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User is on Practice landing page");
//		Assert.assertTrue(false);
		
	}
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username,String password) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("User login into application");
//		System.out.println(username +" and password is "+password);
//	}
	
//	//Regex expression ^ ,$ are the regex identification for cucumber
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User login into application");
		System.out.println(username +" and password is "+password);
	}
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User login into application");
		
		System.out.println("User login into application after downloading project from Git");
		
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Cards are displayed");
	}
	 
	@Given("setUp the entries in database")
	public void setupEnterprise()
	{
		System.out.println("************");
		System.out.println("SetUp the entries in Database");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser()
	{
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the home page url of banking site")
	public void hitUrl()
	{
		System.out.println("hit the home page url of banking site");
	}
	
}

