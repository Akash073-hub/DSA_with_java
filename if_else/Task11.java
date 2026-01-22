package if_else;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        }
        else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        }
        else if (y == 0) {
            System.out.println("Point lies on X-axis");
        }
        else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        }
        else {
            System.out.println("4th Quadrant");
        }
    }
}
