package OauthDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Oauth2DemoWithDynamicToken2 {

	@Test
	public void generateTokenAndAccessValidAPI() {
		Response resp = RestAssured.given()
				.formParam("client_id", "LearnRestAssuredApp")
				.formParam("client_secret", "31253a5c5e180d2a3a506b05105e2b69")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		System.out.println("Token API Response Status code " + resp.getStatusCode());

		System.out.println("response is " + resp.asPrettyString());

		String token = resp.jsonPath().get("access_token");

		System.out.println("Token from response is " + token);

		Response response = RestAssured.given()
				.auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/2752/chickens-feed");

		System.out.println("code " + response.getStatusCode());

		System.out.println("code" + response.asPrettyString());

		Assert.assertEquals(response.getStatusCode(), 200);

	}
	

	@Test
	public void generateTokenAndAccessInValidAPI() {
		Response resp = RestAssured.given()
				.formParam("client_id", "LearnRestAssuredApp")
				.formParam("client_secret", "31253a5c5e180d2a3a506b05105e2b69")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		System.out.println("Token API Response Status code " + resp.getStatusCode());

//		System.out.println("response is " + resp.asPrettyString());

		String token = resp.jsonPath().get("access_token");

	//System.out.println("Token from response is " + token);

		Response response = RestAssured.given()
				.auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com//api/2572/toiletseat-down");

		System.out.println("code " + response.getStatusCode());

	//	System.out.println("code" + response.asPrettyString());

		Assert.assertEquals(response.getStatusCode(), 404);

	}

}
