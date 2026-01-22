package if_else;

import java.util.Scanner;

public class Task12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c){
            System.out.println("a is greater than b or c");
        }
        else if(b > a && b > c){
            System.out.println("b is greater than a or c");
        }
        else if(c > a && c > b){
            System.out.println("c is greater than a or b");
        }
        else{
            System.out.println("There is no single greatest number");
        }
    }
}
