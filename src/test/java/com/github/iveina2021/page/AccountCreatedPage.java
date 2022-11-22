package com.github.iveina2021.page;

// page_url = https://automationexercise.com/account_created/


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage {

    @FindBy(css = "h2[data-qa='account-created']")
    public SelenideElement accountCreatedLabel;

    public void checkAccountCreatedLabelIsVisible() {
        accountCreatedLabel.should(Condition.exist);
    }
}
