package com.github.iveina2021.helpers;

import com.github.iveina2021.page.LoginPage;
import com.github.iveina2021.page.MainPage;

import java.util.UUID;

public class LoginHelper {

    public static MainPage correctLogin(MainPage mainPage) {

        LoginPage loginPage = mainPage.openLoginPage();
        loginPage.checkNewUserSignUpLabelIsVisible();
        loginPage.fillLoginUserForm(Constants.EMAIL, Constants.PASSWORD);
        mainPage.checkLoggedLinkIsVisible();
        return mainPage;
    }

    public static void incorrectLogin(MainPage mainPage) {
        LoginPage loginPage = mainPage.openLoginPage();
        loginPage.checkLoginToYourAccountLabelIsVisible();
        loginPage.fillLoginUserForm(UUID.randomUUID() + "@gmail.com",
                UUID.randomUUID() + "123");
        loginPage.checkYourEmailPasswordIncorrectTextIsVisible();
    }
}
