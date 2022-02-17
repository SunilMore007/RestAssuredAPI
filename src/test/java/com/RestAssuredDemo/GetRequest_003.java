package com.RestAssuredDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest_003 {

	@Test
	public void Test001() {
		System.out.println("Test001");

		Response res = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(res.getStatusCode());
	//	System.out.println(res.getBody());
	//	System.out.println(res.asString());
		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("content-Type"));
		System.out.println(res.getTime());
	//	System.out.println(res.getSessionId());

		int statusCode = res.getStatusCode();
		// Assert.assertEquals(statusCode, 200);
	//	res.prettyPrint();
		System.out.println(given().get("https://reqres.in/api/users?page=2").then().extract().path("page"));

		System.out.println(given().get("https://reqres.in/api/users?page=2").then().extract().path("data[1]","email"));
		
		//System.out.println(given().get("https://reqres.in/api/users?page=2").then().extract().path(DEFAULT_BODY_ROOT_PATH, null)


	}

}
