package student.igor_kavalevski.lesson_3.exercise_1;

public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog(3, "brown", "Bob");

        System.out.println("dog.name - " + dog.name);
        System.out.println("dog.color - " + dog.color);
        System.out.println("dog.age - " + dog.age);

        dog.voice();
        dog.eat();
        dog.sleep();
    }
}
