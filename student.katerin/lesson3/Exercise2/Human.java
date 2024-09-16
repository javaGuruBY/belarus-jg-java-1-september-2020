package Exercise2;

public class Human {
    public String name;
    public int age;

    void greet() {
        System.out.println("Hello, my name is " + this.name + "! I'm " + this.age + " years old");
    }

    Human() {
        this.name = "Noname";
        this.age = 0;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class HumanDemo {
    public static void main(String[] args) {

        Human firstHuman = new Human("Kate", 18);
        firstHuman.greet();

        Human secondHuman = new Human(20, "Mike");
        secondHuman.greet();

        Human thirdHuman=new Human();
        thirdHuman.greet();
    }
}