package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage {

    @FindBy(xpath = "//div[@data-apiary-widget-id='/content/allFilters']")
    WebElement filterMenu;


    public FilterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setFilterSumOt(String value) {
        filterMenu.findElement(By.xpath(".//div[@data-filter-id='glprice']//div[@data-prefix='от']//input[@placeholder]")).sendKeys(value);

    }


}

