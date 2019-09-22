package test;

import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;


public class automationpracticeMob {

    @Rule
    public ScreenShooter takeScreenshotSelenide = ScreenShooter.failedTests().succeededTests();

    @Test
    public void openSite() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
      //  options.addArguments("window-size=414,736");
      //  DesiredCapabilities cap = DesiredCapabilities.chrome();
      //  cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(414,736));


        driver.get("http://automationpractice.com/");
        driver.findElement(By.className("cat-title")).click();
        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")).click();
        driver.findElement(By.id("categories_block_left")).click();


        WebElement filter = driver.findElement(By.xpath("//ul[@class='tree dynamized']"));
        List<WebElement> li_Filter = filter.findElements(By.tagName("li"));


        WebElement body = driver.findElement(By.xpath("//ul[@class='clearfix']"));
        List<WebElement> li_Body = body.findElements(By.tagName("li"));


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


