package instructor.lesson_1;

public class VariableDemo {

    public static void main(String[] args) {

        int number = 15;
        double pie = 3.14;
        boolean flag = false;

        System.out.println("Number:");
        System.out.println(number);

        System.out.print("Pie:");
        System.out.println(pie);

        System.out.print("Flag:");
        System.out.println(flag);

        System.out.println();

        int day = 5;
        final int month = 10;
        int year = 2020;

        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.println(year);

        System.out.println();

        day = 6;

        System.out.println(day + " /" + month + "/" + year);

    }
}
