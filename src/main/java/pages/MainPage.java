package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage {

    @FindBy(xpath = "//div[@class='services-new__content']")
    WebElement mainMenu;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void selectMainMenu(String menuItem) {
        mainMenu.findElement(By.xpath(".//div[contains(text(),'" + menuItem + "')]")).click();
    }


}
