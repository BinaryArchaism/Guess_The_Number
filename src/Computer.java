/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Computer {
    public int randomNumber(int level) {
        return  (int)(Math.random() * (10 * level));
    }
    public int guessingComputer(int status, int level, int number) {
        int min = 0;
        if (status == 1) {
            min = (level*10 + number) / 2;
            return (level*10 + number)/2;
        }
        else if (status == 2) {
            return ((level*10 + min) - number )/2;
        }
        else {
            System.out.println("Компьютер угадал ваше число! Спасибо за игру!");
            return 100;
        }
    }
}
