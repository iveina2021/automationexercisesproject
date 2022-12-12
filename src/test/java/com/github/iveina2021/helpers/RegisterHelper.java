package com.github.iveina2021.helpers;

import com.github.iveina2021.fixture.UserRequest;
import com.github.iveina2021.pages.AccountCreatedPage;
import com.github.iveina2021.pages.LoginPage;
import com.github.iveina2021.pages.MainPage;
import com.github.iveina2021.pages.SignUpPage;

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

    public static UserRequest.UserRequestBuilder createDefaultUserRequestBuilder() {
        return UserRequest.builder()
                .name("Leonard7")
                .email("leo10@mail.ru")
                .password("1234567")
                .title("Mr")
                .birthDate("24")
                .birthMonth("5")
                .birthYear("1990")
                .firstname("Leonard")
                .lastname("Hofstadter")
                .company("Big Bang Theory Inc")
                .address1("Abbey Road 1")
                .address2("Abbey Road 2")
                .country("Canada")
                .zipcode("123456")
                .state("Toronto")
                .city("Ontario")
                .mobileNumber("88009956677");
    }

}
