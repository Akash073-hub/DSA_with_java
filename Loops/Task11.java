package Loops;

import java.util.Scanner;

public class Task11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag =true;
        for (int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag =false;
                break;
            }
        }
        if(n <=1){
            System.out.println("Invalid Input");
        }
        else if (flag == true){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
