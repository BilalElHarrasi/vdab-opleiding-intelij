import java.util.Random;
import java.util.Scanner;

public class HogerLagerSpel {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("hallo");
        int randNumber = rng.nextInt(11);
        System.out.println(randNumber);

        System.out.println("Guess the number between 0-10: \n\n");
        int antwoord = Keyboard.nextInt();



        while (!(randNumber == antwoord)) {
            if (randNumber < antwoord) {
                System.out.println("Lager");
            } else {
                System.out.println("Hoger");
            }
            antwoord = Keyboard.nextInt();
        }
        System.out.println("Goed zo!");
    }
}