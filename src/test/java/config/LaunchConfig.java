package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${platform}.config"
})
public interface LaunchConfig extends Config {

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("server.address")
    String getServerAddress();

}
