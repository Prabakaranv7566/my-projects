package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginCheck {
	ChromeDriver driver;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	       WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	}
	

	@When("User pass the values for username and password")
	public void user_pass_the_values_for_username_and_password() 
	{
		driver.findElement(By.id("email")).sendKeys("oranium");
		driver.findElement(By.id("pass")).sendKeys("tech");
		
	}

	@When("user cliking the login button")
	public void user_cliking_the_login_button() 
	{
		driver.findElement(By.name("login")).click();
	}

	@Then("User should has to be on homepage")
	public void user_should_has_to_be_on_homepage() {
	    
	}

}
