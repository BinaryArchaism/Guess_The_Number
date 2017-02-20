import java.util.Scanner;

/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Player {
    static Scanner sc = new Scanner(System.in);

    public static int getNumber() {

        System.out.println("Введите число");
        int number;
        do {
            number = sc.nextInt();
        } while (false);
        return number;
    }

    public static int status() {
        System.out.println("Угадал ли число компьютер? \n 1. Загаданное число больше\n 2. Загаданное число меньше\n 3. Да, угадал");
        int status;
        do {
            status = sc.nextInt();
            if (status >= 1 && status <= 3) break;
        } while (true);
        return status;
    }

    public static void getEnter() {
        sc.nextLine();
    }
}
