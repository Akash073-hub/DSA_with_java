package Loops;

import java.util.Scanner;

public class Task17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = sc.nextInt();
        int var_3 =1;
        int i=1;
        while(i<=var_2){
            var_3 *=var_1;
            i++;
        }
        System.out.println(var_3);
    }
}
