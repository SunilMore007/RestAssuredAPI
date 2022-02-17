package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.hamcrest.collection.HasItemInArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.config.ParamConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest_3withMap {

	@Test
	public void postMethod() {

		HashMap<String, String> Databody = new HashMap<String, String>();

		Databody.put("gender", "Female");
		Databody.put("name", "Srushti Patil");
		Databody.put("email", "srushti@gmail.com");
		Databody.put("status", "active");

		RestAssured.given()
				.header("Authorization", "Bearer 8fa9756fd558e273d673eb686e038943eb5cb7ac6bd5d135db82007188625b06")
				.baseUri("https://gorest.co.in/public/v1/users")
				.contentType(ContentType.JSON)
				.body(Databody)

				.when()
					.post()

				.then()
					.assertThat()
					.statusCode(201)
					.log().all();

	}
}
