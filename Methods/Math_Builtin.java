package Methods;

public class Math_Builtin {
    public static void main(String[] args) {
        int a = 16;
        float b = 4.6f;
        double c = 9.8;
        long d = -25;

        System.out.println("abs(d) = " + Math.abs(d));
        System.out.println("max(a, b) = " + Math.max(a, b));
        System.out.println("min(b, c) = " + Math.min(b, c));

        System.out.println("sqrt(a) = " + Math.sqrt(a));
        System.out.println("cbrt(a) = " + Math.cbrt(a));
        System.out.println("pow(a, b) = " + Math.pow(a, b));

        System.out.println("ceil(b) = " + Math.ceil(b));
        System.out.println("floor(b) = " + Math.floor(b));
        System.out.println("round(b) = " + Math.round(b));
        System.out.println("rint(c) = " + Math.rint(c));

        System.out.println("exp(a) = " + Math.exp(a));
        System.out.println("log(c) = " + Math.log(c));
        System.out.println("log10(c) = " + Math.log10(c));

        System.out.println("sin(a) = " + Math.sin(a));
        System.out.println("cos(a) = " + Math.cos(a));
        System.out.println("tan(a) = " + Math.tan(a));

        System.out.println("random() = " + Math.random());

        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
    }
}

