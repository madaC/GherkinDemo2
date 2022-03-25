#Auto generated Octane revision tag
@BSPID1013REV0.2.0
Feature: Buying items in shopping cart for many users
  Background:
    Given payment security system is up

  @TSCID1138
  Scenario Outline: Many users buy items in their carts
    Given a customer named "<customer>"
    Given I am logged in as "<customer>"
    Given I have at least one item in cart
    When I try to buy items in my cart
    Then I confirm my payment method "<payment>" and proceed to checkout.
    Then hi

    Examples:
      | customer | payment |
      | Jane Doe | Paypal |
      | Jorge Rodrigues | VISA |
      | Sally Dunn | VISA |
      | Pierre Bisset | American Express |
      | Masayoshi Horita | Cash |
      | Masayoshi Horita | Cash |
