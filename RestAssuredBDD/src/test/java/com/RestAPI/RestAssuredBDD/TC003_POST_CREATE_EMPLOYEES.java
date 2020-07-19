package com.RestAPI.RestAssuredBDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class TC003_POST_CREATE_EMPLOYEES {
	
	@Test
	public void createEmployee() {
		HashMap<String, String> m=new HashMap<String, String>();
		
		m.put("name", "Krishna");
		m.put("salary", "1000000");
		m.put("age", "30");
		
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/create";
		Response response=	(Response) given()
			.contentType(ContentType.JSON)
			.body(m)
		.when()
			.post()
		.then()
			.statusCode(200)
			.assertThat().body("status", equalTo("success"))
			.statusLine("HTTP/1.1 200 OK")
			.log().all().extract();
		
		
		System.out.println(response.jsonPath().prettify());
	}
}
