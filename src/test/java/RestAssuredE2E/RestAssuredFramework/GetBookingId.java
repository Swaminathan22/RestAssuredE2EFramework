package RestAssuredE2E.RestAssuredFramework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class GetBookingId 
{
    @Test
    public void getBookingId()
    {
       
    	RestAssured
    	.given()
	    	.log()
	    	.all()
	    	.baseUri("https://restful-booker.herokuapp.com/")
	    	.basePath("booking/1157")
    	.when()
    		.get()
    	.then()
    		.log()
    		.all()
		  .assertThat()
		  .statusCode(200);
		 
    }
}
