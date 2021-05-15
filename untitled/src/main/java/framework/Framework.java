package framework;

import data.Configuration;
import data.SystemConstants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Framework {

    private static WebDriver driver = null;

    public static void init() {
        String browser = Configuration.getsetting().getString("browser");
        if (SystemConstants.CHROME.equalsIgnoreCase(browser)) {
            System.setProperty(SystemConstants.CHROME_WEB_DRIVER_LOCATION, "src/main/resources/drivers/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

        } else {
            System.out.println("done");
        }

    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            init();
            return driver;
        } else {
            return driver;
        }

    }

    public static void loadWebsite() {
        getWebDriver().get(Configuration.getsetting().getString("url"));
    }

    public static void destroy() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;


        }
    }

    public static void takeScreenShot(String scenario, String testcase){
        File file = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(Configuration.getsetting().getString("screen_shot_path") +
                    LocalDate.now() + File.separator + scenario + File.separator + testcase + ".jpeg"));
        } catch (IOException e) {
            System.out.println("done");
        }
    }
}

