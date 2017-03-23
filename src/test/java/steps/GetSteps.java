package steps;

import restassuredtest.UserData;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;

import java.net.URISyntaxException;

@Features("New feature")
public class GetSteps {
    private UserData userData;

    public GetSteps() {
        this.userData = new UserData();
    }

    @Step("Get request for India")
    public void getIso2Code() throws URISyntaxException {
        userData.getUserData("iso2code/IN", "India");
    }
}
