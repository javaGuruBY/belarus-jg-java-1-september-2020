package student.alexandr_kozhekin.lesson_8.level_2_intern.Task_9;

public class Player {

    private String name;

    Player(String name) {

        this.name = name;

    }

}

class ComputerPlayer extends Player{

    ComputerPlayer(String name){

        super(name);
    }

}