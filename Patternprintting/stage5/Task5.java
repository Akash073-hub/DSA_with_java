package Patternprintting.stage5;

import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <=rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
