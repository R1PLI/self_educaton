package finaltask.core.property;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("properties/urls.properties")
public class UrlConstants {

    @Property("gmail.main.page")
    private String gmailMainPage;

    public UrlConstants() {
        PropertyLoader.populate(this);
    }

    public String getGmailMainPage() {
        return gmailMainPage;
    }
}