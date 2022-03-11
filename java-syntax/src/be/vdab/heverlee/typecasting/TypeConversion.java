package be.vdab.heverlee.typecasting;

public class TypeConversion {
    public static void main(String[] args) {
        int myInt = 2000000;
        System.out.println(myInt);

        byte myByte = (byte) myInt;
        System.out.println(myByte);

        myInt = 155;
        myByte = (byte) myInt;
        System.out.println(myByte);

        char myChar = 'B';

        myInt = myChar;
        System.out.println(myInt);
    }
}
