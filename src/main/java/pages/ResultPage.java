package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import static org.junit.Assert.assertEquals;

public class ResultPage {


    @FindBy(xpath = "//div[@data-apiary-widget-name='@MarketNode/SearchResults']")
    WebElement searchResult;

    @FindBy(xpath = "//div[@data-apiary-widget-id=\"/content/header/search\"]")
    WebElement searchField;


    public ResultPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void CheckCountSearchResult(long elementsCount) {
        long count = searchResult.findElements(By.xpath("//article[@data-autotest-id='product-snippet']")).size();
        assertEquals("Количество элементов: " + count + ", не равно " + elementsCount, elementsCount, count);

    }

    public String FirstElementSearchResult() {
        return searchResult.findElement(By.xpath("//div//div//h3//a")).getText();

    }


    public void InputSearchFiled() {
        searchField.findElement(By.xpath("//input[@id=\"header-search\"]")).click();
        searchField.findElement(By.xpath("//input[@id=\"header-search\"]")).sendKeys(FirstElementSearchResult());
    }

    public void FindSearchFiled() {
        searchField.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

    public void FirstElementSearchResultTwo() {
        Assert.assertEquals("Наименование товара не соответствует запомненному значению.",
                searchField.findElement(By.xpath("//input[@id=\"header-search\"]")).getAttribute("value"),
                searchResult.findElement(By.xpath("//h3//a[@title]")).getText());
    }

}
