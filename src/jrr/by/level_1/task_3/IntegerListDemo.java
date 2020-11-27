package task_3;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add (4);
        list.add (24);
        list.add (44);
        list.add (46);
        list.add (0, 74);
        list.add (5, 7);
        System.out.println("Размер списка - " +list.size());
        System.out.println(list.toString());
        System.out.println(list.contains(21));
        list.remove(0);
        list.remove(list.size()-4);
        System.out.println(list.toString());
    }
}
