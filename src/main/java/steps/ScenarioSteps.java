package steps;

import io.cucumber.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();


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



}
