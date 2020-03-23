package pl.allegro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//button[@class='_13q9y _8hkto _nu6wg _1sql3 _qdoeh _l7nkx _nyhhx']")
    public WebElement close;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInput;


    public HomePage (WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
}
