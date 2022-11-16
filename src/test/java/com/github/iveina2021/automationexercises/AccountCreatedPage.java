package com.github.iveina2021.automationexercises;

// page_url = https://automationexercise.com/account_created/


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage {
    @FindBy(css = "b")
    public WebElement accountCreated;

    public void checkAccountCreated() {
        accountCreated.isDisplayed();
    }
}
