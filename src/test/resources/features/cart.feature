Feature: Ebebek shopping cart functionality

  @wip
  Scenario: Search a product, add to cart and verify the product in the cart
    Given user is at the ebebek home page
    When user types "biberon" in the search box and clicks Enter
    And user clicks the first product
    And user clicks Sepete Ekle button
    And user clicks Sepeti Gör button
    Then user sees "Hoşgeldin Bebek Biberon Seti" in the cart item list