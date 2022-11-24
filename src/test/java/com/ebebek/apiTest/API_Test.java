package com.ebebek.apiTest;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Otomasyonu – API:
 * API isteği sonucunun (HTTP Status Code) kontrolünü gerçekleştiren aşağıdaki test senaryosunu istediğiniz programlama dili ile geliştiriniz.
 * Senaryo: Seçilecek birer tane GET ve POST isteği için “HTTP Status Code” 200 (başarılı), değilse (başarısız) olan test senaryosu. (http://generator.swagger.io)
 */

public class API_Test {

    String url = "https://generator.swagger.io/api";

    @DisplayName("GET request to /gen/clients")
    @Test
    public void test1(){
        given()
                .accept(ContentType.JSON)
        .when()
                .get(url + "/gen/clients")
        .then()
                .statusCode(200);
    }

    @DisplayName("POST request to /gen/clients/java")
    @Test
    public void test2(){

        String requestJsonBody = "{\n" +
            "  \"spec\": {},\n" +
            "  \"options\": {\n" +
            "    \"additionalProp1\": \"string\",\n" +
            "    \"additionalProp2\": \"string\",\n" +
            "    \"additionalProp3\": \"string\"\n" +
            "  },\n" +
            "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
            "  \"authorizationValue\": {\n" +
            "    \"value\": \"string\",\n" +
            "    \"type\": \"string\",\n" +
            "    \"keyName\": \"string\",\n" +
            "    \"urlMatcher\": {}\n" +
            "  },\n" +
            "  \"usingFlattenSpec\": true,\n" +
            "  \"securityDefinition\": {\n" +
            "    \"type\": \"string\",\n" +
            "    \"description\": \"string\"\n" +
            "  }\n" +
            "}";

        given()
                .accept(ContentType.JSON)
        .and()
                .contentType(ContentType.JSON)
                .body(requestJsonBody)
        .when()
                .post(url + "/gen/clients/java")
        .then()
                .statusCode(200);
    }
}
