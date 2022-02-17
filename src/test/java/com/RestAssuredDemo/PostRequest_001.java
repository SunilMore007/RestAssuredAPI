package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import org.json.simple.JSONObject;

import static org.hamcrest.Matchers.*;

import org.hamcrest.collection.HasItemInArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.config.ParamConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest_001 {

	
	@Test
	public void RegistrationSuccessful()
	{		
		RestAssured.baseURI ="https://restapi.demoqa.com/customer";
		
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "Virender"); 
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
	//	requestParams.put("Password", "password1");
	// 	requestParams.put("Email",  "sample2ee26d9@gmail.com");
	
		request.body(requestParams.toJSONString());
		Response response = request.post("/register");

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}
}
