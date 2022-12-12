package com.github.iveina2021.ui.test;

import com.github.iveina2021.helpers.RegisterHelper;
import com.github.iveina2021.pages.MainPage;
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
        RegisterHelper.register(mainPage);
    }
}
