package com.github.iveina2021.helpers;

import com.github.iveina2021.pages.AllProductsPage;
import com.github.iveina2021.pages.MainPage;
import com.github.iveina2021.pages.SearchedProductsPage;

import static com.codeborne.selenide.Selenide.page;

public class SearchProductHelper {

    public static SearchedProductsPage searchProduct(MainPage mainPage) {
        AllProductsPage allProductsPage = mainPage.productsLinkClick();
        allProductsPage.checkAllProductsPageIsVisible();
        allProductsPage.searchProduct(Constants.PRODUCT);
        return page(SearchedProductsPage.class);
    }
}
