package com.programsbuzz;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class putExample {

	public void putrequest() {
		// https://reqres.in/api/users/2
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RestAssured.basePath = "api";

		Response res =

				given()

						.header("ContentType", "application/json")
						.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}")

						.when().put("/users/2")

						.then().statusCode(200).extract().response();

		System.out.println(res.body().prettyPrint());
		System.out.println(res.body().asPrettyString());

	}
}
