package Loops;

import java.util.Scanner;

public class Task5 {
    // 10 terms of the series 5,10,15,20,... like AP
    static void main() {
        Scanner sc = new Scanner(System.in);
        int var_1 = sc.nextInt();
        int var_2 = sc.nextInt();
        for (int i=1;i<3*var_2-1;i+=var_1){
            System.out.println(i);
        }
    }
}
