package Patternprintting.stage3;

public class Task3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('a' + j - 1));
            }
            System.out.println();
        }
    }
}
