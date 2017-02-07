/**
 * Created by Dmitrii on 03.02.2017.
 */
public class PvsC {
    public void start() {
        Level level = new Level();
        level.setLevel();
        Computer computer = new Computer();
        Player player = new Player();


        int playerNumber;
        int computerNumber = computer.randomNumber(level.getLevel());
        do {

            playerNumber = player.getNumber(level.getLevel());
            if (playerNumber > computerNumber)System.out.println("Бери меньше");
            else if (playerNumber < computerNumber)System.out.println("Бери больше");
            else {
                System.out.println("Ты угадал!");
                break;
            }
        } while (true);
    }
}
