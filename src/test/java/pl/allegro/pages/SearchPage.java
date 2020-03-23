package pl.allegro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.allegro.helpers.BaseTest;

import java.util.List;

public class SearchPage extends BaseTest {

    @FindBy(xpath = "//a[@class='_3e3a8_2MeYj']/span[text()='czarny']")
    public WebElement blackColor;
    @FindBy(xpath = "//div[@class='_9c44d_378hD']")
    private WebElement resultList;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void getResultList() {
        List<WebElement> resultItems = resultList.findElements(By.tagName("h2"));
        System.out.println(resultItems.size() - 1);

    }

}
