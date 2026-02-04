package Arrays.One_dimensional.Array_Basics;

import java.util.Arrays;

public class Task12 {
    static void main() {
        int [] arr ={1,0,0,0,1,1,1,0,1};
        int [] arr2 = new int[arr.length];
        int a =0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr2[i] += arr[i];
                a++;
            }
        }
        System.out.println(a);
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr2[a] += arr[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
