package com.RestAPI.RestAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Tc004_DeleteEmployeeID {

	@Test
	public void m1() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/1";
		Response response=given()
		.when()
			.delete()
		.then()
		.and()
			.statusCode(200)
			.extract().response();
		System.out.println(response.getContentType());
		System.out.println(response.jsonPath().prettyPrint());
		
	}
}
