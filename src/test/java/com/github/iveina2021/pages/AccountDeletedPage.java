package com.github.iveina2021.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://automationexercise.com/delete_account

public class AccountDeletedPage {

    @FindBy(css = "h2[data-qa='account-deleted']")
    public SelenideElement accountDeletedLabel;

    public void checkAccountDeletedLabelIsVisible() {
        accountDeletedLabel.should(Condition.exist);
    }
}


