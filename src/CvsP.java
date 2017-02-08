/**
 * Created by Dmitrii on 03.02.2017.
 */
public class CvsP {
    public void start() {
        Level level = new Level();
        level.setLevel();
        Computer computer = new Computer();
        Player player = new Player();

        System.out.println("Компьютер угадывает число:");
        int computerNumber = computer.randomNumber(level.getLevel());
        System.out.println(computerNumber);
        do {
            computerNumber = computer.guessingComputer(player.status(), level.getLevel(), computerNumber);
            if (computerNumber == 100) {break;}
            else System.out.println(computerNumber);
        } while (true);
    }
}
