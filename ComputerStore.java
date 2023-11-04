import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double basicSystem, screenOne, screenTwo, antiVirus, printer;
        basicSystem = 375.99;
        screenOne = 75.99;
        screenTwo = 99.99;
        antiVirus = 65.99;
        printer = 125.00;
        double initialPrice = 0, newPrice;

        /*Write a program to take an order for a new computer. The basic system costs
        375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
        43 cm screen (costing 99.99). The following extras are optional.*/

        System.out.println("*** Welcome to Charlee's Computer Store ***");
        System.out.println("Do you want to order for a new Computer?");
        System.out.println();
        System.out.println("Basic system cost 375.99");
        System.out.println();
        System.out.println("What is your preferred screen size? choose A or B");
        System.out.println("A. 38cm Screen = " + screenOne);
        System.out.println("B. 43cm Screen = " + screenTwo);

        char decisionOne = keyboard.next().charAt(0);

        switch (decisionOne){
            case 'A': System.out.println("you picked 38cm screen size");
                      System.out.println("cost will be "+ (initialPrice=basicSystem+screenOne)); break;

            case 'B': System.out.println("you picked 43cm screen size");
                      System.out.println("cost will be "+ (initialPrice=basicSystem+screenTwo)); break;

            default:  System.out.println("such option does not exist");
        }

        System.out.println();
        System.out.println("*** Additional Purchase ***");
        System.out.println("Would you love to purchase an Antivirus or a Printer? choose an option");
        System.out.println("A. Antivirus will cost " + antiVirus);
        System.out.println("B. Printer will cost " + printer);
        System.out.println("C. both Antivirus and Printer will cost " + (antiVirus+printer));
        System.out.println("D. Proceed to checkout ");

        char decisionTwo = keyboard.next().charAt(0);

        switch (decisionTwo){
            case 'A': System.out.println("you have added Antivirus to your purchase");
                      System.out.println("Total cost will be " + (newPrice=antiVirus+initialPrice)); break;

            case 'B': System.out.println("you have added Printer to your purchase");
                      System.out.println("Total cost will be " + (newPrice=printer+initialPrice)); break;

            case 'C': System.out.println("you have added both Antivirus and Printer to your purchase");
                      System.out.println("Total cost will be " + (newPrice=antiVirus+printer+initialPrice)); break;

            case 'D': System.out.println("Your total cost is " + initialPrice);

            default:  System.out.println("such option does not exist");
        }

        System.out.println("Thank You for your Patronage");


    }
}