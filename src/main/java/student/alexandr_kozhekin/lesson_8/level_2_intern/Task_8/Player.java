package student.alexandr_kozhekin.lesson_8.level_2_intern.Task_8;

public class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);

    }
}
