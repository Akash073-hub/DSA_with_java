package Basics.Builtin;

import java.util.Arrays;

public class Arrays_Builtin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int[] arr2 = {5, 2, 8, 1, 3};

        System.out.println("Array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));

        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);

        int[] filled = new int[5];
        Arrays.fill(filled, 9);
        System.out.println("Filled array: " + Arrays.toString(filled));

        System.out.println("Length of array: " + arr.length);
    }
}