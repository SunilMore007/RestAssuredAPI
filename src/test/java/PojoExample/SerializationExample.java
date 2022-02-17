package PojoExample;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializationExample {

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
		myList.add("shoe park");
		myList.add("shop");

		a.setTypes(myList);

		Location l = new Location();
		l.setLng(33.427362);
		l.setLat(-38.383494);
		a.setLocation(l);

		Response resp = given().queryParam("key", "qaclick123").body(a).when().post("/maps/api/place/add/json")

				.then()

				.assertThat().statusCode(200).extract().response();

		String response = resp.asString();

		System.out.println(response);

	}

}
