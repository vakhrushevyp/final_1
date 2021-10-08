package steps;

import io.qameta.allure.Step;
import pages.TVPage;


public class TVSteps {

    @Step("выбран элемент Все фильтры")
    public void stepSelectTvFilterBtn() {
        new TVPage().tvFilterBtn.click();
    }

}
