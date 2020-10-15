package student.igor_kavalevski.lesson_3.exercise_1;

public class Dog {

    public int age;
    public String color;
    public String name;

    Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

        void voice () {

            System.out.println(" Dog " + this.name + " woof ");
        }
        void eat() {

            System.out.println(" Dog " + this.name + " eat ");
        }
        void sleep(){

            System.out.println(" Dog " + this.name + " sleep ");
        }
    }

