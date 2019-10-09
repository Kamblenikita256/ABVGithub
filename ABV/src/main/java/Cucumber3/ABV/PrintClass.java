package Cucumber3.ABV;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintClass {
	String str;
	@When("^user enters Hello World$")
	public void user_enters_Hello_World() {
		str="Hello World";
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^console displays Hello World$")
	public void console_displays_Hello_World() {
		System.out.print(str);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
