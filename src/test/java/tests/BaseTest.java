package tests;

import com.codeborne.selenide.Configuration;
import config.LaunchConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void beforeAll() {
        LaunchConfig config = ConfigFactory.create(LaunchConfig.class, System.getProperties());

        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";

        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getServerAddress();

    }


}
