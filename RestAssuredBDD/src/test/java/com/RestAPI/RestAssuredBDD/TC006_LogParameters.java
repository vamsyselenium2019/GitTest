package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TC006_LogParameters {

	@Test
	public void params() {
		given()
			.pathParam("id", "1").pathParam("id", "2")
			.log().parameters()
		.when()
			.get("http://dummy.restapiexample.com/api/v1/employee/{id}")
		.then()
			.log().all();
	}
}
