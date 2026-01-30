package Patternprintting.stage5;

import java.util.Scanner;

public class Task8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int nsp =rows-1;
        int nst =1;
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp = 1;
        nst=2*rows-3;
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
