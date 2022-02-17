package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValuesFromResponse6 {

	@Test
	public void extractFromResponse6() {

		String Endpoint = "https://jsonplaceholder.typicode.com/users";

		Response resp = 
				given()
					.headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
					
				.when()
					.get(Endpoint)
				.then()
					.contentType(ContentType.JSON)
					.extract()
					.response();

		JsonPath js = new JsonPath(resp.asString());

		//Map<String, String> company = js.getMap("company");
		//System.out.println(company);
		 
		List<Map<String, String>> companies = js.getList("company");
		System.out.println(companies.get(0).get("name"));
		 
		 /*
		 * String usernames = js.getString("username");
		 * System.out.println("All the usernames from the response "+usernames);
		 * 
		 * String usernameFirst = js.getString("username[0]");
		 * System.out.println("FIrst User name is "+usernameFirst);
		 * 
		 * List<String> jsonResponse = js.getList("username");
		 * System.out.println(jsonResponse.get(0));
		 */
		
	
	}

}
