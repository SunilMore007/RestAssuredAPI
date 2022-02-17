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

public class pathParameterExample {

		
	@Test
	public void pathParameterEx() {

		//https://chercher.tech/rest-assured/path-query-params-static-rest-assured
			given()
			
			.pathParam("test","sample/api/product/read" )
			
			
			.when()
				.get("https://chercher.tech/{test}")
				.body().prettyPrint();
	

	}

}
