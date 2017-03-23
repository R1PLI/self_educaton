import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.GetSteps;
import java.net.URISyntaxException;

public class testGet {

    private GetSteps getSteps;

    @BeforeMethod
    public void setUp() {
        getSteps = new GetSteps();
    }

    @Test
    public void getTest() throws URISyntaxException {
        getSteps.getIso2Code();
    }
}