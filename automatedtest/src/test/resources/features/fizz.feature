
Feature: FizzBuzz should produce correct output

  Scenario: Fizzbuzz produces Buzz
    When FizzBuzz called for round 5
    Then Result has value Buzz