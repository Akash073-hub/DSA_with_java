package Patternprintting.stage2;

public class Task4 {
    static void main() {
        int var_1= 5;
        for(int i=0;i<var_1;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
    }
}
