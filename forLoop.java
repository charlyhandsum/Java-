
import java.util.Scanner;

public class forLoop
{
    public static void execute () {
        int num;
        char reply;


do {
    System.out.println("*** Insert value for times table ***");
    System.out.println();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a value");
    num = keyboard.nextInt();
    while (num <= 1) {
        System.out.println(" This number is less that 2, try a number greater that 1");
        System.out.println("Enter an acceptable value (i.e from 2 to infinity");
        num = keyboard.nextInt();
    }
    if (num >= 2) {
        int i;
        for (i = 1; i <= 12; i++)
System.out.println(i + " X " + num + " = " + (i * num));
    }

         System.out.println();
         System.out.println("This is your multiplication table for the number " + num);
         System.out.println();

         System.out.println("would you like to go again??? (y or n)");
         reply = keyboard.next().charAt(0);
         System.out.println();

} while (reply=='y' || reply=='Y');

        }
    }
