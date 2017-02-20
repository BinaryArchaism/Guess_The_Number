import java.util.Scanner;

/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Range {
    int minNum = 0;
    int maxNum;

    public void setLevel() {
        System.out.println("Выбирете уровень сложности \n 1. от 0 до 10 \n 2. от 0 до 20 \n 3. от 0 до 30");
        Scanner sc = new Scanner(System.in);
        do {
            int level = sc.nextInt();
            if (level >= 1 && level <= 3) {
                minNum = 0;
                if (level == 1) maxNum = 10;
                else if (level == 2) maxNum = 100;
                else maxNum = 1000;
                System.out.println("Вы выбрали уровень сложности " + level + " (от "+minNum+" до " + maxNum + ")");
                break;
            }
            else System.out.println("Данного уровня сложности не существует");
        } while (true);
    }

    public int getMinNum() {
        return minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }
}
