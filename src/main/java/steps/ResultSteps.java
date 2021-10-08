package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import pages.ResultPage;

public class ResultSteps {

    @Step("проверить что элементов на странице {0} ")
    public void CheckCountSearchResult (long elementsCount) {
        new ResultPage().CheckCountSearchResult(elementsCount);

    }

    @Step ("первый элемент в списке:")
    public void FirstElementSearchResult () {
        new ResultPage().FirstElementSearchResult();

    }

    @Step ("в поле поиска вводим значение первого элемента в списке")
    public void InputSearchFiled () {
        new ResultPage().InputSearchFiled();

    }

    @Step ("нажимаем кнопку Найти")
    public void FindSearchFiled () {
        new ResultPage().FindSearchFiled();

    }

    @Step ("проверяем соответствие наименования товара")
    public void FirstElementSearchResultTwo () {
        new ResultPage().FirstElementSearchResultTwo();
    }





}
