package com.github.iveina2021.automationexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegisterUserTest {
    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = open("http://automationexercise.com/", MainPage.class);
    }

    @Test
    public void registerUser() {
        LoginPage loginPage = mainPage.openLoginPage();
        loginPage.checkNewUserSignUpLabelIsVisible();
        SignUpPage signUpPage = loginPage.fillNewUserSignUpForm();
        signUpPage.checkEnterAccountInformationLabelIsVisible();
        signUpPage.fillEnterAccountInformationForm();
    }
}
