package Arrays.One_dimensional.Array_Basics;

public class Task11 {
    static void main() {
        int[] arr = {1, 5, 2, 4, 6};
        int n = arr.length +1;
        int sum2 =0;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("Missing number is: " + (sum - sum2));
    }
}
