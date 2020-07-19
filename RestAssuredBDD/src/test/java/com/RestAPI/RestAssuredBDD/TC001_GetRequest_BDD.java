package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TC001_GetRequest_BDD {
	
	@Test
	public void getWeatherDeatils() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusCode(200)
			.body("City", equalTo("Hyderabad"))
			.header("Content-Type", "application/json");
	}

}
