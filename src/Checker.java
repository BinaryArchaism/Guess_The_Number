/**
 * Created by Dmitrii on 03.02.2017.
 */
public class Checker {
    public boolean check(int number) {
        Level level = new Level();
        if (number >= 0 && number <= 10 && level.getLevel() == 1) {
            return true;
        }
        else if (number >= 0 && number <= 20 && level.getLevel() == 2) {
            return true;
        }
        else if (number >= 0 && number <= 30 && level.getLevel() == 3) {
            return true;
        }
        else return false;
    }
}
