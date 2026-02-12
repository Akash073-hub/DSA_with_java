package SortingAlgorithams.BubbleSorting;

import java.util.Arrays;

public class Task1 {
    public static void sorting(int [] arr){
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println(Arrays.toString(arr));
                flag = false;
            }
        }
        if(flag){
            System.out.println("The array is sorted");
            System.out.println(Arrays.toString(arr));
        }
        else{
            sorting(arr);
        }
    }
    static void main() {
        int [] arr = {1,2,5,4,3};
        sorting(arr);
    }
}
