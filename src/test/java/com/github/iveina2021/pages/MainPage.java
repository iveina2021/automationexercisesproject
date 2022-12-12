package com.github.iveina2021.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

// page_url = http://automationexercise.com/

public class MainPage {
    @FindBy(css = "a[href='/login']")
    public SelenideElement signupLoginLink;

    @FindBy(css = "a[href='/delete_account']")
    public SelenideElement deleteAccountLink;

    @FindBy(css = ".nav.navbar-nav a:has(.fa-user)")
    public SelenideElement loggedLink;

    @FindBy(css = "a[href='/logout']")
    public SelenideElement logoutLink;

    @FindBy(css = "a[href='/products']")
    public SelenideElement productsLink;

    public LoginPage openLoginPage() {
        signupLoginLink.click();
        return page(LoginPage.class);
    }

    public void checkLoggedLinkIsVisible() {
        loggedLink.should(Condition.exist);
    }

    public AccountDeletedPage deleteAccount() {
        deleteAccountLink.click();
        return page(AccountDeletedPage.class);
    }

    public LoginPage logoutUserClick() {
        logoutLink.click();
        return page(LoginPage.class);
    }

    public void checkLogoutIsSuccessful() {
        loggedLink.shouldNot(Condition.exist);
    }

    public AllProductsPage productsLinkClick() {
        productsLink.click();
        return page(AllProductsPage.class);
    }
}
