package if_else;

import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        if (var_1 < 0) {
            System.out.println(-1*var_1);
        }
        else {
            System.out.println(var_1);
        }
    }
}
