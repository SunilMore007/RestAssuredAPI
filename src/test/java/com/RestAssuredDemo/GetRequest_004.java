package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest_004 {

	@Test
	public void Test001() {
		System.out.println("Test001");

		RestAssured.get("https://reqres.in/api/users?page=2").then().assertThat().body("page", Is.is(2)).log().all();

	}

	@Test
	public void Test002() {
		System.out.println("Test002");

		RestAssured.get("https://reqres.in/api/users?page=2").then().assertThat().body("data.id[0]", Is.is(8)).log()
				.all();

	}

	@Test
	public void Test003() {
		System.out.println("Test003");

		RestAssured.get("https://reqres.in/api/users?page=2").then().assertThat()
				.body("data.email[2]", Is.is("t1obias.funke@reqres.in")).log().all();

	}

}
