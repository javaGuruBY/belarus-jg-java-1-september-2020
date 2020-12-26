package level1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(13);
        myList.add(15);
        myList.add(0, 10);

        System.out.println("size=" + myList.size());
        System.out.println(myList.toString());
        System.out.println("element 13 = " + myList.contains(13));

        myList.remove(0);
        myList.remove(myList.size() - 1);
        System.out.println(myList.toString());

    }
}
