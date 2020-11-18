package student.alexandr_kozhekin.lesson_8.level_1_intern.Task_1;

/*
Дефолтный конструктор - это конструктор без параметров (аргументов)
При создании объекта вызывается конструктор по умолчаеию (дефолтный) даже если он не был создан явно в классе объекта
*/

public class Demo {

    Demo() {

        System.out.println("Вызов дефолтного конструктора");

    }

    public static void main(String[] args) {

        Demo demo = new Demo();

    }
}
