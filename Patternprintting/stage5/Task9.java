package Patternprintting.stage5;

import java.util.Scanner;

public class Task9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int k=1;k<=2*rows-1;k++){
            System.out.print("* ");
        }
        System.out.println("  ");
        int nsp =1;
        for(int i=1;i<=rows-1;i++) {
            for (int j = 1; j <=rows-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=rows-i; j++) {
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
