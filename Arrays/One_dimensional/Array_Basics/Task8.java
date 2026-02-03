package Arrays.One_dimensional.Array_Basics;

public class Task8 {
    static void main() {
        int [] arr ={1,2,3};
        int max =arr[0];
        int max_2 = Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max_2 && arr[i] != max) {
                max_2 = arr[i];
            }
        }
        System.out.println(max_2);
    }
}
