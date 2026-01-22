package if_else;

import java.util.Scanner;

public class Task7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        if (var_1 > 0){
            if (var_1 > 999 && var_1 < 10000){
                System.out.println("4-digit number");
            }
            else{
                System.out.println("Not a 4-digit number");
            }
        }
        else{
            System.out.println(("Invalid Input"));
        }
    }
}
