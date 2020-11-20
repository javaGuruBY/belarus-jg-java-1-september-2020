package level1;

public class PersonDemo {
    public static void main(String[] args) {
        Address address = new Address("Wallstreet", 35);
        Person person1 = new Person("Mike Wazowski", 18, address);
        Person person2 = new Person("Anthony", 34, address);
        Person person3 = new Person();
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
