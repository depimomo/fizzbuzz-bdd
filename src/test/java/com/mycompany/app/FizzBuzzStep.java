package com.mycompany.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FizzBuzzStep {
    FizzBuzz fizzBuzz;
    int number;

    @Given("user printing number using FizzBuzz")
    public void user_printing_number_using_FizzBuzz() {
        fizzBuzz = new FizzBuzz();
    }

    @When("the number is {int}")
    public void the_number_is(Integer input) {
        number = input;
    }

    @Then("it will print {string}")
    public void it_will_print_number(String input) {
        assertEquals(input, fizzBuzz.process(number));
    }
}
