package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class queryParameterExample2 {

		
	@Test
	public void queryParameterEx() {
		
		given()
		.queryParam("id", "2028")
		
		.when()
			.get("https://chercher.tech/sample/api/product/read")
			.prettyPrint();
			
	}
	
	
	@Test
	public void queryParameterEx1() {
		
		given()
		.queryParam("id", "6280")
		.queryParam("name", "chercher1")
		
		.when()
			.get("https://chercher.tech/sample/api/product/read")
			.prettyPrint();
			
	}

	@Test
	public void queryParameterEx2() {
		
		given()
		.queryParams("id", "6280", "name", "chercher1")
		
		.when()
			.get("https://chercher.tech/sample/api/product/read")
			.prettyPrint();
			
	}
	

	@Test
	public void queryParameterEx3() {
		
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("id", "6279");
		map.put("name", "abcd");
		
		
		given()
		.queryParams(map)
		
		.when()
			.get("https://chercher.tech/sample/api/product/read")
			.prettyPrint();
			
	}
	
	
}
