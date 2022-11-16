package com.github.iveina2021.automationexercises;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.page;

// page_url = https://automationexercise.com/login/

public class LoginPage {

    @FindBy(css = "div[class='signup-form'] h2")
    public SelenideElement newUserSignupLabel;

    @FindBy(css = "input[data-qa='signup-name']")
    public SelenideElement signupNameInput;

    @FindBy(css = "input[data-qa='signup-email']")
    public SelenideElement signupEmailInput;

    @FindBy(css = "button[data-qa='signup-button']")
    public SelenideElement signupButton;

    public void checkNewUserSignUpLabelIsVisible() {
        newUserSignupLabel.isDisplayed();
    }

    public SignUpPage fillNewUserSignUpForm() {
        signupNameInput.setValue("Leonard");
        signupEmailInput.setValue(UUID.randomUUID() + "@mail.ru");
        signupButton.click();
        return page(SignUpPage.class);
    }
}
