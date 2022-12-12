package com.github.iveina2021.api.test;

import com.github.iveina2021.fixture.UserRequest;
import com.github.iveina2021.helpers.Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.iveina2021.helpers.RegisterHelper.createDefaultUserRequestBuilder;

public class UpdateUserAccountTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = Constants.BASE_URL;
    }

    @Test
    public void updateUserAccount() {
        UserRequest request = createDefaultUserRequestBuilder()
                .mobileNumber("88005553535")
                .build();

        Response response = RestAssured.given()
                .params(request.toParams())
                .put("/api/updateAccount");
        String responseText = response.getBody().prettyPrint();

        response.then()
                .statusCode(200);

        Assertions.assertThat(responseText).contains("User updated!");
    }
}
