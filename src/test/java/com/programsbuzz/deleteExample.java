package com.programsbuzz;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class deleteExample {

	@Test
	public void deleteRequest() {

		// https://reqres.in/api/users/2

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";
	
		//Response res=
		
		given()

				.when()
					.delete("/users/2")

				.then()
					.statusCode(204)
					.log()
					.all();

	}

}
