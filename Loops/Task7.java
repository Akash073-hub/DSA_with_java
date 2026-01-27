package Loops;

import java.util.Scanner;

public class Task7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 =2;
        for (int i=0;i<var_1;i++){
            System.out.println(var_1);
            var_1 *= var_2;
        }
    }
}
