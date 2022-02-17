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

public class deleteMethodExample2 {

	public class FirstPostTest {
		@Test
		void test() {
			RestAssured.given()
			.when()
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "\"id\": 2407\r\n"
					+ "}")

			.delete("https://chercher.tech/sample/api/product/delete")
			.prettyPrint();
		}
	}

}
