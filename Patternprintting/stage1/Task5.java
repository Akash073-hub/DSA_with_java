package Patternprintting.stage1;

import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=0;j<rows;j++){
                System.out.print((char) ('a' + j));
            }
            System.out.println();
        }
    }
}
