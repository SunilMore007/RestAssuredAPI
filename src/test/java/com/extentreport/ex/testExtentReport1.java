package com.extentreport.ex;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class testExtentReport1 {

	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";
	}

	@Test(enabled = true)
	public void postRequestExample() {
		String res = given().body("{" + "    \"name\": \"Tarun\",\n" + "    \"job\": \"Goswami\"\n" + "}")

				.when().post("/users").then().statusCode(201).extract().response().asString();

		JsonPath js = new JsonPath(res);
		String id = js.getString("id");
		System.out.println("id is:" + id);
		
		ExtentReports er = new ExtentReports("C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\sunil.html");
		ExtentTest test = er.startTest("postRequestExample");

		test.log(LogStatus.FAIL, "response id is " +id);
		er.endTest(test);
		er.flush();
		er.close();
		
		
	}

}
