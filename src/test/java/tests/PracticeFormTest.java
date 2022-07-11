package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    TestData testData = new TestData();

    @Test
    @Tag("PracticeFormTest")
    void FirstTest() {
        practiceFormPage.openPracticeForm()
                .setSubjectF(testData.subject)
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phone)
                .setDateOfBirthday(testData.birthDay, testData.birthMonth, testData.birthYear)
                .setHobbiesWrapper(testData.hobby)
                .uploadPicture(testData.picture)
                .setCurrentAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .pressSubmit()

                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phone)
                .checkResult("Date of Birth", testData.birthDay + " " + testData.birthMonth + "," + testData.birthYear)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.picture)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);
    }

}
