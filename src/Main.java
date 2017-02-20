import java.util.Scanner;

/**
 * Created by Dmitrii on 29.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра угадай число \n Выбирете кто загадывает число \n 1. Вы \n 2. Компьютер");
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            choose = sc.nextInt();
            if (choose == 1 || choose == 2) break;
        } while (true);
        if (choose == 1) {
            (new CvsP()).start();
        }
        else {
            (new PvsC()).start();
        }
    }
}
