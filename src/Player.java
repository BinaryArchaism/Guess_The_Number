import java.util.Scanner;

/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Player {
    public int getNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            number = sc.nextInt();
            Checker checker = new Checker();
            checker.check(number);
        } while (false);
        return number;
    }
}
