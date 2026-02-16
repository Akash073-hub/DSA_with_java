package SortingAlgorithams.BubbleSorting;

import java.util.Arrays;

public class Task3 {
    static void main() {
        int [] arr = {1,0,4,0,0,5,6,7};
        int j =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}