package Arrays.One_dimensional.Array_Basics;

public class Task6 {
    static void main() {
        int [] arr ={1,2,3};
        int min =arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
