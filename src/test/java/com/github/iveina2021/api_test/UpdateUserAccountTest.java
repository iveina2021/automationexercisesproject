package com.github.iveina2021.api_test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateUserAccountTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://automationexercise.com";
    }

    @Test
    public void updateUserAccount() {

        Map<String, String> payload = new HashMap<>();

        payload.put("name", "Leonard7");
        payload.put("email", "leo10@mail.ru");
        payload.put("password", "1234567");
        payload.put("title", "Mr");
        payload.put("birth_date", "30");
        payload.put("birth_month", "4");
        payload.put("birth_year", "1980");
        payload.put("firstname", "Leonard");
        payload.put("lastname", "Hofstadter");
        payload.put("company", "Big Bang Theory Inc");
        payload.put("address1", "Abbey Road 1");
        payload.put("address2", "Abbey Road 2");
        payload.put("country", "Canada");
        payload.put("zipcode", "123444");
        payload.put("state", "Toronto");
        payload.put("city", "Ontario");
        payload.put("mobile_number", "88009956688");

        Response response = RestAssured.given()
                .params(payload)
                .put("/api/updateAccount");
        String responseText = response.getBody().prettyPrint();

        response.then()
                .statusCode(200);

        Assertions.assertThat(responseText).contains("User updated!");
    }
}
