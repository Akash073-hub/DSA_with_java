package if_else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int sp = sc.nextInt();
        if(sp > cp){
            double var_1 = ((sp-cp)*100.0)/cp ;
            System.out.println("Profit Percentage: " + var_1);
        }
        else if(sp == cp){
            System.out.println("No Profit No Loss Percentage: ");
        }
        else{
            double var_3 = ((cp-sp)*100.0)/cp;
            System.out.println("Loss Percentage: " + var_3);
        }
    }
}
