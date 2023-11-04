import java.util.Scanner;

public class StringMethods {
    public static void main(String[] arguments){

        String myString;

        // ask user to input a string
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String without any spaces: ");
        myString = keyboard.next();

        // displaying the String entered
        System.out.println("the string you entered is " + myString);

        // getting the length of the String
        System.out.println("the length of the string is "+ myString.length());

        // getting the character at a position 4 in the string
        System.out.println("the character at position 4 is " + myString.charAt(4));

        // concatenating a sentence to string entered
        System.out.println(myString + " is my name.");

        // making the string to be in UPPERCASE
        System.out.println("uppercase: " + myString.toUpperCase());

        //making the string to be in lowercase
        System.out.println("lowercase: " + myString.toLowerCase());

        // substring
        System.out.println("the substring at 1 and 4 is: " + myString.substring(1, 4));

    }
}
