package com.it_academy.homework7.onliner.page_object.pages;

import com.codeborne.selenide.SelenideElement;
import com.it_academy.homework7.onliner.page_object.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class BasketPage extends BasePage {
    private static final String ELEMENT_IN_BASKET ="//div[contains(@class,'cart-form__offers')]//a[contains(text(),'%s' )]";

    public void getTextSectionItemCatalogLink(String element) {
        $x(format(ELEMENT_IN_BASKET, element)).shouldBe(visible, Duration.ofSeconds(30));
    }

}
