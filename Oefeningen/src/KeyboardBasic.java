import java.security.Key;
import java.sql.SQLOutput;
import java.util.Scanner;

public class KeyboardBasic {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Please, sir/madam, enter a number:");
        a = Keyboard.nextInt();
        System.out.println("Please, sir/madam, enter another number:");
        b = Keyboard.nextInt();

        sum = a + b;
        System.out.println(sum);
    }
}
