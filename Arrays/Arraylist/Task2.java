package Arrays.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list.addAll(list2);
        Collections.sort(list);
        System.out.println(list);
    }
}
