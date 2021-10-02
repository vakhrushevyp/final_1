package pages;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.ArrayList;

public class MarketMainPage {

    @FindBy(xpath = "//div[@data-apiary-widget-name=\"@MarketNode/HeaderTabs\"]")
    WebElement marketMainMenu;

    ArrayList<String> tabs2 = new ArrayList<>(BaseSteps.getDriver().getWindowHandles());

    public MarketMainPage () {
        PageFactory.initElements(BaseSteps.getDriver().switchTo().window(tabs2.get(1)), this);
    }

    public void selectMarketMainMenu(String menuItem) {
                marketMainMenu.findElement(By.xpath(".//*[contains(text(),'" + menuItem + "')]")).click();
    }


}
