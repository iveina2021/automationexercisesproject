package com.github.iveina2021.page;

// page_url = https://automationexercise.com/account_created/

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class AccountCreatedPage {

    @FindBy(css = "h2[data-qa='account-created']")
    public SelenideElement accountCreatedLabel;

    @FindBy(css = "a[href='/login']")
    public SelenideElement signupLoginLink;

    public void checkAccountCreatedLabelIsVisible() {
        accountCreatedLabel.should(Condition.exist);
    }

    public MainPage goToMainPage() {
        signupLoginLink.click();
        return page(MainPage.class);
    }
}
