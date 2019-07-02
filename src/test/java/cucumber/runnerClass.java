package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	plugin = {"html:target/Destination"}, 
	tags = {"@cake"})
	                             

	public class runnerClass {

	}

