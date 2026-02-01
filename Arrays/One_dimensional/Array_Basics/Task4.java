package Arrays.One_dimensional.Array_Basics;

public class Task4 {
    static void main() {
        int [] arr ={1,2,3};
        int product =1;
        for (int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println("Sum of all elements in the array: "+product);
    }
}
