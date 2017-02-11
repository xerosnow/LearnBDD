package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClientSteps {

	WebDriver driver = null;
	private String URL = "http://newtours.demoaut.com/mercurywelcome.php";

	@Given("^The user on the newtours web page$")
	public void loadTheHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:/Selenium/Latest Versions/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@When("^User selects register link$")
	public void selectRegisterLink() throws Throwable {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@And("^User fills in the Contact Info$")
	public void fillContactInfo() throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys("John");
	}

	@And("^User enters User information$")
	public void fillUserInfo() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("John");
		driver.findElement(By.name("password")).sendKeys("John");
		driver.findElement(By.name("confirmPassword")).sendKeys("John");
	}

	@And("^User selects Submit$")
	public void selectSubmit() throws Throwable {
		driver.findElement(By.name("register")).click();
	}

	@Then("^System should show the thank you page$")
	public void verifyConfirmation() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().equals("http://newtours.demoaut.com/create_account_success.php"),
				"No Match Found");
		driver.close();
	}
}