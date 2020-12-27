package student.alexandr_kozhekin.lesson_3.exercise_2_class_human;
/*
Разработать класс - человек, у которого должны быть следующие характеристики:
Свойства:
  Имя (String name)
  Возраст (int age)
Методы:
   Приветствие (void greet()) - должен выводить на экран имя и возраст человека.1P
 */

public class Human {
    private String humanName;
    private int humanAge;

    public Human(String humanName, int humanAge) {
        this.humanName = humanName;
        this.humanAge = humanAge;
    }

    public void greet(){
        System.out.println("Здравствуй! Меня зовут " + humanName + ", мне " + humanAge + " лет.");
    }
}
