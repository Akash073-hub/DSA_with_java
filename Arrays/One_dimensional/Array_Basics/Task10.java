package Arrays.One_dimensional.Array_Basics;

public class Task10 {
    static void main() {
        int [] arr = {1,2,3,4,5,6};
        int [] arr2 = new int[arr.length];
        int a =0;
        for(int i=2;i<arr.length;i++){
            arr2[a]=arr[i];
            a++;
            if (i==arr.length-1){
                arr2[arr.length-2]=arr[0];
                arr2[arr.length-1]=arr[1];
            }
        }
        arr = arr2;
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
