package steps;

import io.cucumber.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    TVSteps tvSteps = new TVSteps();
    FilterSteps filterSteps = new FilterSteps();
    ResultSteps resultSteps = new ResultSteps();


    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^выбран пункт меню маркета \"(.*)\"$")
    public void stepSelectMarketMainMenu(String menuItem) {
        marketSteps.stepSelectMarketMainMenu(menuItem);
    }

    @When("^выбран раздел электроники \"(.*)\"$")
    public void stepSelectElectronicsMenu(String menuItem) {
        electronicsSteps.stepSelectElectronicsMenu(menuItem);
    }

    @When("^выполнено нажание на кнопку Все фильтры$")
    public void stepSelectTvFilterBtn() {
        tvSteps.stepSelectTvFilterBtn();
    }

    @When("^ввод цены поиска От значением: \"(.*)\"$")
    public void stepSetFilterSumOt(String value) {
        filterSteps.stepSetFilterSumOt(value);
    }

    @When("^прокрутили страницу$")
    public void stepScroll() {
        filterSteps.stepScroll();
    }


    @When("^выбран производитель телевизора: \"(.*)\"$")
    public void stepSelectFilterManufacturer(String checkbox) {
        filterSteps.stepSelectFilterManufacturer(checkbox);
    }

    @When("^нажатие кнопки: \"(.*)\"$")
    public void stepPushFilterBtn(String text) {
        filterSteps.stepPushFilterBtn(text);
    }

    @When("^проверяем что элементов на странице: \"(.*)\"$")
    public void stepCheckCountSearchResult(long elementsCount) {
        resultSteps.CheckCountSearchResult(elementsCount);
    }

    @When("^первый элемент на странице:$")
    public void stepFirstElementSearchResult() {
        resultSteps.FirstElementSearchResult();
    }

    @When("^в поле поиска вводим значение первого элемента в списке$")
    public void stepInputSearchFiled() {
        resultSteps.InputSearchFiled();
    }

    @When("^нажимаем кнопку Найти$")
    public void stepFindSearchFiled() {
        resultSteps.FindSearchFiled();
    }

    @When("^проверяем соответствие наименования товара$")
    public void stepFirstElementSearchResultTwo() {
        resultSteps.FirstElementSearchResultTwo();
    }


}
