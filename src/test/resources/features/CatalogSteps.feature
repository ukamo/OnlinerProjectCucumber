@smoke
  Feature: As an user
    I want to get ability to get any good in basket
  Scenario:Add good in basket
    Given the user opens Onliner website
    When the user clicks on Catalog section
    And the user clicks on Catalog Classifier "Электроника"
    And the user clicks on Section Item Catalog "Аудиотехника"
    And the user clicks on Product Link "Наушники"
    And the user clicks on Price Item Offer "AirPods 2 в зарядном футляре"
    And the user clicks on Add in Basket by First 1 Price
    And the user clicks on Basket button
    Then the product is added in Basket "AirPods 2 в зарядном футляре"