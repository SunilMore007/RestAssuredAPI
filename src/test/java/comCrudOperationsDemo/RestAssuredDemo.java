package comCrudOperationsDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredDemo {

	@Test
	public void test() {
		int code = RestAssured.given()
									.auth()
									.preemptive()
									.basic("ToolsQA", "TestPassword")
							  .when()
							  		.get("https://restapi.demoqa.com/authentication/CheckForAuthentication/")
							  		.getStatusCode();

		System.out.println("Status Code Is " + code);

	}

}
