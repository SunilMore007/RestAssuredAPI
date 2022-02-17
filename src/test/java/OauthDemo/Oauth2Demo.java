package OauthDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth2Demo {

	@Test
	public void test1()
	{
		Response resp= RestAssured.given()
					.auth()
					.oauth2("c6eaa390f397a78f537081dbc5a18913f70207eb")
					.post("http://coop.apps.symfonycasts.com/api/2752/chickens-feed");
		
		
		System.out.println("code "+ resp.getStatusCode());

		System.out.println("code"+resp.asPrettyString());
		
		
	}

}
