import java.util.Random;

public class GenThree {
    public static void main (String[] args) {
        Random r = new Random();
        /* the random ints generate a random number between 0 and the maximal value selected minus the minimal value,
        and then add the minimal value to the generated number. */
        int random1 = r.nextInt(Integer.parseInt(args[1]) - Integer.parseInt(args[0])) + Integer.parseInt(args[0]);
        int random2 = r.nextInt(Integer.parseInt(args[1]) - Integer.parseInt(args[0])) + Integer.parseInt(args[0]);
        int random3 = r.nextInt(Integer.parseInt(args[1]) - Integer.parseInt(args[0])) + Integer.parseInt(args[0]);
        int min = Math.min(random1, Math.min(random2, random3));
        System.out.println (random1 + "\n" + random2 + "\n" + random3 + "\nThe minimal generated number was " + min);
    }
}
