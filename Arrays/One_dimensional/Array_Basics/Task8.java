package Arrays.One_dimensional.Array_Basics;

import java.util.Scanner;

public class Task8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] arr ={1,2,3,4,5};
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Found at index: " + i);
                break;
            }
            else {
                System.out.println("Not Found");
            }
        }
    }
}
