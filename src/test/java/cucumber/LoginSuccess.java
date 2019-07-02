package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSuccess 
{
        WebDriver driver;
        String expected="Find a Flight: Mercury Tours:";
@Given("^Login Page$")
public void login_Page() throws Exception 
{
	System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("http://demoaut.com/");
}

@When("^User enters valid credentials$")
public void user_enters_valid_credentials() throws Exception 
{
	 driver.findElement(By.name("userName")).sendKeys("mercury");
     driver.findElement(By.name("password")).sendKeys("mercury");
     driver.findElement(By.name("login")).click();
     
   
}

@Then("^Login successful$")
public void login_successful() throws Exception 
{
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Assert.assertEquals(expected, driver.getTitle());
}

  }
