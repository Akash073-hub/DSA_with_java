package Arrays.One_dimensional.Array_Basics;

import java.util.Arrays;

public class Task13 {
    static void main() {
        int [] arr = {1,2,3,4,5,6};
        int a =0;
        for(int i=0;i<arr.length;i++) {
            if(i%2==1){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}