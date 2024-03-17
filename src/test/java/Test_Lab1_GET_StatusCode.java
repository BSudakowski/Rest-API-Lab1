import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class Test_Lab1_GET_StatusCode {

    @Test
    public void testGetRequest_ResponseStatusCodeOk(){
        Response response = get("http://pesel.eu-central-1.elasticbeanstalk.com/api/v1/pesel/generate");
    }
}
