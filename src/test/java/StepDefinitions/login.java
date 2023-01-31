
package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver;

	@Given("I have proper login url")
	public void i_have_proper_login_url() {
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
	}

	@Given("I have proper login credentials")
	public void i_have_proper_login_credentials() {
		WebElement ele = driver.findElement(By.xpath("//span[@class='sc-gsDJrp cNErrI hover hover' and contains(text(),'Profile')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[@class='sc-gsDJrp ePNcaI' and contains(text(),'Sign Up')]")).click();
		
	}

	@When("clicked on login button")
	public void clicked_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("should get logged in successfully")
	public void should_get_logged_in_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("go to cart")
	public void go_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("place order using net banking")
	public void place_order_using_net_banking() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
