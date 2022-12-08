package com.github.iveina2021.helpers;

import com.github.iveina2021.page.AllProductsPage;
import com.github.iveina2021.page.MainPage;
import com.github.iveina2021.page.SearchedProductsPage;

import static com.codeborne.selenide.Selenide.page;

public class SearchProductHelper {

    public static SearchedProductsPage searchProduct(MainPage mainPage) {
        AllProductsPage allProductsPage = mainPage.productsLinkClick();
        allProductsPage.checkAllProductsPageIsVisible();
        allProductsPage.searchProduct(Constants.PRODUCT);
        return page(SearchedProductsPage.class);
    }
}
