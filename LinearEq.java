public class LinearEq {
    public static void main (String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x;
        System.out.println (a + " * x + " + b + " = " + c);
        c = c - b;
        c = c / a;
        System.out.println ("x = " + c);
    }
}
