package Arrays.One_dimensional.Array_Basics;

public class Task2 {
    static void main() {
        int [] arr ={1,-3,-67,2,4,5,-10};
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
