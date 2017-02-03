import java.util.Scanner;

/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Level {
    int level;
    public int setLevel() {
        System.out.println("Выбирете уровень сложности \n 1. от 0 до 10 \n 2. от 0 до 20 \n 3. от 0 до 30");
        Scanner sc = new Scanner(System.in);
        do {
            level = sc.nextInt();
            if (level >= 1 && level <= 3) {
                System.out.println("Вы выбрали уровень сложности " + level + " (от 0 до " + level * 10 + ")");
                return level;
            }
            else System.out.println("Данного уровня сложности не существует");
        } while (true);
    }

    public int getLevel() {
        return level;
    }
}
