package Patternprintting.stage1;

public class Task8 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        char ch = 'a';

        for (int i = 1; i <= rows; i++) {
            char printChar;

            if (i % 2 == 0) {

                printChar = Character.toUpperCase(ch);
            } else {

                printChar = Character.toLowerCase(ch);
            }

            for (int j = 1; j <= cols; j++) {
                System.out.print(printChar);
            }

            System.out.println();
            ch++;
        }
    }
}
