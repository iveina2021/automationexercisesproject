package com.github.iveina2021.helpers;

import com.github.iveina2021.pages.AllProductsPage;
import com.github.iveina2021.pages.MainPage;
import com.github.iveina2021.pages.SearchedProductsPage;
import com.github.iveina2021.pages.ViewCartPage;

public class AddProductToCartHelper {

    public static void addProductToCart(MainPage mainPage) {
        AllProductsPage allProductsPage = mainPage.productsLinkClick();
        allProductsPage.checkAllProductsPageIsVisible();
        SearchedProductsPage searchedProductsPage = SearchProductHelper.searchProduct(mainPage);
        searchedProductsPage.scrollToSearchedProduct();
        searchedProductsPage.checkSearchedProductsPageIsVisible();
        ViewCartPage viewCartPage = searchedProductsPage.addProductToCart(searchedProductsPage);
        viewCartPage.checkCartContainsProduct();
    }
}
