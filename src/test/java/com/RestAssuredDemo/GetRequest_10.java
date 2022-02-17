package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest_10 {

	@Test
	public void Test001() {

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

		Response res = given()
				.queryParam("page", 2)

				.when()
					.get("/users/");

		JsonPath js = new JsonPath(res.asString());
		
		
		int size = js.getInt("data.size()");
		System.out.println("size is: "+size);
		
		for(int i = 0; i < size; i++)
		{
			System.out.println(js.getString("data["+i+"].email"));			
		}
	}

}
