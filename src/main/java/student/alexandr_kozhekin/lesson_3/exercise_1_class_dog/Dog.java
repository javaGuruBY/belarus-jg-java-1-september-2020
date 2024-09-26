package student.alexandr_kozhekin.lesson_3.exercise_1_class_dog;
/*
Разработать класс - собака, у которого должны быть следующие характеристики:
Свойства:
Возраст (int age)
Цвет (String color)
Имя (String name)
Методы:
Голос (void voice())
Есть (void eat())
Спать (void sleep())
 */

public class Dog {
    private int ageDog;
    private String colorDog;
    private String nameDog;

    public Dog() {
    }

    public Dog(String nameDog) {
        this.nameDog = nameDog;
    }

    public Dog(String nameDog, String colorDog, int ageDog) {
        this.colorDog = colorDog;
        this.nameDog = nameDog;
        this.ageDog = ageDog;
    }

    public void dogVoice(){
        System.out.println("Собака по имени " + nameDog + " говорт: Woof Woof");
    }

    public void dogEat(){
        System.out.println(nameDog + " хочет Om-Nom-nom");
    }

    public void dogSleep(){
        System.out.println(nameDog + " решил поспать: ZZzzzZZZzzzZZZzzzZZzzzZZZzzzZZZzzz");
    }
}
