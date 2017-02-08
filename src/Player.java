import java.util.Scanner;

/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Player {
    int number;
    Scanner sc = new Scanner(System.in);
    public int getNumber(int level) {

        System.out.println("Введите число");
        do {
            number = sc.nextInt();
            check(level);
        } while (false);
        return number;
    }

    public boolean check(int level) {
        if (number >= 0 && number <= 10 && level  == 1) {
            return true;
        }
        else if (number >= 0 && number <= 20 && level == 2) {
            return true;
        }
        else if (number >= 0 && number <= 30 && level == 3) {
            return true;
        }
        else return false;
    }

    public int status() {
        System.out.println("Угадал ли число компьютер? \n 1. Загаданное число больше\n 2. Загаданное число меньше\n 3. Да, угадал");
        int status;
        do {
            status = sc.nextInt();
            if (status >= 1 && status <= 3) break;
        } while (true);
        return status;
    }
}
