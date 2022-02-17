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

public class putMethodExample2 {

	@Test
	public void getMethod() {

		given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "\"name\":\"Sunil More\",\r\n"
				+ "\"description\":\"New version is released\", \r\n"
				+ "\"price\": \"10\"\r\n"
				+ "\r\n"
				+ "}")

				.when()
				.put("https://chercher.tech/sample/api/product/create")
				.body()
				.prettyPrint();

	}

	
	
}
