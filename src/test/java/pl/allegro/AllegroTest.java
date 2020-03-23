package pl.allegro;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pl.allegro.helpers.BaseTest;
import pl.allegro.pages.HomePage;
import pl.allegro.pages.SearchPage;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class AllegroTest extends BaseTest {

    @Test
    public void firstTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://allegro.pl/");
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        homePage.close.click();
        homePage.searchInput.sendKeys("Iphone 11");
        homePage.searchInput.sendKeys(Keys.ENTER);
        searchPage.blackColor.click();
        searchPage.getResultList();
        priceSort();
    }

    public void priceSort()  {
        List<WebElement> price = driver.findElements(By.className("_9c44d_1zemI"));
        List<String> prices = new ArrayList<String>();
        for (WebElement e : price)
        {
            prices.add(e.getText());
        }
        System.out.println(Collections.max(prices));
        String maxPrice = Collections.max(prices);
        String cutMaxPrice = maxPrice.substring(0, maxPrice.length() - 3).replace(" ", "").replace(",", ".");
        double d = Double.parseDouble(cutMaxPrice);
        double maxPricePlusTax = d/100*23+d;
        System.out.println(maxPricePlusTax);
    }
}
