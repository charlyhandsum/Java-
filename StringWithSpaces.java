import java.util.Scanner;

public class StringWithSpaces {
    public static void main(String[] args){

        int age;
        double netWorth;
        String yourNames;

        // Creating two different Scanner class objects to get inputs for the primitive data and string data
        Scanner keyboard = new Scanner(System.in); //for Primitives
        Scanner keyboardString = new Scanner(System.in);

        // Prompting for data
        System.out.println("Enter your names: ");
        yourNames = keyboardString.nextLine();

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();

        System.out.println("What is your net worth? ");
        netWorth = keyboard.nextDouble();

        System.out.println();

        System.out.println("*** INFORMATION ENTERED ***");
        System.out.println("your names are " + yourNames);
        System.out.println("you are "+ age + " years old");
        System.out.println("you are worth $"+ netWorth);
    }
}
