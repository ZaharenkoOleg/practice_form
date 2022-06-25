package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalenderComponent {
    public void setDate(String DD, String MM, String YYYY) {
        $(".react-datepicker__year-select").selectOption(YYYY);
        $(".react-datepicker__month-select").selectOption(MM);
        if (DD.length() == 1) {
            $(".react-datepicker__day--00" + DD + ":not(.react-datepicker__day--outside-month)").click();
        } else {
            $(".react-datepicker__day--0" + DD + ":not(.react-datepicker__day--outside-month)").click();
        }
    }
}
