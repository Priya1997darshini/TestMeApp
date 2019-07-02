package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	@Given("^I have some cakes in my hand$")
	public void i_have_some_cakes_in_my_hand() throws Exception {
	    System.out.println("given");
	    
	}

	@When("^I wait for some hours$")
	public void i_wait_for_some_hours() throws Exception {
		System.out.println("when");
	    
	}

	@Then("^may cakes will disappear$")
	public void may_cakes_will_disappear() throws Exception {
		System.out.println("then");
	    
	}



}
