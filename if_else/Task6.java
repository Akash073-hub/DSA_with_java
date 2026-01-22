package if_else;

import java.util.Scanner;

public class Task6 {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int var_1 = sc.nextInt();
        if(var_1 % 5 == 0 && var_1 % 3 == 0){
            System.out.println("Divisible by 5 and 3");
        }
        else if (var_1 % 3 == 0){
            System.out.println("Divisible by 3");
        }
        else if (var_1 % 5 == 0 ){
            System.out.println("Divisible by 5 ");
        }
        else {
            System.out.println("Not Divisible by 5 and 3");
        }
    }
}
