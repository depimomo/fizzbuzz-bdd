package com.mycompany.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FizzBuzzStep {
    FizzBuzz fizzBuzz;
    int number;

    @Given("user printing number using FizzBuzz")
    public void userPrintingNumberUsingFizzBuzz() {
        fizzBuzz = new FizzBuzz();
    }

    @When("the number is {int}")
    public void theNumberIs(Integer input) {
        number = input;
    }

    @Then("it will print {string}")
    public void itWillPrintNumber(String input) {
        assertEquals(input, fizzBuzz.process(number));
    }
}
