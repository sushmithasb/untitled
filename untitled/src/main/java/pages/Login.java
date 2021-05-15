package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    static WebDriver driver;
    private By freeTrailButton;

    public Login()
    {
        freeTrailButton= By.xpath("//a[contains(text(),'FREE 30 Day Trial')]");
    }

    public void click(WebDriver driver)
    {
        driver.findElement(freeTrailButton).click();
    }
}
