package student.alexandr_kozhekin.lesson_11.Level_1_intern.Task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++){

            arrayList.add(1);
            linkedList.add(1);

        }

        for (int num : arrayList) {

            System.out.println("arrayList - " + arrayList.get(num));

        }

        for (int num2 : linkedList) {

            System.out.println("linkedList - " + linkedList.get(num2));

        }
        //реализации интерфейса java.util.List могут хранить одинаковые элементы (дубликаты)
    }
}
