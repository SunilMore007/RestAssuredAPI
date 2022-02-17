package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest_12 {

	public static String id = "2";

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";
	}

	@Test(enabled=false)
	public void ArraySizeAndElemenets() {

		Response resp = RestAssured.given().queryParam("pages", 2).when().get("/users/");

		JsonPath jpath = new JsonPath(resp.asString());

		int pagesNumber = jpath.getInt("data.size()");

		System.out.println(pagesNumber);

		String email = jpath.getString("data[0].email");

		System.out.println(email);

	}

	@Test(enabled=false)
	public void IterateJSONArray() {

		Response resp = RestAssured.given().queryParam("pages", id).when().get("/users/");

		JsonPath jpath = new JsonPath(resp.asString());

		int size = jpath.getInt("data.size()");

		System.out.println(size);

		String email = jpath.getString("data[0].email");

		System.out.println(email);

		for (int i = 0; i < size; i++)

		{
			System.out.println(jpath.getString("data[" + i + "].email"));

		}
	}

	@Test(enabled=true)
	public void ConditionalLogic() {
		Response res = given().queryParam("page", "2").when().get("/users/");

		JsonPath js = new JsonPath(res.asString());

		int size = js.getInt("data.size()");
		String email = "george.edwards@reqres.in";
		String temp = "";

		for (int i = 0; i < size; i++) {
			temp = js.getString("data[" + i + "].email");
			if (temp.equals(email)) {
				System.out.println(js.getString("data[" + i + "]"));
				break;
			}
		}

	}

}
