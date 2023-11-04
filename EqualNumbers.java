import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args){
        /*Design and implement a program that asks the user to enter two numbers and
        then displays the message “NUMBERS ARE EQUAL”, if the two numbers are
        equal and “NUMBERS ARE NOT EQUAL”, if they are not equal.
        Hint: Don’t forget to use the double equals (= =) to test for equality.*/

        /*Adapt the program developed in the question above so that as well as checking
        if the two numbers are equal, the program will also display “FIRST NUMBER
        BIGGER” if the first number is bigger than the second number and display
        “SECOND NUMBER BIGGER” if the second number is bigger than the first.*/

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int firstNumber = keyboard.nextInt();

        System.out.println("Enter second number :");
        int secondNumber = keyboard.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("NUMBERS ARE EQUAL");
        }
        else {
            System.out.println("NUMBERS ARE NOT EQUAL");
        }
        if (firstNumber>secondNumber){
            System.out.println("FIRST NUMBER BIGGER");
        }
        else if (secondNumber>firstNumber){
            System.out.println("SECOND NUMBER IS BIGGER");
        }
        System.out.println("your check has been completed successfully!!!");
    }
}
