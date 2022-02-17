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

public class GetRequest_006 {

	@Test(priority = 1)
	public void testSingleContentFromXMLResponse() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()
					.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/11")

				.then()
					.statusCode(200)
					.body("CUSTOMER.ID", equalTo("11"))
					.log().all();

	}

	@Test(priority = 2)
	public void testMultipleContentFromXMLResponse() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()
					.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/11")

				.then()
					.statusCode(200)
					.body("CUSTOMER.ID", equalTo("11"))
					.body("CUSTOMER.FIRSTNAME", equalTo("Julia"))
					.body("CUSTOMER.LASTNAME", equalTo("White"))
					.body("CUSTOMER.STREET", equalTo("412 Upland Pl."))
					.body("CUSTOMER.CITY", equalTo("Chicago"));

	}

	@Test(priority = 3)
	public void testMultipleContentFromXMLResponseInOneGo() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()
					.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/11/")

				.then()
					.statusCode(200)
					.body("CUSTOMER.text()", equalTo("11JuliaWhite412 Upland Pl.Chicago"));

	}

	@Test(priority = 4)
	public void testUsingXMLPath() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()
					.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/11/")

				.then()
					.statusCode(200)
					.body(hasXPath("/CUSTOMER/FIRSTNAME"), containsString("Julia"));

	}

	@Test(priority = 5)
	public void testUsingXMLPath1() {

		// Given is used for prerequisites to pass parameters

		given()

				.when()
					.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/")

				.then()
					.statusCode(200)
					.body(hasXPath("/CUSTOMERList/CUSTOMER[text()='20']"))
					.log().all();

	}

}
