package Exercise1;

public class Dog {
    public int age;
    public String color;
    public String name;

    Dog(int age, String color, String name) {//конструктор с параметрами
        this.age = age;
        this.color = color;
        this.name = name;
    }

    Dog() {
    }//конструктор без параметров

    void voice() {
        System.out.println("Exercise1.Dog " + this.name + " says woof!");
    }

    void eat() {
        System.out.println("Exercise1.Dog " + this.name + " eats!");
    }

    void sleep() {
        System.out.println("Exercise1.Dog " + this.name + " sleeps!");
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog dogOne = new Dog(7, "black", "Zak");//конструктор  с параметрами
        dogOne.sleep();
        dogOne.eat();
        dogOne.voice();

        Dog dogTwo = new Dog();//конструктор без параметров, поэтому метод возвращает null
        dogTwo.sleep();
        dogTwo.eat();
        dogTwo.voice();
    }
}
