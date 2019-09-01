import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Domawka {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter line for character counting: ");
        String line = reader.readLine();
        System.out.print("Enter letter for counting in line: ");
        Scanner in = new Scanner(System.in);
        char Letter;
        Letter = in.next().charAt(0);
        int count = 0;
        for (char element : line.toCharArray()) {
            if (element == Letter) count++;
        }

        System.out.println("Letter \"" + Letter + "\" count is: " + count);

    }
}
