package main.java.com.util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class RestfulApi {
    public static Response post(String path, String requestBody) {
        RestAssured.baseURI = "https://ddms-api.samsunghrm.com/v2/ddms/service/";
        // Post Init request
        Response response = null;
        try {
            response = given()
                    .when().contentType(ContentType.JSON).accept(ContentType.JSON).header("Authorization", "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==").header("id", "ru2fn5h9n3").header("secret", "jvoaZabvuJAE2404ewgPnsvzX85NKfjd").body(requestBody).post(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
