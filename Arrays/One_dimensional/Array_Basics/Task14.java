package Arrays.One_dimensional.Array_Basics;

import java.util.Arrays;

public class Task14 {
    static void main() {
        int[] arr = {9,9,9};
        String the = "";
        for (int i : arr) {
            the += i;
        }
        int ok = Integer.parseInt(the);
        ok= ok + 1;
        String teh = String.valueOf(ok);
        int a =0;
        int[] arr2 = new int[teh.length()];
        for (int i = 0; i < teh.length(); i++) {
            arr2[i] = teh.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(arr2));
    }
}
