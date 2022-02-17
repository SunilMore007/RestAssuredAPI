package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getMethodExample {

	@Test
	public void getMethod() {

		given()

				.when()
				.get("https://chercher.tech/sample/api/product/read")
				.body()
				.prettyPrint();

	}

}
