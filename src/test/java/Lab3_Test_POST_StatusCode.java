import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.post;


public class Lab3_Test_POST_StatusCode {
    @Test
    public void testPostRequest_responseStatusCode(){
        Response response = post("http://pesel.eucentral-1.elasticbeanstalk.com/api/v1/citizens");
        Assert.assertEquals(response.statusCode(), 201, "Ryju coś jest nie tak");
    }
}
