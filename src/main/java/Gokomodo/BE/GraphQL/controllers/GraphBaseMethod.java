package Gokomodo.BE.GraphQL.controllers;

import Gokomodo.BE.Rest.controllers.RestBaseMethod;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import static org.hamcrest.Matchers.equalTo;

public class GraphBaseMethod extends RestBaseMethod {

    /**
     * GraphqlTOJson
     *
     * @param payload payload
     * @return jsonBody
     */
    public String graphqlToJson(String payload) {
        JSONObject json = new JSONObject();
        json.put("query", payload);
        return json.toString();
    }

    /**
     * Graph Response
     *
     * @param host      host
     * @param query     graph query
     * @param queryPath queryPath
     * @param validator validator
     */
    public void graphResponse(String host, Object query, String queryPath, String validator) {
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(query)
                .when()
                .post(host)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body(queryPath, equalTo(validator))
                .log()
                .body();
    }

}
