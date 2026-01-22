package Ternary_operator;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
