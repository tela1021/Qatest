package delfi;

import org.openqa.selenium.By;

public class variables {

    public final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    public final By HOME_PAGE_COMMENT_COUNT = By.xpath(".//a[contains(@class, 'comment-count')]");
    public final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    public final By ARTICLE_PAGE_COMMENT_COUNT = By.xpath(".//a[contains(@class, 'text-size-19')]");
    public String BASE_URL = "http://rus.delfi.lv";
    public String firstArticle;
    public String pageArticleTitle;
    public int firstArticleCommentCountNum;
    public int pageArticleCommentsCountNum;


}
