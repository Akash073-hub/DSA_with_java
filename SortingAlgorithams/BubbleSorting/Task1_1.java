package SortingAlgorithams.BubbleSorting;

import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,7,5,4,6};
        for(int i=0;i<arr.length-1;i++){
            boolean flag = true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = false;
                    break;
                }
            }
            if(flag == true)  break;
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}
 // or
// int [] arr ={1,2,3,7,5,4,6};
//        for(int i=0;i<arr.length-1;i++){
//            int swap = 0;
//            for(int j = 0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j +1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j +1];
//                    arr[j +1]=temp;
//                    System.out.println(Arrays.toString(arr));
//                    swap++;
//                }
//            }
//            if(swap == 0) break;
//        }
