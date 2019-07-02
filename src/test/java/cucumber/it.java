package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class it {
	@Given("^I am a \"(.*?)\" tester$")
	public void i_am_a_tester(String a) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(a);
	}

	@When("^I go to work$")
	public void i_go_to_work() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I \"(.*?)\" it$")
	public void i_it(String b) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(b);
	}

	@Then("^My boss \"(.*?)\" me$")
	public void my_boss_me(String c) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(c);
	}

	@Then("^The developer \"(.*?)\" me$")
	public void the_developer_me(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

