package Arrays.One_dimensional.Array_Basics;

import java.util.Arrays;

public class Task15 {
    static void main() {
        int [] arr ={1,2,3,4};
        int [] arr2 = {8,9,7,6,3};
        int [] arr3 = new int[arr.length+arr2.length];
        int a =0;
        for (int i=0;i<arr3.length;i++){
            if (i<arr.length){
                arr3[i]=arr[i];
            }
            else{
                arr3[i]=arr2[a];
                a++;
            }
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
