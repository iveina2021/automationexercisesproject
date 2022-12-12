package com.github.iveina2021.ui.test;

import com.github.iveina2021.helpers.LoginHelper;
import com.github.iveina2021.helpers.LogoutHelper;
import com.github.iveina2021.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LogoutUserTest {

    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = open("http://automationexercise.com/", MainPage.class);
    }

    @Test
    public void logoutUser() {
        LoginHelper.correctLogin(mainPage);
        LogoutHelper.logout(mainPage);
    }
}
