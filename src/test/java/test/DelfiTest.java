package test;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DelfiTest {

    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENT_COUNT = By.xpath(".//a[contains(@class, 'comment-count')]");


    @Test
    public void titleTest() {

        // OpenBrowser                open delfi homepage
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://rus.delfi.lv");

        String firstArticle = driver.findElement(HOME_PAGE_TITLE).getText(); // Save to toString
        String firstArticleCommentCount = driver.findElement(HOME_PAGE_COMMENT_COUNT).getText();
        String firstArticleCommentCount2 = firstArticleCommentCount.substring(1, firstArticleCommentCount.length() - 1);
        int firstArticleCommentCountNum = Integer.parseInt(firstArticleCommentCount2); //value of

        // WebElement firstArticleCommentCount = driver.findElement(HOME_PAGE_COMMENT_COUNT).getText()

        System.out.println(firstArticle);
        System.out.println(firstArticleCommentCount);
        System.out.println(firstArticleCommentCount2);
        System.out.println(firstArticleCommentCountNum);


        Assert.assertEquals(firstArticleCommentCountNum, 142);

        //Open article page
        //driver.findElement(By.linkText(firstArticle)).click();


    /*
                Find 1st article

                Find comment count
                Save to integer
                Open article page
                FInd title
                Check title
                Find comment count
                Check comment count
                Open Comment page
                Find title
                Check title
                Get commtnt count
                Close browser
                */
        driver.close();
    }

}
