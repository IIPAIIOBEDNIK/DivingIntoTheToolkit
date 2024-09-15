package homework;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alexander");
        $("#lastName").setValue("3yd");
        $("#userEmail").setValue("3yd@corp.com");
        $("[class=custom-control-label]").click();
        $("#userNumber").setValue("9169169169");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("#currentAddress").setValue("Some street 1");
        $("").setValue("");
        $("").setValue("");
        $("").click();

        $("").shouldHave(text(""));
    }
}