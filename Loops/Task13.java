package Loops;

import java.util.Scanner;

public class Task13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int count =0;
        while(var_1!=0){
            var_1/=10;
            count++;
        }
        System.out.println(count);
    }
}
