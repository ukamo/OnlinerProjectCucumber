package com.it_academy.homework7.onliner.steps;

import com.it_academy.homework7.onliner.navigation.OnlinerUrl;
import com.it_academy.homework7.onliner.page_object.pages.BasketPage;
import com.it_academy.homework7.onliner.page_object.pages.CatalogPage;
import com.it_academy.homework7.onliner.page_object.pages.PageOffers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.it_academy.homework7.onliner.navigation.CatalogNavigation.navigateToOnlinerPage;

public class CatalogSteps {

    CatalogPage catalogPage = new CatalogPage();
    PageOffers pageOffers = new PageOffers();
    BasketPage basketPage = new BasketPage();

    @Given("the user opens Onliner website")
    public void userOpensOnlinerWebsite() {
        navigateToOnlinerPage(OnlinerUrl.HOME);
    }

    @When("the user clicks on Catalog section")
    public void userClicksOnCatalogSection() {
        navigateToOnlinerPage(OnlinerUrl.Catalog);
    }


    @And("the user clicks on Catalog Classifier {string}")
    public void userClicksOnCatalogClassifier(String classifier) {
        catalogPage.clickOnCatalogClassifierLink(classifier);
    }

    @And("the user clicks on Section Item Catalog {string}")
    public void userClicksOnSectionItemCatalog(String item) {
        catalogPage.clickTextSectionItemCatalog(item);
    }


    @And("the user clicks on Product Link {string}")
    public void userClicksOnProductLink(String product) {
        catalogPage.clickOnProductLink(product);
    }


    @And("the user clicks on Price Item Offer {string}")
    public void userClicksOnPriceItemOffer(String item) {
        catalogPage.clickOnItemOffers(item);
    }

    @And("the user clicks on Add in Basket by First {int} Price")
    public void theUserClicksOnAddInBasketByFirstPrice(int numberPrice) {
        pageOffers.clickOnPriceByCount(numberPrice);
    }


    @And("the user clicks on Basket button")
    public void theUserClicksOnBasketButton() {
        pageOffers.navigateToBasketButton();

    }

    @Then("the product is added in Basket {string}")
    public void theProductIsAddedInBasket(String element) {
        basketPage.getTextSectionItemCatalogLink(element);
    }


}
