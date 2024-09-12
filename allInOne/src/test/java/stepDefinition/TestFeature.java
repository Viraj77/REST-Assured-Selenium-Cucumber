package stepDefinition;

import PF.Guru99DemoLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utills.BrowserFactory;

import java.time.Duration;

public class TestFeature extends BrowserFactory {

    static String isItFriday(String today) {
        return null;
    }

    private String today, url;
    private Response dresponse;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = TestFeature.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        System.out.println("No its not");
    }
    @Given("api url")
    public void api_url() {
        url = "https://reqres.in/api/user/2";
    }

    @When("user sends request")
    public void user_sends_request() {
        dresponse = null;
        dresponse = (Response) RestAssured.given()
                .when()
                .get(url).getBody();
        System.out.println("Status received => " + dresponse.getStatusLine());
    }

    @Then("user name should be fetched from response")
    public void user_name_should_be_fetched_from_response() {
        System.out.println("Response=>" + dresponse.prettyPrint());
        JsonPath jsonPath = new JsonPath(dresponse.asString());
        //Extract the value of the "question" variable
        String question = jsonPath.getString("data.name");
        System.out.println("name is " +question);

    }

    @Given("user open demo guru99 login page with {string}")
    public void openBrowser(String url){
        System.out.println("-------------------------- URL IS : "+url);
        openBrowser();
        Guru99DemoLogin gdl = new Guru99DemoLogin(driver);
        driver.get(url);
        driver.findElement(By.id("email"));
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

        wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
        gdl.signIn("","");

    }


}

