package test;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class tetsDomawka {
    @Test
    public void CalcSymb() throws IOException {

        String line = "aasfasasgsahdfhds";
        char Letter = 'a';
        int count = 0;
        for (char element : line.toCharArray()) {
            if (element == Letter) count++;

        }
        Assert.assertEquals(4, count);
    }
}
