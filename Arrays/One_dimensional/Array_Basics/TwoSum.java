package Arrays.One_dimensional.Array_Basics;

public class TwoSum {
    static void main() {
        int [] arr = {1,3,4,5,6};
        int target = 9;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("Indices: "+i+", "+j);
                }
            }
        }
    }
}
