package com.github.iveina2021.helpers;

import com.github.iveina2021.page.AccountCreatedPage;
import com.github.iveina2021.page.LoginPage;
import com.github.iveina2021.page.MainPage;
import com.github.iveina2021.page.SignUpPage;

public class RegisterHelper {

    public static AccountCreatedPage register(MainPage mainPage) {
        LoginPage loginPage = mainPage.openLoginPage();
        loginPage.checkNewUserSignUpLabelIsVisible();
        SignUpPage signUpPage = loginPage.fillNewUserSignUpForm(Constants.NAME,
                Constants.EMAIL);

        signUpPage.checkEnterAccountInformationLabelIsVisible();

        AccountCreatedPage accountCreatedPage = signUpPage.fillEnterAccountInformationForm(
                Constants.PASSWORD,
                "2", "4", "2015", "Sheldon",
                "Cooper",
                "Big Bang Theory Inc",
                "Abbey Road, 1",
                "Abbey Road, 2",
                "Canada",
                "Ontario",
                "Toronto",
                "123456",
                "88009952233");

        accountCreatedPage.checkAccountCreatedLabelIsVisible();
        return accountCreatedPage;
    }

    public static AccountCreatedPage registerForDelete(MainPage mainPage) {
        LoginPage loginPage = mainPage.openLoginPage();
        loginPage.checkNewUserSignUpLabelIsVisible();
        SignUpPage signUpPage = loginPage.fillNewUserSignUpForm(Constants.NAME_FOR_DELETE,
                Constants.EMAIL_FOR_DELETE);

        signUpPage.checkEnterAccountInformationLabelIsVisible();

        AccountCreatedPage accountCreatedPage = signUpPage.fillEnterAccountInformationForm(
                Constants.PASSWORD_FOR_DELETE,
                "2", "4", "2015", "Sheldon",
                "Cooper",
                "Big Bang Theory Inc",
                "Abbey Road, 1",
                "Abbey Road, 2",
                "Canada",
                "Ontario",
                "Toronto",
                "123456",
                "88009952233");

        accountCreatedPage.checkAccountCreatedLabelIsVisible();
        return accountCreatedPage;
    }
}
