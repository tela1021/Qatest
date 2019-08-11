package test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.*;
public class test1 {

    @Rule
    public ScreenShooter takeScreenshotSelenide = ScreenShooter.failedTests().succeededTests();
    @Test
    public void openSite(){
           System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no sandbox");

            WebDriver driver = new ChromeDriver(options);
            driver.get("http://www.google.com");

        }
    }


