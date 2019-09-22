package delfi;

import org.openqa.selenium.By;

 class variables {

    final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    final By HOME_PAGE_COMMENT_COUNT = By.xpath(".//a[contains(@class, 'comment-count')]");
    final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    final By ARTICLE_PAGE_COMMENT_COUNT = By.xpath(".//a[contains(@class, 'text-size-19')]");
    String BASE_URL = "http://rus.delfi.lv";
    String firstArticle;
    String pageArticleTitle;
    int firstArticleCommentCountNum;
    int pageArticleCommentsCountNum;


}
