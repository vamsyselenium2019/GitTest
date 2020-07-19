package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class TC002_GET_Req_Employees {
	
	@Test
	public void getEmployeesDetails() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		given()
		.when()
			.get()
		.then()
			.header("Content-Type", "application/json")
			.assertThat().body("data[0].id", is("1"));
//			.header("Content-Type", "application/json");
		
	}

}
