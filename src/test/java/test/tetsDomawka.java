package test;

import org.junit.Assert;
import org.junit.Test;


public class tetsDomawka {
    @Test
    public void CalcSymb() {

        String line = "aasfasasgsahdfhds";
        char Letter = 'a';
        int count = 0;
        for (char element : line.toCharArray()) {
            if (element == Letter) count++;
        }
        Assert.assertEquals(5, count);
    }
}
