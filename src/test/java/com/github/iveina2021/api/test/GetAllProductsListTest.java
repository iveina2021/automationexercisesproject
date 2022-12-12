package com.github.iveina2021.api.test;

import com.github.iveina2021.fixture.Product;
import com.github.iveina2021.helpers.Constants;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GetAllProductsListTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = Constants.BASE_URL;
    }

    @Test
    public void getAllProductsList() {
        Response response = RestAssured.given()
                .get("/api/productsList");

        response.then()
                .statusCode(200);

        String responseJson = StringUtils.substringBetween(response.asPrettyString(), "<body>", "</body>");

        List<Product> products = JsonPath.from(responseJson).getList("products", Product.class);

        assertThat(products).isNotEmpty();
        assertThat(products.get(0).getName()).hasSizeLessThan(10);
    }
}

