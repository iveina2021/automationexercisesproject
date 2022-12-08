package com.github.iveina2021.helpers;

import com.github.iveina2021.page.AccountCreatedPage;
import com.github.iveina2021.page.AccountDeletedPage;
import com.github.iveina2021.page.MainPage;

public class DeleteUserHelper {

    public static AccountDeletedPage deleteUser(MainPage mainPage) {
        AccountCreatedPage accountCreatedPage = RegisterHelper.registerForDelete(mainPage);
        accountCreatedPage.goToMainPage();
        AccountDeletedPage accountDeletedPage = mainPage.deleteAccount();
        accountDeletedPage.checkAccountDeletedLabelIsVisible();
        return accountDeletedPage;
    }
}
