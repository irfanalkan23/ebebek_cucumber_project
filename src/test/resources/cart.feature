Feature: Searching a product and adding to cart

  @wip
  Scenario: Ebebek search functionality title verification
    Given user is at the ebebek home page
    When user types "biberon" in the search box and clicks Enter
    Then user sees "Ara biberon - ebebek" in the page title
    When user clicks the first product
    Then user sees "Lansinoh Hoşgeldin Bebek Biberon Seti - ebebek" in the product page title
    Then user sees "Hoşgeldin Bebek Biberon Seti" at the product title
    When user clicks Sepete Ekle button
    Then user sees Ürün Sepetinizde window
    And user clicks Sepeti Gör button
    Then sees "Sepet" in the page title
    And user sees "Hoşgeldin Bebek Biberon Seti" in the cart item list