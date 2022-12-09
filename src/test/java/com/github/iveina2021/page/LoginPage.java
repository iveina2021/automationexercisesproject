package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://automationexercise.com/login/

public class LoginPage {

    @FindBy(css = "div[class='signup-form'] h2")
    public SelenideElement newUserSignupLabel;

    @FindBy(css = "div[class='login-form'] h2")
    public SelenideElement loginToYourAccountLabel;

    @FindBy(css = "input[data-qa='login-email']")
    public SelenideElement loginEmailInput;

    @FindBy(css = "input[data-qa='login-password']")
    public SelenideElement loginPasswordInput;

    @FindBy(css = "button[data-qa='login-button']")
    public SelenideElement loginButton;

    @FindBy(css = "input[data-qa='signup-name']")
    public SelenideElement nameInput;

    @FindBy(css = "input[data-qa='signup-email']")
    public SelenideElement emailInput;

    @FindBy(css = "button[data-qa='signup-button']")
    public SelenideElement signupButton;

    @FindBy(css = ".login-form p")
    public SelenideElement yourEmailPasswordIncorrect;

    public void checkNewUserSignUpLabelIsVisible() {
        newUserSignupLabel.should(Condition.exist);
    }

    public void checkLoginToYourAccountLabelIsVisible() {
        loginToYourAccountLabel.should(Condition.exist);
    }

    public SignUpPage fillNewUserSignUpForm(String name, String email) {
        nameInput.setValue(name);
        emailInput.setValue(email);
        signupButton.click();
        return Selenide.page(SignUpPage.class);
    }

    public MainPage fillLoginUserForm(String loginEmail, String loginPassword) {
        loginEmailInput.setValue(loginEmail);
        loginPasswordInput.setValue(loginPassword);
        loginButton.click();
        return Selenide.page(MainPage.class);
    }

    public void checkYourEmailPasswordIncorrectTextIsVisible() {
        yourEmailPasswordIncorrect.should(Condition.exist);
    }
}
