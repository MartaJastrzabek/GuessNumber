import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GuessNumber guess = new GuessNumber(in);
        guess.checkAndPrint();
        in.close();
    }
}
