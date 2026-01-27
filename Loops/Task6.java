package Loops;

import java.util.Scanner;

public class Task6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = 10;
        int var_3 = 0;
        for (int i = 99; var_3 <= 10; i -= var_1) {
            System.out.println(i);
            var_3 ++;
        }
    }
}
