package Methods;

public class Math_Builtin {
    public static void main(String[] args) {

        int a = 16;
        float b = 5.5f;
        double c = 9.2;
        long d = -25;

        System.out.println("Max (a, b): " + Math.max(a, b));
        System.out.println("Min (c, d): " + Math.min(c, d));

        System.out.println("Sqrt of a: " + Math.sqrt(a));

        System.out.println("Power (a^b): " + Math.pow(a, b));

        System.out.println("Absolute of d: " + Math.abs(d));

        System.out.println("Ceil of b: " + Math.ceil(b));
        System.out.println("Floor of c: " + Math.floor(c));
        System.out.println("Round of b: " + Math.round(b));

        System.out.println("Sin(a): " + Math.sin(a));
        System.out.println("Cos(b): " + Math.cos(b));
        System.out.println("Tan(c): " + Math.tan(c));

        System.out.println("Log(c): " + Math.log(c));
        System.out.println("Log10(c): " + Math.log10(c));
        System.out.println("Exp(a): " + Math.exp(a));

        System.out.println("Random Number: " + Math.random());
    }
}
