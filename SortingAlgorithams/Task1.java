package SortingAlgorithams;

public class Task1 {
    static void main() {
        int [] arr ={1,2,3,4,5,6,7};
        boolean flag = true;
        for (int i=0;i<arr.length-1;i++) {
            if(arr[i] < arr[i+1] && arr[i+1] - arr[i] ==1){
            }
            else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
