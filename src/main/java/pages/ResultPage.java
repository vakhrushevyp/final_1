package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import static org.junit.Assert.assertEquals;

public class ResultPage {

    @FindBy(xpath = "//div[@data-apiary-widget-name='@MarketNode/SearchResults']")
    WebElement searchResult;


    public ResultPage () {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }



    public void CheckCountSearchResult (long elementsCount)  {
        long count = searchResult.findElements(By.xpath("//article[@data-autotest-id='product-snippet']")).size();
        assertEquals("Количество элементов: " + count + ", не равно "+ elementsCount, elementsCount,   count);


    }



}
