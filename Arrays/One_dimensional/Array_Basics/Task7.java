package Arrays.One_dimensional.Array_Basics;

public class Task7 {
    static void main() {
        int [] arr ={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.println(10+arr[i]);
            }
            else{
                System.out.println(2*arr[i]);
            }
        }
    }
}
