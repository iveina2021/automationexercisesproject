package com.github.iveina2021.helpers;

import com.github.iveina2021.pages.MainPage;

public class LogoutHelper {

    public static void logout(MainPage mainPage) {
        mainPage.logoutUserClick();
        mainPage.checkLogoutIsSuccessful();
    }
}
