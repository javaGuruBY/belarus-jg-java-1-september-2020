package student.konstantin_adotik.lesson_3.level_1;

public class Dog {

    int age;
    String color;
    String name;


    public Dog(String name, String color, int age ) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    void voice() {
        System.out.println(name +
                " : Гав , Гав");
    }

    void eat() {
        System.out.println(name +
                " : yammy!");
    }

    void sleep() {
        System.out.println(name
                + " : ZzZzZ");
    }


    void printInfo() {
        System.out.println(" Имя собаки : " + name );
        System.out.println(" Цвет собаки : " + color);
        System.out.print(" Возраст собаки : " + age);
    }
}

