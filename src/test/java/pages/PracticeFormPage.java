package pages;

import pages.components.CalenderComponent;
import pages.components.ResultTableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    ResultTableComponent resultTableComponent = new ResultTableComponent();
    CalenderComponent calenderComponent = new CalenderComponent();

    public PracticeFormPage openPracticeForm() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public PracticeFormPage setSubjectF(String value) {
        $("#subjectsInput").sendKeys(value);
        $("#subjectsInput").pressEnter();
        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public PracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public PracticeFormPage setUserEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public PracticeFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }


    public PracticeFormPage setDateOfBirthday(String DD, String MM, String YYYY) {

        $("#dateOfBirthInput").click();
        calenderComponent.setDate(DD, MM, YYYY);
        return this;
    }

    public PracticeFormPage setUserNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public PracticeFormPage setHobbiesWrapper(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public PracticeFormPage uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public PracticeFormPage setCurrentAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public PracticeFormPage setState(String value) {
        $("#react-select-3-input").setValue(value).pressEnter();
        return this;
    }

    public PracticeFormPage setCity(String value) {
        $("#react-select-4-input").setValue(value).pressEnter();
        return this;
    }

    public PracticeFormPage pressSubmit() {
        $("#submit").click();
        return this;
    }

    public PracticeFormPage checkResult(String key, String value) {

        resultTableComponent.checkTable(key, value);
        return this;
    }

}
