package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValuesFromResponse2 {


	@Test
	public void extractFromResponse1() {

		String Endpoint = "https://chercher.tech/sample/api/product/read";

		Response resp = given()

				.when().get(Endpoint);

		/*
		 * System.out.println("Response as string");
		 * System.out.println(resp.asString());
		 * 
		 * System.out.println("-----Complete json as Pritty string---");
		 * System.out.println(resp.asPrettyString());
		 */

		JsonPath js = new JsonPath(resp.asString());

		String id = js.getString("id");
		System.out.println("id of 67 from response is:"+ js.getInt("records[67].id"));

		String name = js.getString("name");
		System.out.println("name of 67th record from response is "+ js.getString("records[67].name"));
	
		String description = js.getString("records[67].description");
		System.out.println("description of 67th record from response is "+ description);

		//String price = js.getString("name");
		System.out.println("price of 67th record from response is "+ js.getString("records[67].price"));
		
		//created
		System.out.println("created of 67th record from response is "+ js.getString("records[67].created"));
	}
	
	
}
