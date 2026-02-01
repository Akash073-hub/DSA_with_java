package Arrays.One_dimensional.Array_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int []arr1 = new int[5];
        System.out.println(arr[3]);
        arr[2] = 10;
        System.out.println(arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        int [] arr2 = new int [10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
    }
}
