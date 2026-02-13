package SortingAlgorithams.SelectionSorting;

import java.util.Arrays;

public class Task1 {
    static void main() {
        int [] arr = {3,1,2,0,5,-1};
        for (int i=0;i<arr.length;i++){
            int index =i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
