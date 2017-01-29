import java.util.Scanner;

/**
 * Created by Dmitrii on 29.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean correctLevel;
        int level;
        System.out.println("Игра угадай число от 0 до 10");
        System.out.println("Выбирете уровень сложности \n 1. от 0 до 10 \n 2. от 0 до 20 \n 3. от 0 до 30");
        do {
            level = sc.nextInt();
            correctLevel  = correctLevel(level);
            if (correctLevel == true) break;
            else System.out.println("Данного уровня сложности не существует");
        } while (true);
        int n = 0;
        if (level == 1) {n = 10;System.out.println("Вы выбрали уровень сложности 1 (от 0 до 10)");}
        if (level == 2) {n = 20;System.out.println("Вы выбрали уровень сложности 2 (от 0 до 20)");}
        if (level == 3) {n = 30;System.out.println("Вы выбрали уровень сложности 3 (от 0 до 30)");}
        System.out.println("Введите число");
        int randomNumber = (int)(Math.random()*n);
        boolean correct = false;
        do {
            number = sc.nextInt();
            if (number > randomNumber)System.out.println("Бери меньше");
            else if (number == randomNumber) {
                correct = true;
                System.out.println("Ты угадал");
            }
            else System.out.println("Бери больше");
        } while (correct != true);
    }

    public static boolean correctLevel(int level){
        if (level == 1) return true;
        else if (level == 2) return true;
        else if (level == 3) return true;
        else return false;
    }
}
