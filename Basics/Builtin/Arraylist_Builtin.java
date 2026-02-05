package Basics.Builtin;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Builtin {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2,5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(1,10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
