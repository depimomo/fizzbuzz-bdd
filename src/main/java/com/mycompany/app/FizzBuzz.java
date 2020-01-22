package com.mycompany.app;

public class FizzBuzz {

    public String process(int value) {
        if (isEvenlyDividedBy(15, value)) {
            return "FizzBuzz";
        }
            
        if (isEvenlyDividedBy(5, value)) {
            return "Buzz";
        }

        if (isEvenlyDividedBy(3, value)) {
            return "Fizz";
        }

        return String.valueOf(value);
    }

    private boolean isEvenlyDividedBy(int divider, int value) {
        return value % divider == 0;
    }
}