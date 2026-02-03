package Arrays.One_dimensional.Array_Basics;

public class Task9 {
    static void main() {
        int [] arr ={1,2,3,4,5};
         int i = 0, j =arr.length-1;
         while (i<j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
         for (int k : arr){
             System.out.print(k+" ");
         }
    }
}
