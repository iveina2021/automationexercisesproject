package com.github.iveina2021.api_test;

import com.github.iveina2021.helpers.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class DeleteAccountTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = Constants.BASE_URL;
    }

    @Test
    public void deleteAccount() {
        Map<String, String> deleteRequest = Map.of(
                "email", "leo9@mail.ru",
                "password", "1234567");

        Response response = RestAssured.given()
                .params(deleteRequest)
                .delete("/api/deleteAccount");

        String responseText = response.getBody().asPrettyString();
        response.then()
                .statusCode(200);

        Assertions.assertThat(responseText).contains("Account deleted!");
    }
}
