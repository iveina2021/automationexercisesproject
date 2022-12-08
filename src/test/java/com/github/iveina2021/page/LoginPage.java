package com.github.iveina2021.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://automationexercise.com/login/

public class LoginPage {

    @FindBy(css = "div[class='signup-form'] h2")
    public SelenideElement newUserSignupLabel;
    @FindBy(css = "input[data-qa='signup-name']")
    public SelenideElement nameInput;

    @FindBy(css = "input[data-qa='signup-email']")
    public SelenideElement emailInput;

    @FindBy(css = "button[data-qa='signup-button']")
    public SelenideElement signupButton;

    public void checkNewUserSignUpLabelIsVisible() {
        newUserSignupLabel.should(Condition.exist);
    }

    public SignUpPage fillNewUserSignUpForm(String name, String email) {
        nameInput.setValue(name);
        emailInput.setValue(email);
        signupButton.click();
        return Selenide.page(SignUpPage.class);
    }
}
