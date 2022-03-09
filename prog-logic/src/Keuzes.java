import java.util.Scanner;

public class Keuzes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.println("Hoe oud ben jij?");
        age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("Je bent een volwassene.");
        } else if (age <= 17 && age >= 12) {
            System.out.println("Je bent een tiener.");
        } else if (age <= 11 && age >= 7) {
            System.out.println("Je bent een kind.");
        } else if (age <= 6 && age >= 4) {
            System.out.println("Je bent een kleuter.");
        } else if (age <= 3 && age >= 2) {
            System.out.println("Je bent een peuter.");
        }else{
            System.out.println("Je bent een baby.");
        }

        //efficient

        if (age >= 18) {
            System.out.println("Je bent een volwassene.");
        } else if (age >= 12) {
            System.out.println("Je bent een tiener.");
        } else if (age >= 7) {
            System.out.println("Je bent een kind.");
        } else if (age >= 4) {
            System.out.println("Je bent een kleuter.");
        } else if (age >= 2) {
            System.out.println("Je bent een peuter.");
        }else{
            System.out.println("Je bent een baby.");
        }

    }
}

