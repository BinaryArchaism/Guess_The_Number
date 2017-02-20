/**
 * Created by Dmitrii on 03.02.2017.
 */
public class PvsC {
    public void start() {
        Range level = new Range();
        level.setLevel();

        int playerNumber;
        int computerNumber = Computer.randomNumber(level.getMaxNum());
        do {
            playerNumber = Player.getNumber();
            if (playerNumber > computerNumber)System.out.println("Бери меньше");
            else if (playerNumber < computerNumber)System.out.println("Бери больше");
            else {
                System.out.println("Ты угадал!");
                break;
            }
        } while (true);
    }
}
