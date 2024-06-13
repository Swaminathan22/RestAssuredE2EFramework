package RestAssuredE2E.RestAssuredFramework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateBooking {

	@Test
	public void updateBooking()
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1157")
			.body("{\r\n"
					+ "    \"firstname\" : \"Swami\",\r\n"
					+ "    \"lastname\" : \"Nathan\",\r\n"
					+ "    \"totalprice\" : 222,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2020-01-01\",\r\n"
					+ "        \"checkout\" : \"2021-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when()
			.put()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		
	}
}
