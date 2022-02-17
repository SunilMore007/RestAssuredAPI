package com.RestAssuredDemo;

import org.hamcrest.core.Is;
import static org.hamcrest.Matchers.*;

import org.hamcrest.collection.HasItemInArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.config.ParamConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest_008_Authonitication{

	@Test
	public void test_APIWithBasicAuthentication_ShouldBeGivenAccess() {
	        
	    given().
	        auth().
	        preemptive().
	        basic("username", "password").
	    when().
	        get("http://path.to/basic/secured/api").
	    then().
	        assertThat().
	        statusCode(200);
	}
	
	
	@Test
	public void test_APIWithOAuth2Authentication_ShouldBeGivenAccess() {
	        
	    given().
	        auth().
	        oauth2("").
	    when().
	        get("http://path.to/oath2/secured/api").
	    then().
	        assertThat().
	        statusCode(200);
	}
	
	@Test
	public void test_ScenarioRetrieveFirstCircuitFor2017SeasonAndGetCountry_ShouldBeAustralia() {
	        
	    // First, retrieve the circuit ID for the first circuit of the 2017 season
	    String circuitId = given().
	    when().
	        get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	        extract().
	        path("MRData.CircuitTable.Circuits.circuitId[0]");
	        
	   
	    // Then, retrieve the information known for that circuit and verify it is located in Australia
	    given().
	        pathParam("circuitId",circuitId).
	    when().
	        get("http://ergast.com/api/f1/circuits/{circuitId}.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.Location[0].country",equalTo("Australia"));
	}
}
