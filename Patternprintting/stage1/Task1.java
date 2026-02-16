package Patternprintting.stage1;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=columns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
