package Patternprintting;

import java.util.Scanner;

public class Task6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=0;j<rows;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
