package Patternprintting.stage3;

import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int mid = (rows/2)+1;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows;j++){
                if(i==mid || j==mid){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
