package com.practice7feb2022;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class test {

	@Test
	public void test1() {

		RestAssured.baseURI="";
		RestAssured.basePath="";
		
		
		Response response =	given()

					.header("", "")
					.param("", "")
					.body("")

				.when()
					.get()
				.then()
					.assertThat()
					.statusCode(200)
					.extract()
					.response();

	}
}
