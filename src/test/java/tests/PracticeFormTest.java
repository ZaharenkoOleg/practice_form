package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;


public class PracticeFormTest extends BaseTest {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

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
                .checkResult("Student Name", "Oleg Zaharenko")
                .checkResult("Student Email", "blablalba@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "04 February,2000")
                .checkResult("Subjects", "Chemistry")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "PracticeFormTest.java")
                .checkResult("Address", "qwerty")
                .checkResult("State and City", "Uttar Pradesh Lucknow");

    }

}
