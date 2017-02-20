/**
 * Created by Dmitrii on 03.02.2017.
 */
public class CvsP {
    public void start() {
        Range level = new Range();
        level.setLevel();
        System.out.println("Загадайте число от " + level.getMinNum() + " до " + level.getMaxNum()+"\n" +
                "Нажмите клавишу Enter для продолжения"  );
        Player.getEnter();

        int status;
        do {
            System.out.println("Компьютер угадывает число:");
            int computerNumber = Computer.middle(level.getMinNum(), level.getMaxNum());
            System.out.println(computerNumber);
            status = Player.status();
            if (status == 1) level.setMinNum(computerNumber + 1);
            else if (status == 2) level.setMaxNum(computerNumber - 1);
            else break;
        } while (true);
    }
}
