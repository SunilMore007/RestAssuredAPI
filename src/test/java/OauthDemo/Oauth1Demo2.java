package OauthDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Oauth1Demo2 {
	
	String consumerKey = "s1lAvT5uU3fPLhzgI5m4cFBz8";
	String consumerSecret = "0QU8aC58Ypy0hJQIeqs4Y1PJwjWV2OffdthjJ55JZJvZaGccns";
	String accessToken = "1441253365-gAUOzD1QjLZg7CCKpKJ84j8HRuONiTSGi9r9mZn";
	String tokenSecret = "tM1y94Nx4rD9iQirOIL9xxuUlGOForSLK7xGzlpl4Oy2y";
	
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI = "https://api.twitter.com";
		RestAssured.basePath = "/1.1/statuses";
	}

    /*Post request example*/
	@Test(enabled=true)
	public void postExample()
	{
    given()
            .auth()
            .oauth(consumerKey, consumerSecret, accessToken, tokenSecret)
            .queryParam("status", "REST Assured Automation Tweet.")
            .header("Content-Type","application/json")
        .when()
            .post("/update.json")
        .then()
            .statusCode(401)
            .log().all();
    
        	
        
	}
}