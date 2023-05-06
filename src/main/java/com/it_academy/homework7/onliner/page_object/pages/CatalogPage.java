package com.it_academy.homework7.onliner.page_object.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.homework7.onliner.page_object.BasePage;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
   private static final String SECTION_ITEM_XPATH_PATTERN = "//div[contains(@class,'aside-item')]//div[contains(text(),'%s')]";
   private static final String PRODUCT_XPATH_PATTERN = "//div[contains(@class, 'aside-item_active')]//div[contains(@class, 'dropdown-list')]" + "/a[contains(@href, 'onliner')]//span[contains(@class, 'title') and contains(text(), '%s')]";
    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN = "//ul[@class='catalog-navigation-classifier ']/li//span[normalize-space(text()) and contains(text(), '%s')]";

    private static final String ITEM_OFFERS_XPATH_PATTERN = "//div[contains(@class,'schema-product__group')]//a[contains(@title,'%s')]";

    public CatalogPage clickTextSectionItemCatalog(String link) {
        $x(format(SECTION_ITEM_XPATH_PATTERN, link)).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();
        return this;
    }

    public void clickOnProductLink(String product) {
        $x(format(PRODUCT_XPATH_PATTERN, product)).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();
    }

    public CatalogPage clickOnCatalogClassifierLink(String link) {
        $x(format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN, link)).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();
        return this;
    }

    public void clickOnItemOffers(String link){
        $x(format( ITEM_OFFERS_XPATH_PATTERN, link)).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();

    }

}
