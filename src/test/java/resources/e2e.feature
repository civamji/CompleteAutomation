Feature: Verify End to end testcase works
  Background: Prestep to make sure user is on right state

    Given User is already logged with credentials as "civamofficial@gmail.com" and "987654321".


    Scenario: Add item in the cart successfully
      Given User clicks on item "//img[@alt='Nike react infinity run flyknit']"
      When User selects the user option size as "L" and color as "Green"
      And User click on AddToCart.