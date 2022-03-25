#Auto generated Octane revision tag
@BSPID1012REV0.3.0
Feature: test Feature2
  Background:
    Given back2
    And back2
  @TSCID1139
  Scenario: test scenario2
    Given test2
    When test2
    Then test2
  @TSCID1140
  Scenario Outline: Table TTT2
    Given hello "<name>"
    When what "<question>"
    Then wow

    Examples:
      |name	|question	|
      |dan	|what		|
      |sari	|who		|
  @TSCID1141
  Scenario: test scenario3
    Given test3
    When test3
    Then test3
  @TSCID1142
  Scenario Outline: Table TTT4
    Given hello "<name>"
    When what "<question>"
    Then wow

    Examples:
      |name	|question	|
      |dan	|what		|
      |sari	|who		|

