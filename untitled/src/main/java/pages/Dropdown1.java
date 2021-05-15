package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

    static WebDriver driver;
    private By country;


    public Dropdown1() {
        country = By.id("Form_submitForm_Country");

    }

    public void selectDropdownValue(WebDriver driver, String value)
    {

        Select select1 = new Select(driver.findElement(country));
        select1.selectByVisibleText(value);

    }


}
