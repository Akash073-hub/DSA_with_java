package Methods.User_Defined;

public class Task1 {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " "+ b);
    }
    static void main() {
        swap(10,11);
    }
}
