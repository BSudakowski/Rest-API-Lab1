import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;

public class Test_Lab1_GET_StatusCode {

    @Test
    public void testGetRequest_ResponseStatusCodeOk(){
        Response response = get("http://pesel.eu-central-1.elasticbeanstalk.com/api/v1/pesel/generate");
        Assert.assertEquals(response.statusCode(), 200, "Ryju coś jest nie tak");
    }

    @Test
    public void testGetRequest_response(){
        Response response = get("http://pesel.eu-central-1.elasticbeanstalk.com/api/v1/pesel/generate");
        //String expectedBody = "22052119776";
        String actualBody = response.getBody().asString();
        Assert.assertEquals(actualBody.length(), 11, "Odpowiedź nie zawiera 11 cyfr.");
        //Assert.assertEquals(actualBody, expectedBody);
    }

    public class Lab3_Test_POST_StatusCode {
        @Test
        public void testPostRequest_responseStatusCode(){
            Response response = post("http://pesel.eucentral-1.elasticbeanstalk.com/api/v1/citizens");
            Assert.assertEquals(response.statusCode(), 201, "Ryju coś jest nie tak");
        }

    }
