package Interview;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		curl -v -X GET 'https://vzapi.free.beeceptor.com/mqtt/cas/sensors' -H 'Content-Type: application/json'
		
		
		Response resp=	RestAssured.given()
			.header("ContentType", "application/json")
			
			.when()
			.get("https://vzapi.free.beeceptor.com/mqtt/cas/sensors")
			
			
			.then()
			.assertThat().statusCode(200)
			.extract().response();
		
		
		
		System.out.println(resp.asPrettyString());
		
		JsonPath js=new JsonPath(resp.asString());
		
	System.out.println(js.get("sensor.characteristics.currentValue.trackerID"));
		
		
		
	}

}
