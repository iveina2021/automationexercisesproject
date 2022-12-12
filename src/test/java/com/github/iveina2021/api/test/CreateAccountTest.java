package com.github.iveina2021.api.test;

import com.github.iveina2021.fixture.UserRequest;
import com.github.iveina2021.helpers.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateAccountTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = Constants.BASE_URL;
    }

    @Test
    public void registerUserAPI() {

        UserRequest payload = UserRequest.builder()
                .name("Leonard7")
                .email("leo11@mail.ru")
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
                .mobileNumber("88009956677")
                .build();

        Response response = RestAssured.given()
                .params(payload.toParams())
                .post("/api/createAccount");
        String responseText = response.getBody().prettyPrint();

        response.then()
                .statusCode(200);

        Assertions.assertThat(responseText).contains("User created!");
    }
}
