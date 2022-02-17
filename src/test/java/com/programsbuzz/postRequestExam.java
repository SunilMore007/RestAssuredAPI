package com.programsbuzz;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class postRequestExam {

	@Test
	public void Postrequest() {

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

	Response res=	given()
					.header("Content-Type", "application/json")
					.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}")

				.when()
					.post("/users")

				.then()
					.statusCode(201)
			//		.log()
			//		.all();
					.extract().response();
		
		
		System.out.println(res.asPrettyString());
		
	}

}
