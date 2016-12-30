import java.util.Scanner;

/**
 * Created by Dmitrii on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Игра угадай число");
        System.out.println("Выберите уровень сложности");
        System.out.println("1. Легко, от 0 до 10");
        System.out.println("2. Средне, от 0 до 20");
        System.out.println("3. Сложно, от 0 до 30");
        Scanner sc = new Scanner(System.in);
        Level level = new Level(sc.nextInt());
        sc.close();
    }
}
