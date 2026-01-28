package Patternprintting.stage2;

public class Task6 {
    static void main() {
        int var_1 = 5;
        for (int i = 1; i <= var_1; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) ('A' + j-1));
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
