package Gokomodo.BE.Rest.controllers;

import Gokomodo.FE.Logger.Log;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class RestBaseMethod {
    private JSONParser parser;
    private Reader reader;
    private JSONObject readJson;
    private Response response;
    private String writeJson;
    private JSONObject loginResponse;
    private JSONObject tokenData;
    private String accessToken;
    private String productID;

    /**
     * http request query JSON path
     *
     * @param path query JSON path
     * @return returns httpRequest
     */
    protected JsonPath httpGetPath(String path) {
        return RestAssured.given()
                .when()
                .get(path)
                .then()
                .assertThat()
                .statusCode(200)
                .assertThat()
                .extract().body().jsonPath();
    }

    /**
     * http request with parameter
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @return returns httpRequest
     */
    private RequestSpecification httpRequestPost(String JSONPath, String contentType) throws IOException, ParseException {
        readJson = readJSON(JSONPath);
        return RestAssured
                .given()
                .filter(new AllureRestAssured())
                .with()
                .contentType(contentType)
                .with()
                .body(readJson.toJSONString());
    }

    /**
     * http post request with parameter and bearer token
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @return returns httpRequest
     */
    private RequestSpecification httpRequestPost(String JSONPath, String contentType, String accessToken) throws IOException, ParseException {
        readJson = readJSON(JSONPath);
        return RestAssured
                .given()
                .header("Authorization", "Bearer " + accessToken)
                .filter(new AllureRestAssured())
                .with()
                .contentType(contentType)
                .with()
                .body(readJson.toJSONString());
    }

    /**
     * http request with parameter
     *
     * @return returns httpRequest
     */
    private RequestSpecification httpRequest() {
        return RestAssured
                .given()
                .filter(new AllureRestAssured())
                .with()
                .contentType(ContentType.JSON);
    }

    /**
     * http request with parameter and bearer token
     *
     * @param accessToken access token
     * @return returns httpRequest
     */
    private RequestSpecification httpRequest(String accessToken) {
        return RestAssured
                .given()
                .header("Authorization", "Bearer " + accessToken)
                .filter(new AllureRestAssured())
                .with()
                .contentType(ContentType.JSON);
    }


    /**
     * Set base uri
     *
     * @param baseURI baseUri
     */
    protected void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    /**
     * Set base path
     *
     * @param basePathTerm basepath
     */
    protected void setBasePath(String basePathTerm) {
        RestAssured.basePath = basePathTerm;
    }

    /**
     * reset base uri
     */
    protected void resetBaseURI() {
        RestAssured.baseURI = null;
    }

    /**
     * Reset base path
     */
    protected void resetBasePath() {
        RestAssured.basePath = null;
    }

    /**
     * http post
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected void httpPost(String JSONPath, String contentType, String path) throws IOException, ParseException {
        response = httpRequestPost(JSONPath,contentType).request(Method.POST, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: POST");
        Log.info("URI: " + gokomodoBaseURI + path);
        Log.info("Request body: " + readJSON(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http post with access token
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected void httpPost(String JSONPath, String contentType, String path,String accessToken) throws IOException, ParseException {
        response = httpRequestPost(JSONPath,contentType,accessToken).request(Method.POST, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: POST");
        Log.info("URI: " + gokomodoBaseURI + path);
        Log.info("Request body: " + readJSON(JSONPath).toJSONString());
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get
     *
     * @param path endpoint
     * @return response
     */
    protected void httpGet(String path) {
        response = httpRequest().request(Method.GET, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: GET");
        Log.info("URI: " + gokomodoBaseURI + path);
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get with access token
     *
     * @param path endpoint
     * @return response
     */
    protected void httpGet(String path, String accessToken) {
        response = httpRequest(accessToken).request(Method.GET, path);
        Log.info("REQUEST INFO");
        Log.info("Request type: GET");
        Log.info("URI: " + gokomodoBaseURI + path);
        Log.info("-----------------------------------------------");
        Log.info("RESPONSE INFO");
    }

    /**
     * http get with headers
     *
     * @param path    endpoint
     * @param headers headers
     * @return response
     */
    protected Response httpGet(String path, Header headers) {
        return httpRequest()
                .with()
                .header(headers)
                .request(Method.GET, path);
    }



    /**
     * http delete
     *
     * @param path endpoint
     * @return response
     */
    protected Response httpDelete(String path) {
        return httpRequest().request(Method.DELETE, path);
    }

    /**
     * http put
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected Response httpPut(String JSONPath, String contentType, String path) throws IOException, ParseException {
        return httpRequestPost(JSONPath,contentType).request(Method.PUT, path);
    }

    /**
     * http patch
     *
     * @param JSONPath body test data file location
     * @param contentType body content type
     * @param path   endpoint
     * @return response
     */
    protected Response httpPatch(String JSONPath, String contentType, String path) throws IOException, ParseException {
        return httpRequestPost(JSONPath,contentType).request(Method.PATCH, path);
    }

    /**
     * Get Status code
     *
     * @param expectedStatusCode expected status code response
     * @return status code
     */

    protected void assertStatusCode(int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(),expectedStatusCode);
        Log.info("Status code is: "+ response.getStatusCode());
    }

    /**
     * check response body
     *
     * @param stringContain expected string contained in body
     * @return status code
     */


    protected void assertBodyContain(String stringContain) {
        Log.info("Response body contains " + stringContain);
        Assert.assertTrue(response.getBody().asString().contains(stringContain),"fail");
    }
    /**
     * Get Content Type
     *
     * @param contentType response content type
     * @return contentType
     */
    protected void assertContentType(String contentType) {
        Assert.assertEquals(response.getContentType(), contentType);
        Log.info("Content type is: "+ response.getContentType());
    }

    /**
     * Get headers
     *
     * @param response response
     * @param header   header
     * @return header value
     */
    private String getHeaders(Response response, String header) {
        return response.getHeaders().getValue(header);
    }

    /**
     * Response Body
     *
     * @param response response
     * @return responseBody
     */
    private ResponseBody responseBody(Response response) {
        return response.getBody();
    }

    /**
     * Get Body
     *
     * @param response response
     * @return preety Print
     */
    protected String getBody(Response response) {
        return responseBody(response).prettyPrint();
    }

    /**
     * JsonPath evaluator
     *
     * @param response response
     * @return jsonPath
     */
    protected Object jsonPathEvaluator(Response response, String exp) {
        return response.jsonPath().get(exp);
    }

    /**
     * Read JSON file
     *
     * @param fileLocation JSON file location
     * @return jsonObject
     */
    protected JSONObject readJSON(String fileLocation) throws IOException, ParseException {
        parser = new JSONParser();
        reader = new FileReader(fileLocation);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        return jsonObject;
    }

    /**
     * Write JSON file
     *
     * @param fileLocation JSON file location
     * @return jsonObject
     */

    protected void writeResponseBody(String fileLocation){
        writeJson = response.getBody().prettyPrint();
        try(FileWriter file = new FileWriter(fileLocation)){
            file.write(writeJson);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Get access token from file
     *
     * @return access token string
     */

    protected String getAccessToken() throws IOException, ParseException {
        loginResponse = readJSON(tokenFileLocation);
        tokenData = (JSONObject) loginResponse.get("Data");
        return accessToken = tokenData.get("AccessToken").toString();
    }


    /**
     * Get product ID from file
     *
     * @param IDLocation file location of the ID
     * @return product ID string
     */

    protected String getID(String IDLocation) throws IOException, ParseException {
        loginResponse = readJSON(IDLocation);
        productID = loginResponse.get("Data").toString();
        Log.info("Product ID: " + productID);
        return productID;
    }
}
