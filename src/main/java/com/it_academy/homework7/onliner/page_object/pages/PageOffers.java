package com.it_academy.homework7.onliner.page_object.pages;

import com.it_academy.homework7.onliner.page_object.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class PageOffers extends BasePage {
    private static final String PRICE_BY_COUNT_XPATH_PATTERN = "//div[contains(@class,'offers-list__item')]['%s']//div[contains(@class,'offers-list__part_action')]//a[contains(@class,'offers-list__button_cart button-style_expletive')]";

    private static final String NAVIGATE_TO_BASKET = "//a[contains(@class,'button-style_another button-style_base-alter product-recommended__button')]";
    public void clickOnPriceByCount(int count){
        $x(format(PRICE_BY_COUNT_XPATH_PATTERN, count)).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();
    }

    public void navigateToBasketButton(){
        $x(NAVIGATE_TO_BASKET).shouldBe(and("clickable", visible, enabled), Duration.ofSeconds(30)).click();
    }



}
