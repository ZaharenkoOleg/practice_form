import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void firstTest() {
        open("/automation-practice-form");
        $("#subjectsInput").sendKeys("chemistry");
        $("#subjectsInput").pressEnter();
        $("#firstName").setValue("Oleg");
        $("#lastName").setValue("Zaharenko");
        $("#userEmail").setValue("blablalba@gmail.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("1234567890");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("2000");
        $(byText("4")).click();

        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src\\test\\resources\\image.jpg"));
        $("#currentAddress").setValue("qwerty");

        $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
        $("#react-select-4-input").setValue("Lucknow").pressEnter();

        $("#submit").click();

        $(".modal-body").shouldHave(
                text("Oleg Zaharenko"),
                text("blablalba@gmail.com"),
                text("Male"),
                text("1234567890"),
                text("4 February,2000"),
                text("Chemistry"),
                text("Music"),
                text("image.jpg"),
                text("qwerty"),
                text("Uttar Pradesh Lucknow")
        );
    }
}
