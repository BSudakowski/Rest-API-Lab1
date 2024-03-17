import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Lab3_Test_POST_StatusCode {
    @Test
    public void testPostRequest_header(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body("{\"name\": \"Jan\", \"lastName\": \"Kowalski\", \"pesel\": \"88112300618\", \"dateOfBirth\": \"23-11-1988\"}\n");
        Response response = request.post("http://pesel.eucentral-1.elasticbeanstalk.com/api/v1/citizens");
        Assert.assertEquals(response.statusCode(), 201);
    }
}
