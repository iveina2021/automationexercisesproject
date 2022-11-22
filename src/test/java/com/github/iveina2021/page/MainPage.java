package com.github.iveina2021.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

// page_url = http://automationexercise.com/

public class MainPage {
    @FindBy(css = "a[href='/login']")
    public SelenideElement signupLoginLink;

    public LoginPage openLoginPage() {
        signupLoginLink.click();
        return page(LoginPage.class);
    }
}