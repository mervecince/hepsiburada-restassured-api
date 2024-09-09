package org.hepsiburada.tests;

import io.restassured.response.Response;
import org.hepsiburada.httpMethods.Methods;
import org.hepsiburada.model.Gen;
import org.json.simple.JSONObject;

import org.junit.Assert;
import org.junit.Test;

public class Scenarios {

    /** TODO GEN CLIENTS **/

    @Test
    public void getGenLanguage(){

        String language = "java";

        Response response = Methods.setRequestGetWithUrl("gen/clients/"+language+"");

        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void addGenLanguage(){

        String language = "java";

        JSONObject dataModel = Gen.createJSONData("value1", "value2", "value3",
                "http://petstore.swagger.io/v2/swagger.json",
                "Bearer abc123", "apiKey",
                "Authorization", true,
                "oauth2", "OAuth2 authentication for the API");

        Response response = Methods.setRequestPostWithBody("gen/clients/"+language+"", dataModel);

        Assert.assertEquals(response.getStatusCode(),200);
    }
}
