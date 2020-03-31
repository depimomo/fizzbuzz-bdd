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

    @Then("it will print Fizz")
    public void itWillPrintFizz() {
        assertEquals("Fizz", fizzBuzz.process(number));
    }

    @Then("it will print Buzz")
    public void itWillPrintBuzz() {
        assertEquals("Buzz", fizzBuzz.process(number));
    }

    @Then("it will print FizzBuzz")
    public void itWillPrintFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.process(number));
    }

    @Then("it will print {int}")
    public void itWillPrintNumber(Integer input) {
        assertEquals(input.toString(), fizzBuzz.process(number));
    }
}
