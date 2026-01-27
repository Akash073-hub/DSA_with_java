package Loops;

import java.util.Scanner;

public class Task12 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int var_1 = s.nextInt();
        for (int i=1;i<=Math.sqrt(var_1);i++){
            if (var_1%i==0){
                System.out.println(i + " ");
                System.out.println(var_1/i+ " ");
            }
        }
    }
}
