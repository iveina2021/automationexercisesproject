package com.github.iveina2021.automationexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

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
        SignUpPage signUpPage = loginPage.fillNewUserSignUpForm("Leonard", UUID.randomUUID() + "@gmail.com");
        signUpPage.checkEnterAccountInformationLabelIsVisible();
        AccountCreatedPage accountCreatedPage = signUpPage.fillEnterAccountInformationForm(UUID.randomUUID() + "123", "Leonard", "Hofstedter", "Big Bang Theory Inc", "Abbey Road, 1", "Abbey Road, 2", "Ontario", "Toronto", "123456", "88009952233");
        accountCreatedPage.checkAccountCreatedLabelIsVisible();
    }
}
