package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemonstrationTest extends BaseTest{

    @Test
    public void mainPageShouldOpen(){
        open("");

        $("h1.Primer_Brand__Heading-module__Heading___IVpmp").shouldHave(text("Build and ship software"));

    }
}
