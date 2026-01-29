package Patternprintting.stage4;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int a=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
