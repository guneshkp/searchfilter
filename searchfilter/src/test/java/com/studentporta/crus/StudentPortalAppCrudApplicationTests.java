package com.studentporta.crus;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studentporta.crus.entity.Filter;
import com.studentporta.crus.entity.FilterJobRequest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StudentPortalAppCrudApplicationTests {

	@Test
	void contextLoads() {
		
	}
	
//	@Test
//	public void searchTest1() throws JsonProcessingException {
//		FilterJobRequest filterJobReq = new FilterJobRequest();
//		filterJobReq.setStudentId("Manish");
//		Filter f = new Filter();
//		f.setCompanyName("Jabong2");
//		f.setExperience("5-6");
//		f.setLocation("Bangalore2");
//		f.setSkill("Mysql2");
//		f.setType("permanent");
//
//		filterJobReq.setFilter(f);
//		
////		Data dataObject = new Data(client);
//		//Object Mapper to serialize Java objects into JSON
//		ObjectMapper mapper = new ObjectMapper();
//		String categoryJson = mapper.writeValueAsString(filterJobReq);
//		
//	//	RestAssured.baseURI= "http://localhost:9090";
//		
//		
//        RequestSpecification request = RestAssured.given();
//        request.header("Content-Type", "application/json");
//
//        Response response =request.body(categoryJson).post("http://localhost:9090/jobs/search");
//        String jsonString = response.asString();
//        System.out.print(jsonString);
//	}
		
	
		@Test
		public void test_1() {
			
			RestAssured pis = (RestAssured) given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		}
		
		
//		@Test
//		public void searchTest2() throws JsonProcessingException {
//			FilterJobRequest filterJobReq = new FilterJobRequest();
//			filterJobReq.setStudentId("Manish");
//			Filter f = new Filter();
//			f.setCompanyName("Jabong2");
//			f.setExperience("5-6");
//			f.setLocation("Bangalore2");
//			f.setSkill("Mysql2");
//			f.setType("permanent");
//
//			filterJobReq.setFilter(f);
//			
////			Data dataObject = new Data(client);
//			//Object Mapper to serialize Java objects into JSON
//			ObjectMapper mapper = new ObjectMapper();
//			String categoryJson = mapper.writeValueAsString(filterJobReq);
//			
//			RestAssured.baseURI= "http://localhost:9090";
//			
//			
//	        RequestSpecification request = RestAssured.given();
//	        request.header("Content-Type", "application/json");
//
//	        Response response =request.body(categoryJson).post("/jobs/search");
//	        String jsonString = response.asString();
//	        System.out.print(jsonString);
//		}

}
