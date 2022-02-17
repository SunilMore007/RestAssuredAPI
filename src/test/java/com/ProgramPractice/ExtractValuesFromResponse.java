package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValuesFromResponse {

	@Test(enabled = false)
	public void extractFromResponse() {

		String Endpoint = "https://chercher.tech/sample/api/product/read?id=3793";

		Response resp = given()

				.when().get(Endpoint);

//		.then()  .statusCode(201) .extract().response().asString();

		System.out.println("Response as string");
		System.out.println(resp.asString());

		System.out.println("-----Complete json as Pritty string---");
		System.out.println(resp.asPrettyString());

		JsonPath js = new JsonPath(resp.asString());
		String id = js.getString("id");
		System.out.println("id is:" + id);

	}

	@Test
	public void extractFromResponse1() {

		String Endpoint = "https://chercher.tech/sample/api/product/read?id=3793";

		Response resp = given()

				.when().get(Endpoint);

		System.out.println("Response as string");
		System.out.println(resp.asString());

		System.out.println("-----Complete json as Pritty string---");
		System.out.println(resp.asPrettyString());

		JsonPath js = new JsonPath(resp.asString());

		String id = js.getString("id");
		System.out.println("id from response is:" + id);

		String name = js.getString("name");
		System.out.println("name from response is "+name);
	
		String description = js.getString("description");
		System.out.println("description from response is "+description);
		
		String price = js.getString("price");
		System.out.println("price from response is "+price);
		
		
	
	
	}
	
	
}
