package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.*;
import org.hamcrest.collection.HasItemInArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.config.ParamConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest_3 {

	
	@Test
	public void postMethod()
	{		
		RestAssured.given()
						.header("Authorization", "Bearer 8fa9756fd558e273d673eb686e038943eb5cb7ac6bd5d135db82007188625b06")
						.baseUri("https://gorest.co.in/public/v1/users/3007")
						.contentType(ContentType.JSON)
						.body("{\r\n"
								+ "    \"gender\": \"Male\",\r\n"
								+ "    \"name\": \"Sagar Patil\",\r\n"
								+ "    \"email\": \"sayalikumari@wiz.com\",\r\n"
								+ "    \"status\": \"active\"\r\n"
								+ "}")
					
						.when()
								.put()
						.then()
								.assertThat().statusCode(200)
								.log().all();
		
		
	}
}
