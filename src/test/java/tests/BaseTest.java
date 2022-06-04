package tests;

import pages.PracticeFormPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
        PracticeFormPage practiceFormPage = new PracticeFormPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
}
