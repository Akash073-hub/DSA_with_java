package Arrays.One_dimensional.Array_Basics;

public class Task3 {
    static void main() {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the array: "+sum);
    }
}
