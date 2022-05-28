import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {

        @BeforeAll
    static void beforeAll() {
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            Configuration.baseUrl = "https://demoqa.com";

        }

        @Test
        void firstTest() {
            open("/automation-practice-form");
            $("#firstName").setValue("Oleg");
            $("#lastName").setValue("Zaharenko");
            $("#userEmail").setValue("blablalba@gmail.com");
            $("#userNumber").setValue("1234567890");
            $("#subjectsContainer").setValue("qwerty");
        }
        @AfterAll
    static void afterAll() {
            Selenide.closeWebDriver();
        }
}
