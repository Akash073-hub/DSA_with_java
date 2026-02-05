package Arrays.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        int n = list.size();
        int carry = 1;
        for (int i = n-1; i >= 0; i--) {
            if(list.get(i) + carry == 10){
                list.set(i,0);
            } else {
                list.set(i,list.get(i)+carry);
                carry = 0;
                break;
            }

        }
        if (carry == 1) {
            list.add(0, 1);
        }
        System.out.println(list);
    }
}
