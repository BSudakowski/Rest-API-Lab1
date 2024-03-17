import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class Test_Lab2_GET_Response {

    @Test
    public void testGetRequest_response(){
            Response response = get("http://pesel.eu-central-1.elasticbeanstalk.com/api/v1/pesel/generate");
            Assert.assertEquals(response.statusCode(), 200);
                String expectedBody = "22052119776";
                String actualBody = response.getBody().asString();
        Assert.assertEquals(actualBody.length(), 10, "Odpowiedź nie zawiera 11 cyfr.");
        //Assert.assertEquals(actualBody, expectedBody);
        }
}
