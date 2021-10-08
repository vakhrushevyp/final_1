package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class ElectronicsPage {

    @FindBy(xpath = "//div[@data-apiary-widget-name=\"@MarketNode/NavigationTree\"]")
    WebElement electronicsMenu;


    public ElectronicsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectElectronicsMenu(String menuItem) {
        electronicsMenu.findElement(By.xpath(".//a[(text()='" + menuItem + "')]")).click();
    }


}
