package steps;

import io.qameta.allure.Step;
import pages.ResultPage;

public class ResultSteps {

    @Step("проверить что элементов на странице {0} ")
    public void CheckCountSearchResult (long elementsCount) {
        new ResultPage().CheckCountSearchResult(elementsCount);

    }




}
