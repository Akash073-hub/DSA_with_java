package Patternprintting.stage4;

import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int a=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*i-1;j+=2){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
