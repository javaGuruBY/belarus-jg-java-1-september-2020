package student.konstantin_adotik.lesson_3.level_2;

public class Human {
    String name;
    int age;

    public Human(String name,int age) {
        this.name = name;
        this.age = age;

    }
    void printInfo(){
        System.out.println(" Hello !" +
                " what is your name and how old are you? " );

    }
    void greet() { System.out.println(" Hello ! My name is "
            + name + " I am 24 years old  " + age); }
}
