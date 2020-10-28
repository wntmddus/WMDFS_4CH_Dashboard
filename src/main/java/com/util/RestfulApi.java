package main.java.com.util;

import io.restassured.RestAssured;
import org.json.JSONObject;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static main.java.com.util.SharedStorage.*;


public class RestfulApi {
    public static Response post(String path, JSONObject requestBody) {
        RestAssured.baseURI = BASE_URL;
        RestAssured.basePath = path;
        System.out.println(RestAssured.baseURI + RestAssured.basePath);
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation()
                .contentType(APPLICATION_JSON).header(AUTHORIZATION, "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==").header(ID, "ru2fn5h9n3").header(SECRET, "jvoaZabvuJAE2404ewgPnsvzX85NKfjd");
        request.body(requestBody.toString());
        Response response = request.post().then().log().all().extract().response();
        return response;
    }
}
