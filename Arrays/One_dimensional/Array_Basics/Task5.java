package Arrays.One_dimensional.Array_Basics;

public class Task5 {
    static void main() {
        int [] arr ={1,2,3};
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
