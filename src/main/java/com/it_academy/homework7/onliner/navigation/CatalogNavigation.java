package com.it_academy.homework7.onliner.navigation;

import static com.codeborne.selenide.Selenide.open;

public class CatalogNavigation {

    private  static String ONLINER_MAIN_PAGE = "onliner.by";
    public static void navigateToOnlinerPage(OnlinerUrl url){
        open("https://" + url.getUrl() + ONLINER_MAIN_PAGE);
    }



}
