package Api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class APITest {
    @BeforeClass
    public void setUp(){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                                            .setBaseUri("https://api.coindesk.com")
                                            .setBasePath("/v1/bpi/currentprice.json")
                                            .setContentType(ContentType.JSON)
                                            .build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                                                .expectStatusCode(200)
                                                .build();
    }

    @Test
    public void verifyTest(){
      given()
                .get()
                .then()
               .statusCode(200)
               .body("bpi.USD", notNullValue())
               .body("bpi.GBP", notNullValue())
               .body("bpi.EUR", notNullValue())
               .body("bpi.GBP.description", equalTo("British Pound Sterling"));
    }
}
