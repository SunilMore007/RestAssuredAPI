package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValuesFromResponse5 {

	@Test
	public void extractFromResponse5() {

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
		
		
		/*
		 * //Creating arraylist ArrayList<Object> list=new ArrayList<Object>();
		 * list.add(js.getList("$"));
		 * 
		 * System.out.println(list);
		 */
		
		String usernames = js.getString("username");
		System.out.println("All the usernames from the response "+usernames);
		
		String usernameFirst = js.getString("username[0]");
		System.out.println("FIrst User name is "+usernameFirst);
		
		List<String> jsonResponse = js.getList("username");
		System.out.println(jsonResponse.get(0));
		
		/*
		 * String firstArrayItem = js.getString("[1]");
		 * 
		 * System.out.println("-----firstArrayItem---");
		 * System.out.println(firstArrayItem);
		 */
	}

}
