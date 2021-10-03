package steps;

import io.qameta.allure.Step;
import pages.FilterPage;

public class FilterSteps {

    @Step("поле цена От заполняется значением {0}")
    public void stepSetFilterSumOt (String value) {
        new FilterPage().setFilterSumOt(value);

    }

}
