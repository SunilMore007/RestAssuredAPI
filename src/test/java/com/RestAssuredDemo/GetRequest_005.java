package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import static org.hamcrest.Matchers.*;

import org.hamcrest.collection.HasItemInArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.config.ParamConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest_005 {

	@Test(priority = 1)
	public void validateStatusCode() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()

				.get("https://jsonplaceholder.typicode.com/posts/2")

				.then().statusCode(200);

	}

	@Test(priority = 2)
	public void verifyResponseLog() {

		// Given is used for prerequisites

		given()

				.when()

				.get("https://jsonplaceholder.typicode.com/posts/2")

				.then().statusCode(200).log().all();

	}

	@Test(priority = 3)
	public void verifySingleContentFromResponse() {

		// Given is used for prerequisites

		given()

				.when()

				.get("https://reqres.in/api/users?page=2")

				.then().statusCode(200).body("data[0].first_name", equalTo("Michael"));

	}
	
	@Test(priority = 4)
	public void verifyMultipleContentFromResponse() {

		// Given is used for prerequisites

		given()

				.when()

				.get("https://reqres.in/api/users?page=2")

				.then().statusCode(200).body("data.first_name", hasItems("Michael", "George", "Rachel"));

	}
	
	
	@Test(priority = 5)
	public void settingParametersAndParameters() {

		// Given is used for prerequisites

				given()
					.param("MyName","Sunil").header("Myheader","Indian")
				.when()
					.get("https://reqres.in/api/users?page=2")
				.then().	
					statusCode(200).log().all();
				

	}

}
