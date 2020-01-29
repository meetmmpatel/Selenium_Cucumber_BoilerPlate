package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.CucumberRunner;

public class StepClass extends CucumberRunner {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {

	

	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {

	}

}
