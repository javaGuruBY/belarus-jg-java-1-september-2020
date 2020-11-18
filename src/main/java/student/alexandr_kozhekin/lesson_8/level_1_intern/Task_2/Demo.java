package student.alexandr_kozhekin.lesson_8.level_1_intern.Task_2;

/*
В классе не обязательно создавать дефодтный конструктор он создается неявно при создании объекта
он может пригодится тогда когда вам нужно создать объект без параметров
но у вас уже есть конструктор который добавляет какие то аргументы
или при создании beans класса
 */

public class Demo {

    private int speed;
    private int gear;

    public Demo() {

        System.out.println("Дефолтный конструктор");

    }

    public Demo(int speed, int gear) {

        System.out.println("Конструктор с параметрами");
        this.speed = speed;
        this.gear = gear;

    }

    public static void main(String[] args) {

        Demo demo = new Demo(100, 4);

        Demo demo1 = new Demo();
    }
}
