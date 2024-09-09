package org.hepsiburada.httpMethods;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hepsiburada.utilities.Configuration;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Methods {

    public static Response setRequestPostWithBody(String postUrl, JSONObject body) {

        baseURI = Configuration.getInstance().getProperty("BaseUrl");

        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body.toJSONString())
                .post(postUrl);

        return response;
    }

    public static Response setRequestGetWithUrl(String postUrl) {

        Response response = null;
        baseURI = Configuration.getInstance().getProperty("BaseUrl");

        response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get(postUrl);

        return response;
    }
}
