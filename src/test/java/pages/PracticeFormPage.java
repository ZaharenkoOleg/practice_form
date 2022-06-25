package pages;

import io.qameta.allure.Step;
import pages.components.CalenderComponent;
import pages.components.ResultTableComponent;

import java.time.Month;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    ResultTableComponent resultTableComponent = new ResultTableComponent();
    CalenderComponent calenderComponent = new CalenderComponent();

    @Step("Открываем форму регитсрации")
    public PracticeFormPage openPracticeForm() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    @Step("Вводим факультет")
    public PracticeFormPage setSubjectF(String value) {
        $("#subjectsInput").sendKeys(value);
        $("#subjectsInput").pressEnter();
        return this;
    }
    @Step("Вводим имя")
    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }
    @Step("Вводим фамилию")
    public PracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }
    @Step("Вводим email")
    public PracticeFormPage setUserEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }
    @Step("Выбираем пол")
    public PracticeFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    @Step("Выбираем дату рождения")
    public PracticeFormPage setDateOfBirthday(String DD, String MM, String YYYY) {

        $("#dateOfBirthInput").click();
        calenderComponent.setDate(DD, MM, YYYY);
        return this;
    }
    @Step("Вводим номер телефона")
    public PracticeFormPage setUserNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }
    @Step("Выбираем хобби")
    public PracticeFormPage setHobbiesWrapper(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }
    @Step("Загружаем изображение")
    public PracticeFormPage uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
    @Step("Вводим адрес")
    public PracticeFormPage setCurrentAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }
    @Step("Вводим штат")
    public PracticeFormPage setState(String value) {
        $("#react-select-3-input").setValue(value).pressEnter();
        return this;
    }
    @Step("Вводим город")
    public PracticeFormPage setCity(String value) {
        $("#react-select-4-input").setValue(value).pressEnter();
        return this;
    }
    @Step("Нажимаем Submit")
    public PracticeFormPage pressSubmit() {
        $("#submit").click();
        return this;
    }
    @Step("Проверяем регистрационные данные")
    public PracticeFormPage checkResult(String key, String value) {

        resultTableComponent.checkTable(key, value);
        return this;
    }

}
