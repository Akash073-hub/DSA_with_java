package Loops;

import java.util.Scanner;

public class Task8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 =sc.nextInt();
        for (int i=0;var_1 >= 0;i++){
            System.out.println(i);
            System.out.println(var_1);
            var_1 --;
        }
    }
}
