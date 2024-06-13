package RestAssuredE2E.RestAssuredFramework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class GetMultipleBookingId 
{
    @Test
    public void getMultipleBookingId()
    {
       
    	RestAssured
    	.given()
	    	.log()
	    	.all()
	    	.baseUri("https://restful-booker.herokuapp.com/")
	    	.basePath("booking")
    	.when()
    		.get()
    	.then()
    		.log()
    		.all()
	    	.assertThat()
	    	.statusCode(200);
    }
}
