/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Computer {
    int min, max;
    public int randomNumber(int level) {
        return  (int)(Math.random() * (10 * level));
    }
    public int guessingComputer(int status, int level, int number) {
        min = 0;
        max = level*10;
        if (status == 1) {
            min = number;
            return (max+min)/2;
        }
        else if (status == 2) {
            max = number;
            return (max + min)/2;
        }
        else {
            System.out.println("Компьютер угадал ваше число! Спасибо за игру!");
            return 100;
        }
    }
}
