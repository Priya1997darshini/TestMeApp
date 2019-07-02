package cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver.exe");
	  	  driver=new ChromeDriver();
	  	   driver.get("http://demoaut.com/");
        //driver.get("http://demoaut.com/");
   	}
	@When("^user is on the login pagen  user enters correct credentials$")
	public void user_is_on_the_login_pagen_user_enters_correct_credentials() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("invalidUN");
	    driver.findElement(By.name("password")).sendKeys("invalidPW");
	    driver.findElement(By.name("login")).click();
	    
	}



	@Then("^user can do the successful login$")
	public void user_can_do_the_successful_login() throws Throwable {
        Assert.assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
	   
	}
	


	public class Credentials{
        public String username;
        public String password;
    }


	@When("^user enters below credentails and clicks sing in$")
	public void user_enters_below_credentails_and_clicks_sing_in(List<Credentials> userdata) throws Throwable {
		for(Credentials credentials:userdata){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	          driver.findElement(By.name("userName")).sendKeys(credentials.username);
	          driver.findElement(By.name("password")).sendKeys(credentials.password);
	          driver.findElement(By.name("login")).click();
	          driver.navigate().back();
	         	}
	}

	
	
	@Then("^the expected behavior could be$")
	public void the_expected_behavior_could_be() throws Throwable {
	    System.out.println("end");
	    
	}


}
