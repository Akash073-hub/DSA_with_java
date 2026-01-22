package if_else;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sb.nextDouble();
        double x = (int)n;
        if (n-x > 0) System.out.println("Not an Integer");
        else System.out.println("Is an Integer");
    }
}