package com.github.iveina2021.ui.test;

import com.github.iveina2021.helpers.SearchProductHelper;
import com.github.iveina2021.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchProductTest {

    MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = open("http://automationexercise.com/", MainPage.class);
    }

    @Test
    public void searchProduct() {
        SearchProductHelper.searchProduct(mainPage);
    }
}
