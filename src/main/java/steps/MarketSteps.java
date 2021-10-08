package steps;

import io.qameta.allure.Step;
import pages.MarketMainPage;

public class MarketSteps {

    @Step("выбран элемент {0}")
    public void stepSelectMarketMainMenu(String menuItem) {
        new MarketMainPage().selectMarketMainMenu(menuItem);
    }
}
