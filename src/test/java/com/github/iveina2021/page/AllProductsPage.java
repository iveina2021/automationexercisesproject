package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

// page_url = https://automationexercise.com/products

public class AllProductsPage {
    public SelenideElement allProductsLabel = $(".features_items .title");

    public SelenideElement searchProductInput = $("input[id='search_product']");

    public SelenideElement submitSearchButton = $("button[id='submit_search']");

    public void checkAllProductsPageIsVisible() {
        allProductsLabel.should(Condition.exist);
    }

    public SearchedProductsPage searchProduct(String productName) {
        searchProductInput.setValue(productName);
        submitSearchButton.click();
        return page(SearchedProductsPage.class);
    }
}