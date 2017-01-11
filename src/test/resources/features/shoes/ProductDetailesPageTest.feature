Feature: Receiving information about shoe size
  Validating size and color matching with users choice

  Scenario: Receiving shoe size list
    Given user is on the product page
    When user sees shoe size guide link
    Then  verify that shoes size link is presented and clickable

  Scenario: Verify displaying of product’s size and quantity
    Given user is on the product page
    When user chooses shoes size with index '1'
    Then verify that product quantity is displayed
    And verify shoes size

  Scenario: Verify color and size of selected product
    Given user is on the product page
    When user chooses shoes size with index '2'
    Then verify shoes color
    And verify shoes size