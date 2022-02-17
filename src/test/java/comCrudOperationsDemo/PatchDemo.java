package comCrudOperationsDemo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class PatchDemo {

	@Test
	public void test_Patch() {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", "Sunil");
		map.put("job", "leader");

		System.out.println(map);

		JSONObject req = new JSONObject(map);

		System.out.println(req);

		System.out.println(req.toJSONString());

				given()
					.body(req.toJSONString())

				.when()
					.patch("https://reqres.in/api/users/2")

				.then()
					.statusCode(200)
					.log().all();

	}

}
