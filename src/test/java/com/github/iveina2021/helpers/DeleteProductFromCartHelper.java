package com.github.iveina2021.helpers;

import com.github.iveina2021.page.AllProductsPage;
import com.github.iveina2021.page.MainPage;
import com.github.iveina2021.page.SearchedProductsPage;
import com.github.iveina2021.page.ViewCartPage;

public class DeleteProductFromCartHelper {

    public static void deleteProductFromCart(MainPage mainPage) {
        AllProductsPage allProductsPage = mainPage.productsLinkClick();
        allProductsPage.checkAllProductsPageIsVisible();
        SearchedProductsPage searchedProductsPage = SearchProductHelper.searchProduct(mainPage);
        searchedProductsPage.scrollToSearchedProduct();
        searchedProductsPage.checkSearchedProductsPageIsVisible();
        ViewCartPage viewCartPage = searchedProductsPage.addProductToCart(searchedProductsPage);
        viewCartPage.checkCartContainsProduct();
        viewCartPage.deleteProductFromCart();
        viewCartPage.checkCartDoNotContainsProduct();
    }
}
