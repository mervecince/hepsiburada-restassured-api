package org.hepsiburada.model;

import org.json.simple.JSONObject;

public class Gen {

    /*

    {
      "spec": {},
      "options": {
        "additionalProp1": "string",
        "additionalProp2": "string",
        "additionalProp3": "string"
      },
      "swaggerUrl": "http://petstore.swagger.io/v2/swagger.json",
      "authorizationValue": {
        "value": "string",
        "type": "string",
        "keyName": "string",
        "urlMatcher": {}
      },
      "usingFlattenSpec": true,
      "securityDefinition": {
        "type": "string",
        "description": "string"
      }
    }

     */

    public static JSONObject createJSONData(Object additionalProp1, Object additionalProp2,
                                            Object additionalProp3, Object swaggerUrl,
                                            Object authValue, Object authType, Object authKeyName,
                                            Object usingFlattenSpec, Object securityDefType,
                                            Object securityDefDescription){

        JSONObject requestParams = new JSONObject();

        JSONObject spec = new JSONObject();

        requestParams.put("spec", spec);

        JSONObject options = new JSONObject();

        options.put("additionalProp1", additionalProp1);
        options.put("additionalProp2", additionalProp2);
        options.put("additionalProp3", additionalProp3);

        requestParams.put("options", options);

        requestParams.put("swaggerUrl", swaggerUrl);

        JSONObject authorizationValue = new JSONObject();

        authorizationValue.put("value", authValue);
        authorizationValue.put("type", authType);
        authorizationValue.put("keyName", authKeyName);

        JSONObject authUrlMatcher = new JSONObject();

        authorizationValue.put("urlMatcher", authUrlMatcher);

        requestParams.put("authorizationValue", authorizationValue);

        requestParams.put("usingFlattenSpec", usingFlattenSpec);

        JSONObject securityDefinition = new JSONObject();

        securityDefinition.put("type", securityDefType);
        securityDefinition.put("description", securityDefDescription);

        requestParams.put("securityDefinition", securityDefinition);

        return requestParams;
    }

}
