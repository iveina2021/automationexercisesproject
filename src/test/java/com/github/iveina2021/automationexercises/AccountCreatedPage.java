package com.github.iveina2021.automationexercises;

// page_url = https://automationexercise.com/account_created/


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage {

    @FindBy(css = ".title")
    public SelenideElement accountCreatedLabel;

    public void checkAccountCreatedLabelIsVisible() {
        accountCreatedLabel.should(Condition.exist);
    }
}
