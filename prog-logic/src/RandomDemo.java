import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        // RNG
        Random rng = new Random();

        int randNumber = rng.nextInt(10);
        System.out.println(rng.nextInt());
    }
}
