package apiTestPractice;

import groovy.transform.ASTTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BasicAPITest {

    @Test
    public void GetMethods() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, RestAssured.baseURI);
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());


        Response dresponse = null;
        dresponse = (Response) RestAssured.given()
                .when()
                .get("https://reqres.in/api/user/2").getBody();
        System.out.println("Status received => " + dresponse.getStatusLine());
        System.out.println("Response=>" + dresponse.prettyPrint());
        JsonPath jsonPath = new JsonPath(dresponse.asString());
    //Extract the value of the "question" variable
        String question = jsonPath.getString("data.name");
        System.out.println("name is " +question);
    }
}
