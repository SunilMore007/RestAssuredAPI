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
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest_002_BearerTokenAuthentication {

	@Test
	public void BearerTokenAuthentication() {
		RestAssured.baseURI = "https://bookstore.demoqa.com";

		RequestSpecification request = RestAssured.given();

		String payload = "{\r\n" + "\"userName\": \"	\",\r\n" + "\"password\": \"Test@@123\"\r\n" + "}";

		request.header("Content-Type", "application/json");

		Response res = request.body(payload).post("/Account/v1/GenerateToken");

		res.prettyPrint();

		String jsonString = res.getBody().asString();

		String token = JsonPath.from(jsonString).get("token");
		System.out.println(token);

		request.header("Authorization", "Bearer" + token).header("Content-Type", "application/json");

		String addBookDetails = "";

		Response addBookResponse = request.body(addBookDetails).post("/BookStore/v1/Books");
		
		addBookResponse.prettyPrint();
		
		Assert.assertEquals(201, addBookResponse.getStatusCode());

	}
}
