import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Herhalingen {
    public static void main(String[] args) {
        //todo: dit is de oplossing van de "extra" van de oefeningen
        Scanner Keyboard = new Scanner(System.in);
        boolean honger = true;

        JOptionPane.showMessageDialog(null,
                "We bakken uw pannekoek. Wacht maar bij de terminal. \n\nU moet momenteel 5 seconden wachten.",
                "Welkom bij McPannekoeken", JOptionPane.PLAIN_MESSAGE);
        for (int count = 0; count < 10 && honger; count++) {


            System.out.println("....");
            System.out.println("....");
            System.out.println("....");
            System.out.println("....");
            System.out.println("....");
            System.out.println("....");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pannenkoek " + (count+1) + " gebakken.");

            //TODO: nog honger? als het antwoord neen is dan verlaat je de loop
            System.out.println("Nog honger?");
            String antwoord = Keyboard.nextLine();

            //todo regex leren
            Pattern pattern = Pattern.compile("n", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(antwoord);
            boolean matchFound = matcher.find();

            if (matchFound == true) {
                honger = false;
                System.out.println("Dank u voor uw bezoek aan McPannekoeken! Daag!");
            }else{
                System.out.println("We maken een extra pannekoek voor u.");
            }
        }
    }
}
