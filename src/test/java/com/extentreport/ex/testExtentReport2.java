package com.extentreport.ex;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class testExtentReport2 {

	@Test(priority = 1)
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

		ExtentReports exreport = new ExtentReports(
				"C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\sunil1.html");

		ExtentTest test = exreport.startTest("putrequest");
		test.log(LogStatus.PASS, "status code is : " + res.body().prettyPrint());

		System.out.println(res.body().asPrettyString());

		test.log(LogStatus.PASS, "status code is : " + res.statusCode());
		exreport.endTest(test);
		exreport.flush();
		exreport.close();

	}

	@Test(priority = 2)
	public void Postrequest() {

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

		Response res = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}")

				.when().post("/users")

				.then().statusCode(201)
				// .log()
				// .all();
				.extract().response();
		ExtentReports exreport = new ExtentReports(
				"C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\sunil1.html", false);

		ExtentTest test = exreport.startTest("Postrequest");
		test.log(LogStatus.PASS, "status code is : " + res.statusCode());
		
		System.out.println(res.asPrettyString());
		test.log(LogStatus.PASS, "response is " + res.asPrettyString());

		exreport.endTest(test);
		// exreport.endTest(test);
		exreport.flush();
		exreport.close();
	}

	@Test(priority = 3)
	public void deleteRequest() {

		// https://reqres.in/api/users/2

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";

		// Response res=

		given()

				.when().delete("/users/2")

				.then().statusCode(204).log().all();

		ExtentReports exreport = new ExtentReports(
				"C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\sunil1.html", false);

		ExtentTest test = exreport.startTest("deleteRequest");
		test.log(LogStatus.PASS, "status code is given");
		exreport.endTest(test);
		exreport.flush();
		exreport.close();
	}

}
