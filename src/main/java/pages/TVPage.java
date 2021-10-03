package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class TVPage {

    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    public WebElement tvFilterBtn;

    public TVPage () {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

}
