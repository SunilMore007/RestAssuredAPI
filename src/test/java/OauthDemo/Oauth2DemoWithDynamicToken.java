package OauthDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Oauth2DemoWithDynamicToken {

	@Test
	public void generateToken()
	{
		Response resp=RestAssured.given()
					.formParam("client_id", "LearnRestAssuredApp")
					.formParam("client_secret", "31253a5c5e180d2a3a506b05105e2b69")
					.formParam("grant_type", "client_credentials")
					.post("http://coop.apps.symfonycasts.com/token");
						
		System.out.println(resp.getStatusCode());
		
		System.out.println("response is "+resp.asPrettyString());
		
		String token = resp.jsonPath().get("access_token");
	
		System.out.println(token);
	
	}

}
