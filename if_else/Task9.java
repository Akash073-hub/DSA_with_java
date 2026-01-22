package if_else;

import java.util.Scanner;

public class Task9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = sc.nextInt();
        int var_3 = sc.nextInt();
        if (var_1+var_2 > var_3 && var_2+var_3 > var_1 && var_1+var_3 > var_2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
