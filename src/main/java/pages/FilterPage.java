package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//div[@data-filter-id='7893318']")
    WebElement filterMenuManufacturer;

    public void Scroll() {
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView();"
                , filterMenuManufacturer);
    }


    public void setFilterMenuManufacturer(String checkbox) {
        filterMenuManufacturer.findElement(By.xpath(".//input")).click();
        filterMenuManufacturer.findElement(By.xpath(".//input")).clear();
        filterMenuManufacturer.findElement(By.xpath(".//input")).sendKeys(checkbox);
        filterMenuManufacturer.findElement(By.xpath("//div//label//div[contains(text(),'" + checkbox + "')]")).click();


    }


    public void pushFilterBtn(String text) {
        filterMenu.findElement(By.xpath(".//a[contains(text(),'" + text + "')]")).click();
    }


}

