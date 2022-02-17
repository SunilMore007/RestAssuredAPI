package comCrudOperationsDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class CreateDemo {

	@Test
	public void test1() {
		given().
			get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data[1].id", equalTo(8))
			.body("data.first_name",hasItems("Tobias","Lindsay"))
			.body("data[5].first_name", equalTo("Rachel"))
			.log()
			.all();

	}

}
