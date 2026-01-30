package Patternprintting.stage5;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=rows;j++){
                if(i+j>rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
