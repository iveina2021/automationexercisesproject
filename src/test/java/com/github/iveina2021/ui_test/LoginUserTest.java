package com.github.iveina2021.ui_test;

// page_url = https://automationexercise.com/signup

import com.github.iveina2021.helpers.LoginHelper;
import com.github.iveina2021.page.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginUserTest {
    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = open("http://automationexercise.com/", MainPage.class);
    }

    @Test
    public void loginUserWithCorrectEmailAndPassword() {
        LoginHelper.correctLogin(mainPage);
    }

    @Test
    public void loginUserWithIncorrectEmailAndPassword() {
        LoginHelper.incorrectLogin(mainPage);
    }
}