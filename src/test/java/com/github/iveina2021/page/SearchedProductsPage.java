package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

// page_url = https://automationexercise.com/products?search=blue%20top
public class SearchedProductsPage {
    public SelenideElement searchedProductsLabel = $x("//h2[@class='title text-center']");

    public SelenideElement addToCardButton = $("div[class^='productinfo'] a[class*='add-to-cart']");

    public SelenideElement viewCartLink = $x("//u");

    public void checkSearchedProductsPageIsVisible() {
        searchedProductsLabel.should(Condition.exist);
    }

    public ViewCartPage addProductToCart(SearchedProductsPage searchedProductsPage) {
        addToCardButton.click();
        viewCartLink.click();
        return page(ViewCartPage.class);
    }

    public void scrollToSearchedProduct() {
        searchedProductsLabel.scrollIntoView(true);
    }
}

