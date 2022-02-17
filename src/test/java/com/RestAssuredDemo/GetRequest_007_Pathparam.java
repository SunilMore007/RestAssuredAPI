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

public class GetRequest_007_Pathparam {

	@Test
	public void test_Md5CheckSumForTest_ShouldBe098f6bcd4621d373cade4e832627b4f6() {
	    
	    String originalText = "test";
	    String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
	        
	    given().
	        param("text",originalText).
	    when().
	        get("http://md5.jsontest.com").
	    then().
	        assertThat().
	        body("md5",equalTo(expectedMd5CheckSum));
	}


	
	@Test
	public void test_NumberOfCircuits_ShouldBe20_Parameterized() {
	        
	    String season = "2017";
	    
	    int numberOfRaces = 20;
	        
	    given().
	        pathParam("raceSeason",season).
	    when().
	        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
	    //https://ergast.com/api/f1/season/circuits.json
	}
	
	@Test (priority = -1)
	public void queryParameterExample() {

		
		
		given()
		.queryParam("q1", "London,UK")
		.queryParam("appid1", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		
		
		.when()
		.get("https://samples.openweathermap.org/data/2.5/weather")
		
		
		.then()
		.statusCode(200).log().all();
	}
}
