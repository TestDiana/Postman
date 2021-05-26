package ru.netology.domain;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanTest {


    @Test
    void shouldReturnDemoAccounts() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("привет")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", Matchers.equalTo("привет"))
        ;
    }
}
