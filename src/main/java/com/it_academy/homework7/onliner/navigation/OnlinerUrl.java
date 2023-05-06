package com.it_academy.homework7.onliner.navigation;

public enum OnlinerUrl {
    HOME(""),
    Catalog("catalog.");

    private String url;

    OnlinerUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
