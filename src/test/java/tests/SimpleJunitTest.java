package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {
    /*
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
    */

    private int getResult() {
        return 3;
    }

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("### beforeAll\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### afterAll\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###     beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     afterEach\n");
    }


    @Test
    void firstTest() {
        System.out.println("###       firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###       secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###       thirdTest()");
        Assertions.assertTrue(result > 2);
    }

}
