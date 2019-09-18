package test;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class automationpractice {

    @Rule
    public ScreenShooter takeScreenshotSelenide = ScreenShooter.failedTests().succeededTests();

    @Test
    public void openSite() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
        driver.findElement(By.linkText("WOMEN")).click();

        WebElement filter = driver.findElement(By.xpath("//ul[@class='tree dynamized']"));
        List<WebElement> li_Filter = filter.findElements(By.tagName("li"));
        li_Filter.remove(" ");
                /*
        for(WebElement element_fi : li_Filter){
            System.out.println(element_fi.getText().toLowerCase());
        }
*/
        WebElement body = driver.findElement(By.xpath("//ul[@class='clearfix']"));
        List<WebElement> li_Body = body.findElements(By.tagName("li"));
        /*
        for(WebElement element : li_Body){
            System.out.println(element.getText().toLowerCase());
        }
*/

        String li_Fliter_el_0 = li_Filter.get(0).getText().toLowerCase();
        String li_Fliter_el_1 = li_Filter.get(3).getText().toLowerCase();
        String li_Body_el_0 = li_Body.get(0).getText().toLowerCase();
        String li_Body_el_1 = li_Body.get(1).getText().toLowerCase();


        System.out.println(li_Fliter_el_0 +'\n'+ li_Fliter_el_1 +'\n'+ li_Body_el_0 +'\n'+ li_Body_el_1);

        Assert.assertEquals(li_Filter.get(0).getText().toLowerCase(), li_Body.get(0).getText().toLowerCase());
        Assert.assertEquals(li_Filter.get(3).getText().toLowerCase(), li_Body.get(1).getText().toLowerCase());



        driver.close();
    }
}


