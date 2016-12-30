/**
 * Created by Dmitrii on 30.12.2016.
 */
public class Level {
    Spreader sp;
    public Level(int l) {
        if (l == 1){System.out.println("Вы выбрали легкий уровень сложности."); sp = new Number();}
        else if (l == 2) {System.out.println("Вы выбрали средний уровень сложности."); sp = new Number();}
        else {System.out.println("Вы выбрали сложный уровень сложности."); sp = new Number();}
    }
}
