package if_else;

import java.util.Scanner;

public class Task13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c){
            System.out.println("a is lesser than b or c");
        }
        else if(b < a && b < c){
            System.out.println("b is lesser than a or c");
        }
        else if(c < a && c < b){
            System.out.println("c is lesser than a or b");
        }
        else{
            System.out.println("There is no single lesser number");
        }
    }
}
