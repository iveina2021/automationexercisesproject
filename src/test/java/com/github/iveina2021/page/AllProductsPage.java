package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

// page_url = https://automationexercise.com/products

public class AllProductsPage {
    public SelenideElement allProductsLabel = $("h2[class$='text-center']");

    public SelenideElement searchProductInput = $("input[id='search_product']");

    public SelenideElement submitSearchButton = $("button[id='submit_search']");

    public void checkAllProductsPageIsVisible() {
        allProductsLabel.should(Condition.exist);
    }

    public SearchedProductsPage searchProduct(String product_name) {
        searchProductInput.setValue(product_name);
        submitSearchButton.click();
        return page(SearchedProductsPage.class);
    }
}