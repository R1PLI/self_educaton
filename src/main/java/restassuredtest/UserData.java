package restassuredtest;

import java.net.URI;
import java.net.URISyntaxException;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserData {
    public void getUserData(String searchedRequest, String string) throws URISyntaxException {
        URI uri = new URI("http://services.groupkt.com/country/get/" + searchedRequest);
        given().
                contentType("application/json").
        when().
                get(uri).
        then().
                body(containsString(string)).
                statusCode(200);
    }
}
