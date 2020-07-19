package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TC007_XMLRequest {

	@Test
	public void m1() {
		given()
			.pathParam("id", "15")
			.log().parameters()
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/{id}")
		.then()
			.body("CUSTOMER.ID", equalTo("15"))
			//.body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"))
			//.body(hasXPath("/CUSTOMER/ID[text()='15']"))
			//.body(hasXPath("/CUSTOMER/ID"), equalTo("15"))
			.log().all();
	}
}
