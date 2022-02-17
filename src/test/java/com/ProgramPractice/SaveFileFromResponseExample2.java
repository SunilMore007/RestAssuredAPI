package com.ProgramPractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SaveFileFromResponseExample2 {

	public static long getFileSize() {
		File baseFile = new File("C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\minion.zip");
		return baseFile.length();
	}
	
	
	
	@Test
	public void getFileCompare() {

		String Endpoint = "https://chercher.tech/files/minion.zip";

	byte dowloadedFile[] 	= RestAssured.given()
			
					.when()
						.get(Endpoint)
					.then()
						.extract().asByteArray();
		
	
	System.out.println("Actual file size = "+ getFileSize());
	System.out.println("dowloadedFile size ="+ dowloadedFile.length);
	
	assertEquals(getFileSize(), dowloadedFile.length);
	
	
	try {
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\files\\minion1.zip"));
		fos.write(dowloadedFile);
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	
	
	}

}
