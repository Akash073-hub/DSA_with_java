package Loops;

import java.util.Scanner;

public class Task15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int digit=0;
        while(var_1 !=0){
            digit = digit * 10 + (var_1 % 10);
            var_1 /=10;
        }
        System.out.println(digit);
    }
}
