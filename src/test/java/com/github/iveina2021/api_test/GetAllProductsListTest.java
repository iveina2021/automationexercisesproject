package com.github.iveina2021.api_test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetAllProductsListTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://automationexercise.com";
    }

    @Test
    public void getAllProductsList() {
        Response response = RestAssured.given()
                .get("/api/productsList");
        String responseText = response.getBody().prettyPrint();

        response.then()
                .statusCode(200);

        Assertions.assertThat(responseText).contains("products");
    }
}

