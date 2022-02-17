package PojoExample;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SerializationExample2 {

	@Test
	public void testSerialization() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		AddPlace a = new AddPlace();
		a.setAccuracy(50);
		a.setAddress("29, side layout, cohen 09\r\n" + "");
		a.setLanguage("hindi");
		a.setName("Sunil House");
		a.setPhone_number("1234567890");
		a.setWebsite("http://google.com\r\n" + "");

		List<String> myList = new ArrayList<String>();
		myList.add("shoe park\r\n" + "");
		myList.add("shop");

		a.setTypes(myList);

		Location l = new Location();
		l.setLng(33.427362);
		l.setLat(-38.383494);
		a.setLocation(l);	
				
		
		RequestSpecification reqSpec=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").build();
		RequestSpecification resp = given().spec(reqSpec).body(a);
		
		
		ResponseSpecification respSpec =	new ResponseSpecBuilder().expectStatusCode(200).build();
		
		Response response =	resp.when().post("/maps/api/place/add/json")
				
				.then()

				.spec(respSpec).extract().response();

	
		
		String response1 = response.asString();

		System.out.println(response1); 

	}

}
