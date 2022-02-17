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

public class postMethodExample {

	@Test(enabled = false)
	public void postMethod() {

		given()
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "\"id\": \"2405\",\r\n"
					+ "\"name\":\"Latest gadg1233et\",\r\n"
					+ "\"description\":\"New version is released\", \r\n"
					+ "\"price\": \"10\"\r\n"
					+ "\r\n"
					+ "}")
				.when()
				.post("https://chercher.tech/sample/api/product/update")
				.body()
				.prettyPrint();

	}	
	
	
	@Test
	public void test() {
		
		
		given()
		
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "\"id\": \"3789\",\r\n"
				+ "\"name\":\"Latest gadg1233et\",\r\n"
				+ "\"description\":\"New version is released\", \r\n"
				+ "\"price\": \"10\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.post("https://chercher.tech/sample/api/product/update")
		.prettyPrint();
	}

}
