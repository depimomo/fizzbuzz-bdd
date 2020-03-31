Feature: FizzBuzz

  Background:
    Given user printing number using FizzBuzz

  Scenario: Should return Fizz
    When the number is 3
    Then it will print "Fizz"

    When the number is 6
    Then it will print "Fizz"

  Scenario: Should return Buzz
    When the number is 5
    Then it will print "Buzz"

    When the number is 10
    Then it will print "Buzz"

  Scenario: Should return FizzBuzz
    When the number is 15
    Then it will print "FizzBuzz"

    When the number is 30
    Then it will print "FizzBuzz"

  Scenario: Should return number
    When the number is 4
    Then it will print "4"

    When the number is 14
    Then it will print "14"

