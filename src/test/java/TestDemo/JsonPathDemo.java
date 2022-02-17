package TestDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class JsonPathDemo 
{	
    @BeforeClass
    public void setup()
    {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "api";
    }
	
    @Test(enabled=true)
    public void postRequestExample()
    {
        String res = 
        given()
            .body("{" + 
                "    \"name\": \"Tarun\",\n" + 
                "    \"job\": \"Goswami\"\n" + 
                "}")
			  
        .when()
            .post("/users")
        .then()
            .statusCode(201)
            .extract().response().asString();
		
     
        JsonPath js = new JsonPath(res);
        String id = js.getString("id");
        System.out.println("id is:"+id);
        
        
    }
}