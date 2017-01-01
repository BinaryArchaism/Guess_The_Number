import java.util.Scanner;

/**
 * Created by Dmitrii on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double s = (int)(Math.random()*9);
        boolean ff = false;
        System.out.println(s);
        do {
            x = sc.nextDouble();
            if (x>s)System.out.println("Бери меньше");
            else if (x == s) {
                ff = true;
                System.out.println("Ты угадал");
                break;
            }
            else System.out.println("Бери больше");
        } while (ff != true);
    }
}
