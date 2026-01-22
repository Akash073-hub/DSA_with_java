package if_else;

import java.util.Scanner;

public class Task8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = 0;
        if (var_1 < 0){
            var_2 += -1 * var_1;
        }
        else{
            var_2 += var_1;
        }
        if (var_2 > 69){
            System.out.println("It is greater than 69");
        }
        else{
            System.out.println("It is not greater than 69");
        }
    }
}
