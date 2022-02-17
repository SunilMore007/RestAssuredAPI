package TestDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class JsonPathDemo2 {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api";
	}

	@Test(enabled = true)
	public void postRequestExample() {

		Response resp = given().header("Content-Type", "Application/json").body("")

				.when().post()

				.then().extract().response();

	}
}