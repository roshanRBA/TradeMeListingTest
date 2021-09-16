Feature: TradeMe Used Car Listing

  Scenario Outline: Open a single used car listing and check availability of some properties
    Given the user is on TradeMe Motors page
    When the user searches a car providing some <keywords>
    And opens one of the listings
    Then the car number plate is displayed
    And the odometer reading is displayed
    And the body type of the car is displayed
    And the seat count is displayed

    Examples:
    |keywords     |
    |Mazda 3 2018 |