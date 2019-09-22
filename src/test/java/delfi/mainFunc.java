package delfi;

import delfi.variables;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainFunc {
    WebDriver driver = new ChromeDriver();
    variables myVar = new variables();

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get(myVar.BASE_URL);
    }

    public void getPageElements() {

        myVar.firstArticle = driver.findElement(myVar.HOME_PAGE_TITLE).getText();
        String firstArticleCommentCount = driver.findElement(myVar.HOME_PAGE_COMMENT_COUNT).getText();
        String firstArticleCommentCount2 = firstArticleCommentCount.substring(1, firstArticleCommentCount.length() - 1);
        myVar.firstArticleCommentCountNum = Integer.parseInt(firstArticleCommentCount2);

        System.out.println("Заголовок статьи на главной странице: " + myVar.firstArticle);
        System.out.println("Число комментариев на главной странице как строка: " + firstArticleCommentCount);
        System.out.println("Число комментариев на главной странице как строка без скобок: " + firstArticleCommentCount2);
        System.out.println("Число комментариев на главной странице числом: " + myVar.firstArticleCommentCountNum);
        System.out.println(""); // пустая строка для разделения
    }

    public void goToFirstArticle() {
        driver.findElement(myVar.HOME_PAGE_TITLE).click();
        myVar.pageArticleTitle = driver.findElement(myVar.ARTICLE_PAGE_TITLE).getText();
        String pageArticleCommentsCount = driver.findElement(myVar.ARTICLE_PAGE_COMMENT_COUNT).getText();
        String pageArticleCommentsCount2 = pageArticleCommentsCount.substring(1, pageArticleCommentsCount.length() - 1);
        myVar.pageArticleCommentsCountNum = Integer.parseInt(pageArticleCommentsCount2); //value of

        System.out.println("Заголовок статьи: " + myVar.pageArticleTitle);
        System.out.println("Число комментариев как строка: " + pageArticleCommentsCount);
        System.out.println("Число комментариев как строка: " + pageArticleCommentsCount2);
        System.out.println("Число комментариев как строка: " + myVar.pageArticleCommentsCountNum);
    }

    public void articlesTitleAssertion() {

        Assert.assertEquals(myVar.firstArticle, myVar.pageArticleTitle);
    }

    public void commentsCountAssertion() {
        Assert.assertEquals(myVar.firstArticleCommentCountNum, myVar.pageArticleCommentsCountNum);
    }

    @After
    public void close() {
        driver.close();
    }

}