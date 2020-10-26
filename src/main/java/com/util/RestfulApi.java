package main.java.com.util;

import io.restassured.RestAssured;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class RestfulApi {
    public static Response post(String path, JSONObject requestBody) {
        RestAssured.baseURI = "https://ddms-api.samsunghrm.com/v2/ddms/service/";
        RestAssured.basePath = path;
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation()
                .contentType("application/json").header("Authorization", "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==").header("id", "ru2fn5h9n3").header("secret", "jvoaZabvuJAE2404ewgPnsvzX85NKfjd");
        request.body(requestBody.toString());
        Response response = request.post().then().log().all().extract().response();
        return response;
    }
}
