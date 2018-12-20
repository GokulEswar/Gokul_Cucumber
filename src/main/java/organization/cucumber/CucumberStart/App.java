package organization.cucumber.CucumberStart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class App
{
	static WebDriver driver;
		@Given("Opening a browser")
    	public void opening_a_browser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\java workspace\\CucumberStart\\Driver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
    	}

    	@When("Searching the value into google search engine")
    	public void searching_the_value_into_google_search_engine() {
    		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon", Keys.ENTER);
    	}

    	@Then("I validate the outcomes")
    	public void i_validate_the_outcomes() {
    		System.out.println("Cucumber Startup Completed");
    		boolean equalsIgnoreCase = driver.getCurrentUrl().contains("search");
    		System.out.println(equalsIgnoreCase);
    	}
}
