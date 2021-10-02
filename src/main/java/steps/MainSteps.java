package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps {

    @Step("Выбран элемент {0}")
    public void stepSelectMainMenu (String menuItem) {
        new MainPage().selectMainMenu(menuItem);
    }


}
