package if_else;

import java.util.Scanner;

public class Task10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l * b;
        double perimeter = 2 * (l + b);
        if (area > perimeter) {
            System.out.println("Area is greater");
        }
        else {
            System.out.println("Perimeter is greater");
        }
    }
}
