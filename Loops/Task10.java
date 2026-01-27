package Loops;

import java.util.Scanner;

public class Task10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        for (int i=2;i<var_1;i++){
            if(var_1%i==0){
                System.out.println("composite");
            }
            else {
                System.out.println("Not compositie");
            }
        }
    }
}
