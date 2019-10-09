package Cucumber3.ABV;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

//import browserPack.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pagePack.Pages;

public class StepDefinationClassForPOM {
WebDriver driver;
@Given("^user is on the home page$")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver = UtilityClass.startBrowser("chrome", "http://newtours.demoaut.com/");
	}

	@When("^User enter the valid credentials$")
	public void user_enter_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		PageForPOM page= new PageForPOM(driver);
		page.do_login("tutorial", "tutorial");
	}

	@Then("^user must in home page and display success message$")
	public void user_must_in_home_page_and_display_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		WebDriverWait wait= new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}



}
