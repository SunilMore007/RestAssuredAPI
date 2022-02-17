package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest_11 {

	@Test
	public void Test001() {

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

		Response resp = RestAssured.given().queryParam("pages", 2).when().get("/users/");

		
		
		JsonPath jpath = new JsonPath(resp.asString());

		int pagesNumber = jpath.getInt("data.size()");

		System.out.println(pagesNumber);

		String email = jpath.getString("data[0].email");

		System.out.println(email);

	}

}
