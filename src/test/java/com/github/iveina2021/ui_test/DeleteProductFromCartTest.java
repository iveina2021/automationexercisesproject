package com.github.iveina2021.ui_test;

import com.github.iveina2021.helpers.DeleteProductFromCartHelper;
import com.github.iveina2021.page.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DeleteProductFromCartTest {

    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = open("http://automationexercise.com/", MainPage.class);
    }

    @Test
    public void deleteProductFromCart() {
        DeleteProductFromCartHelper.deleteProductFromCart(mainPage);
    }
}
