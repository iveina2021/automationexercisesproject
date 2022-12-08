package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://automationexercise.com/view_cart
public class ViewCartPage {

    @FindBy(css = "a[href='/product_details/1']")
    public SelenideElement blueTopLink;
    public SelenideElement deleteProductFromCartButton = $("a[class='cart_quantity_delete']");

    public SelenideElement emptyCartLabel = $("span[id*='empty']");

    public void checkCartContainsProduct() {
        blueTopLink.should(Condition.exist);
    }

    public void deleteProductFromCart() {
        deleteProductFromCartButton.click();
    }

    public void checkCartDoNotContainsProduct() {
        emptyCartLabel.should(Condition.exist);
    }
}