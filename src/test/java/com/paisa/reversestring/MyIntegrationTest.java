package com.paisa.reversestring;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MyIntegrationTest {

    @Test
    void testReverseEndpoint() {
        // Set the base URI for the RestAssured tests
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;

        // Define the input string for testing
        String inputString = "HelloWorld";

        // Perform the GET request to the /reverse endpoint and validate the response
        given()
                .param("input", inputString)
                .when()
                .get("/reverse")
                .then()
                .statusCode(200)
                .body(equalTo(new StringBuilder(inputString).reverse().toString()));
    }
}
