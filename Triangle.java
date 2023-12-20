public class Triangle {
    public static void main (String[] args) { 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isTriangle = true;
        if (a + b <= c && isTriangle) {
            isTriangle = false;
        }
        if (a + c <= b && isTriangle) {
            isTriangle = false;
        }
        if (b + c <= a && isTriangle) {
            isTriangle = false;
        }
        System.out.println (a + ", " + b + ", " + c + ": " + isTriangle);
    }
}
