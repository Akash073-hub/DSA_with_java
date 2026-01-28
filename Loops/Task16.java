package Loops;

import java.util.Scanner;

public class Task16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int fact =1;
        int i=1;
        while(i<=var_1){
            fact *=i;
            i++;
        }
        System.out.println(fact);
    }
}
