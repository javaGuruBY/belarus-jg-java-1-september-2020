package student.alexandr_kozhekin.lesson_8.level_2_intern.Task_7;
//класс родитель
class DemoZero{

    private int gear;
    private int speed;

    DemoZero(int gear, int speed){

        this.gear = gear;
        this.speed = speed;

    }
}

/*
Вызов конструктора родительского класса выполняется с  использованием ключивого слова super
при этом в скобках нужно перечислить параметры (аргументы) класса родителя (если они есть)

Вызов конструктора класса родителя нужен для присвоения полей класса родителя классу потомку
 */

//класс потомок
public class Demo extends DemoZero{
    private String name;

    Demo(String name, int gear, int speed){

        super(gear, speed);
        this.name = name;

    }

    public static void main(String[] args) {

        Demo demo = new Demo("Demo", 5, 100);

    }
}
