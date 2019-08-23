package test;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    @Rule
    public ScreenShooter takeScreenshotSelenide = ScreenShooter.failedTests().succeededTests();

    @Test
    public void openSite() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();

       // driver.findElement(By.name("q")).sendKeys("test");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //driver.findElement(By.id("res")).click();
        //assertThat(driver.findElement(By.cssSelector("div:nth-child(2) > .rc .st")).getText(), is("How fast is your download speed? In seconds, FAST.com\\'s simple Internet speed test will estimate your ISP speed."));

        driver.close();

    }
}


