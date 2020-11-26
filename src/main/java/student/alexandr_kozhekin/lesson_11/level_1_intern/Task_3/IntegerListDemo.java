package student.alexandr_kozhekin.lesson_11.level_1_intern.Task_3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        //вставка в конец
        arrayList.add(1);
        //вставка в по индексу/в начало
        arrayList.add(0,2);
        //длинна списка
        arrayList.size();
        //удаление элеента по индексу
        arrayList.remove(0);
        //удаление элементов без индекса
        arrayList.clear();
        //пустой список или нет
        arrayList.isEmpty();

        arrayList.add(1);
        arrayList.add(1,2);

        //обход списка
        for (int num : arrayList){
            System.out.println(num);
        }

    }
}
