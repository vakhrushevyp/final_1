package steps;

import io.qameta.allure.Step;
import pages.FilterPage;

public class FilterSteps {

    @Step("поле цена От заполняется значением {0}")
    public void stepSetFilterSumOt (String value) {
        new FilterPage().setFilterSumOt(value);

    }

    @Step ("прокручиваем страницу")
    public void stepScroll () {
        new FilterPage().Scroll();
    }

    @Step ("выбран производитель:{0}")
    public void stepSelectFilterManufacturer (String checkbox) {
        new FilterPage().setFilterMenuManufacturer(checkbox);
    }


    @Step ("Нажата кнопка:{0}")
    public void stepPushFilterBtn (String text) {
        new FilterPage().pushFilterBtn(text);
    }


}
