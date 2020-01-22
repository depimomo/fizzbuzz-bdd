package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void process_shouldReturnFizz_whenInputIs3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.process(3));
    }

    @Test
    public void process_shouldReturnBuzz_whenInputIs5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz", fizzBuzz.process(5));
    }

    @Test
    public void process_shouldReturnNumberItSelf_whenInputIsNot3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1", fizzBuzz.process(1));
    }

    @Test
    public void process_shouldReturnFizzBuzz_whenInputIs15() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("FizzBuzz", fizzBuzz.process(15));
    }

    @Test
    public void process_shouldReturnFizz_whenInputIs6() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.process(6));
    }

    @Test
    public void process_shouldReturnBuzz_whenInputIs10() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz", fizzBuzz.process(10));
    }

}
