package student.alexandr_kozhekin.lesson_8.level_1_intern.Task_3;

public class Person {

    private String fullName;
    private int age;
    private Address address;

    Person() {

        System.out.println("Дефолтный конструктор");

    }

    public static void main(String[] args) {

        Person person = new Person();
        //null
        System.out.println(person.fullName);
        //0
        System.out.println(person.age);
        //null
        System.out.println(person.address);
    }
}

