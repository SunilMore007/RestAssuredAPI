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

public class DeleteRequest_1 {

	
	@Test
	public void postMethod()
	{		
		RestAssured.given()
						.header("Authorization", "Bearer 8fa9756fd558e273d673eb686e038943eb5cb7ac6bd5d135db82007188625b06")
						.baseUri("https://gorest.co.in/public/v1/users/2045")
						.contentType(ContentType.JSON)
						
					
						.when()
								.delete()
						.then()
								.assertThat().statusCode(204)
								.log().all();
		
		
	}
}
