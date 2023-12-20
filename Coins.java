public class Coins {
    public static void main(String[] args) {
        int numberOfCents = Integer.parseInt(args[0]);
        int quarters = 0;
        int cents = 0;
        while (numberOfCents > 0) {
            if (numberOfCents < 25) {
                numberOfCents--;
                cents++;
            } else {
                numberOfCents = numberOfCents -25;
                quarters++;
            }
        }
        System.out.println ("use " + quarters + " quarters and " + cents + " cents.");
    }
}
