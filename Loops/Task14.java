package Loops;

import java.util.Scanner;

public class Task14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int sum =0;
        while(var_1!=0){
            int var_2 = var_1%10;
            sum +=  var_2;
            var_1 /=10;
        }
        System.out.println(sum);
    }
}