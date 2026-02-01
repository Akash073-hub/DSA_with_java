package Patternprintting.stage5;

public class Task10 {
    static void main() {
        int rows = 5;
        for(int i=1;i<=2*rows-1;i++) {
            for (int j = 1; j <= 2*rows-1; j++) {
                int a=i ,b=j;
                if(i>rows){
                    a=2*rows - i;
                }
                if(j>rows){
                    b=2*rows - j;
                }
                System.out.print(Math.min(a,b)+"  ");
           }
            System.out.println("  ");
        }
    }
}
