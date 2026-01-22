package if_else;

import java.util.Scanner;

public class Task2{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        if (var_1 > 0) {
            if(var_1%5 == 0){
                System.out.println("It is divisible by 5");
            }
            else{
                System.out.println("It is not divisible by 5");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}