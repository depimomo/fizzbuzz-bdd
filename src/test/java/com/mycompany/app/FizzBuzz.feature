Feature: FizzBuzz

  Background:
    Given user printing number using FizzBuzz

  Scenario Outline: Should return <result>
    When the number is <input>
    Then it will print <result>

    Examples:
    | input | result      |
    | 3     | "Fizz"      |
    | 6     | "Fizz"      |
    | 5     | "Buzz"      |
    | 10    | "Buzz"      |
    | 15    | "FizzBuzz"  |
    | 30    | "FizzBuzz"  |
    | 4     | "4"         |
    | 14    | "14"        |
