package delfi;

import org.junit.Test;

public class delfiTest extends mainFunc {

    @Test
    public void Test() throws Exception {

        getPageElements();
        goToFirstArticle();
        articlesTitleAssertion();
        commentsCountAssertion();

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
    }

}
