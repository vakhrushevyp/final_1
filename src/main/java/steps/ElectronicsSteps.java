package steps;

import io.qameta.allure.Step;
import pages.ElectronicsPage;

public class ElectronicsSteps {

    @Step("выбран раздел электроники {0}")
    public void stepSelectElectronicsMenu(String menuItem) {
        new ElectronicsPage().selectElectronicsMenu(menuItem);

    }

}
