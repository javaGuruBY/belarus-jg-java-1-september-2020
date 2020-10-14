package student.konstantin_adotik.lesson_3.level_1;

public class DogDemo {
    public static void main(String[] args) {
        Dog kenji = new Dog("kenji", "Metalick", 54);
        kenji.voice();
        kenji.eat();
        kenji.sleep();
        kenji.printInfo();
    }
}
