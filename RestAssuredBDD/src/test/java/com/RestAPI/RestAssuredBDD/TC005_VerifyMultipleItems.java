package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TC005_VerifyMultipleItems {
	
	@Test
	public void m1() {
		//RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		given()
		.when()
			.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.body("data.employee_name", hasItems("Tiger Nixon","Garrett Winters","Ashton Cox"))
		.log().all();
	}
	
}
