Feature: FizzBuzz

  Scenario: Should return Fizz
    Given user printing number using FizzBuzz
    When the number is 3
    Then it will print Fizz

    Given user printing number using FizzBuzz
    When the number is 6
    Then it will print Fizz

  Scenario: Should return Buzz
    Given user printing number using FizzBuzz
    When the number is 5
    Then it will print Buzz

    Given user printing number using FizzBuzz
    When the number is 10
    Then it will print Buzz

  Scenario: Should return FizzBuzz
    Given user printing number using FizzBuzz
    When the number is 15
    Then it will print FizzBuzz

    Given user printing number using FizzBuzz
    When the number is 30
    Then it will print FizzBuzz

  Scenario: Should return number
    Given user printing number using FizzBuzz
    When the number is 4
    Then it will print 4

    Given user printing number using FizzBuzz
    When the number is 14
    Then it will print 14

