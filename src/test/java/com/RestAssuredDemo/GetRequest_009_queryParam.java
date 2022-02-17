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
import io.restassured.specification.RequestSpecification;

public class GetRequest_009_queryParam {

	@Test
	public void queryParameter() {

		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";

		RequestSpecification request = RestAssured.given();

		Response response = request.queryParam("q", "London,UK").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
				.get("/weather");

		String jsonString = response.asString();

		System.out.println(response.getStatusCode());

		Assert.assertEquals(jsonString.contains("London"), true);

	}

	@Test
	public void queryParameter1() {

				given()
					.queryParam("q1", "London,UK")
					.queryParam("appid1", "2b1fd2d7f77ccf1b7de9b441571b39b8")

				.when()
					.get("https://samples.openweathermap.org/data/2.5/weather")

				.then()
					.statusCode(200);

	}

}
