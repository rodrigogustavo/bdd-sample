package com.rodrigo.bdd_sample;

import org.junit.jupiter.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FizzBuzzStepdefs {

	FizzBuzz fizzBuzz;
	String result;

	@Given("^Create a FizzBuzz game play$")
	public void createAFizzGamePlay() throws Throwable{
		fizzBuzz = new FizzBuzz();
	}

	@When("^I play with number (\\d+)$")
	public void iPlayWithNumber(int number) throws Throwable{
		result = fizzBuzz.play(number);
	}

	@Then("^The result is \"([^\"]*)\"$")
	public void theResultWasFizz(String resultString) throws Throwable{
		Assertions.assertEquals(result, resultString);
	}
}
