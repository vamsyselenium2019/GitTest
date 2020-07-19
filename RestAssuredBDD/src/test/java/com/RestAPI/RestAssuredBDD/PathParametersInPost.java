package com.RestAPI.RestAssuredBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PathParametersInPost {

	@Test
	public void m1() {
		JSONObject requestBoby=new JSONObject();
		requestBoby.put("name", "vamsikrishna");
		requestBoby.put("salary", "100000");
		requestBoby.put("age", "29");
		
		
		given()
			.pathParam("req", "create")
			.with()
				.body(requestBoby.toJSONString())
		.when()
			.post("http://dummy.restapiexample.com/api/v1/{req}")
		.then()
			.statusCode(200)
			.log().all();
	}
}
