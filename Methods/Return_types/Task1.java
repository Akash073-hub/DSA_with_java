package Methods.Return_types;

import java.util.Scanner;

public class Task1 {
    public static int fact(int a){
        int facto = 1;
        for(int i=1;i<=a;i++){
            facto *= i;
        }
        return facto;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = sc.nextInt();
        int ncr = fact(var_1)/(fact(var_2)*fact(var_1-var_2));
        int npr = fact(var_1)/fact(var_1-var_2);
        System.out.println(ncr);
        System.out.println(npr);
    }
}
