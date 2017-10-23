@ignore
Feature: FizzBuzz should produce correct output with examples

  Scenario Outline: Fizzbuzz produces the right stuff
    When FizzBuzz called for round <round>
    Then Result has value <FizzBuzzResult>

    Examples:
    | round | FizzBuzzResult |
    | 3     |    Fizz |
    | 15    | Fizz Buzz |
    | 2     |   2 |
    | 1     |  1 |
    | 105   | Fizz Buzz Monkey |