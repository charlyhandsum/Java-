import java.util.Scanner;

public class CallingMethods {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** CONVERTING NAIRA TO DOLLAR ***");
        System.out.println("Enter an Amount");
        double nairaIn = keyboard.nextInt();

        System.out.println("your equivalent of N" + nairaIn + " in USD is $" + nairaDollar(nairaIn));
        System.out.println();
        System.out.println("*** CONVERTING NAIRA TO POUNDS ***");
        System.out.println("Enter an Amount");
        double nairaInput = keyboard.nextInt();

        System.out.println("your equivalent of N" + nairaIn + " in GBP is £" + nairaPound(nairaInput));
    }

    public static double nairaDollar(double NairaIn) {
        return (NairaIn / 859.97);
    }

    public static double nairaPound(double NairaIn) {
        return (NairaIn / 1799.7334);

    }

    static boolean oddEven(int numInput) {
        return numInput % 2 == 0;
    }

    static double interestRate(double amount, double tax) {
        double interest = (amount * tax * 1 / 100);
        System.out.println("your interest on the amount N" + amount + " = " + interest);
        return interest;
    }

    static double interestRate(double amount, double tax, double time) {
        double interest = (amount * tax * time / 100);
        System.out.println("your interest on the amount N" + amount + " = " + interest);
        return interest;
    }

    static int greaterNumber(int firstNum, int secondNum, int thirdNum) {
        int result;
        result = firstNum;
        if (secondNum > result) {
            result = secondNum;
        }
        if (thirdNum > result) {
            result = thirdNum;
            }
        return result;
    }

}