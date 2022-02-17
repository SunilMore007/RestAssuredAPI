package OauthDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth1Demo {

	@Test
	public void postTweet()
	{
		Response resp= RestAssured.given()
		.auth()
		// consumerKey, consumerSecret,accessToken , secretToken 
		.oauth("8r3g7imVqNpMUf1v9QiqICf3o",
				"eYTN0hq6QbVF6y6rcKHCRwZ3gEHsClzqKcxAZI2bAG6oWTPb3r", 
				"1488527795978395662-1mNkLuX9OWzE0N1mvtJVYrq1n8HBQC",
				"tMsXFP8Z2d7HvfH6D3osrZJjHYEOst1o8elQZ23GVO3jK")
		
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is amy status via rest assured API");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asPrettyString());
		
	}

}
