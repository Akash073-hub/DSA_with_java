package SortingAlgorithams.BubbleSorting;

import java.util.Arrays;

public class Task2 {
    static void main() {
        int [] arr ={1,2,3,7,5,4,6};
        for(int i =0;i< arr.length-1;i++){
            int swap = 0;
            for(int j =0;j< arr.length-1;j++){
                if(arr[j] < arr[j +1]){
                    int temp = arr[j];
                    arr[j]=arr[j +1];
                    arr[j +1]=temp;
                    System.out.println(Arrays.toString(arr));
                    swap++;
                }
            }
            if(swap == 0) break;
        }
    }
}
