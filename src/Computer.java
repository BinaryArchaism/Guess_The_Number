/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Computer {
    int min, max;
    public static int randomNumber(int level) {
        return  (int)(Math.random() * level);
    }

    public static int middle(int min, int max){
        return min + (max - min) / 2;
    }
}
