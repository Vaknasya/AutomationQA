Feature: Test calculator summing

  Scenario: Summing with zero
    Given I test calculator
    When I add 0 and 3
    Then Result is 3

  Scenario Outline: Summing different numbers with zero for result <result>
    Given I test calculator
    When I add <firstValue> and <secondValue>
    Then Result is <result>
    Examples:
      | firstValue | secondValue | result |
      | 0          | 7           | 7      |
      | 0          | 0           | 0      |
      | -9         | 5           | -4     |
