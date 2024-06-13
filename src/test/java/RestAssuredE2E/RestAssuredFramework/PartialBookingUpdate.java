package RestAssuredE2E.RestAssuredFramework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialBookingUpdate {

	@Test
	public void partialBookingUpdate()
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1157")
			.body("{\r\n"
					+ "    \"firstname\" : \"Swami\",\r\n"
					+ "    \"lastname\" : \"Ashwin\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when()
			.patch()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
	}
}
