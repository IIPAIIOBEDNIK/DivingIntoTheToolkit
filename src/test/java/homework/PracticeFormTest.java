package homework;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").click();

        $("").shouldHave(text(""));
    }
}