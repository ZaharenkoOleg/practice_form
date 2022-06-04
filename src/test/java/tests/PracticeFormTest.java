package tests;

import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest extends BaseTest {

    @Test
    void FirstTest() {
        practiceFormPage.openPracticeForm()
                        .setSubjectF("chemistry")
                        .setFirstName("Oleg")
                        .setLastName("Zaharenko")
                        .setUserEmail("blablalba@gmail.com")
                        .setGender("Male")
                        .setUserNumber("1234567890")
                        .setDateOfBirthday("04", "February", "2000")
                        .setHobbiesWrapper("Music")
                        .uploadPicture("src/test/java/tests/PracticeFormTest.java")
                        .setCurrentAddress("qwerty")
                        .setState("Uttar Pradesh")
                        .setCity("Lucknow")
                        .pressSubmit()
                        .checkResults();

    }

    }
