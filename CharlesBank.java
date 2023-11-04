import java.util.Scanner;

public class CharlesBank {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int reply;
        do {
            System.out.println("*** WELCOME TO CHARLES BANK ***");
            System.out.println();
            System.out.println("Would you like to open an account with us? (yes or no)");
            System.out.println("reply 1 for [Yes] and 2 for [No]");
            reply = keyboard.nextInt();

            if (reply == 1) {
                System.out.println("Enter you first name: ");
                String firstName = keyboard.next();
                System.out.println("Welcome " + firstName);
                System.out.println("Here are our accounts and annual interest rates");
                System.out.println("(1) A Savings account offers an interest of 1.5% ");
                System.out.println("(2) B Savings account offers an interest of 2.0% ");
                System.out.println("(3) C Savings account offers an interest of 1.5% ");
                System.out.println("(4) X Savings account offers an interest of 5.0% ");
                System.out.println();
                System.out.println("Enter from option (1-4) to select an account ");
                int reply2 = keyboard.nextInt();

                switch (reply2) {
                    case 1:
                        System.out.println("you selected the A account which offers 1.5% interest annually");
                        System.out.println("Enter an amount: ");
                        double amount = keyboard.nextDouble();
                        if (amount >= 250) {
                            System.out.println();
                            System.out.println("This will be your Annual Interest for this amount");
                            double interest;
                            interest = ((amount * 1.5 * 1) / 100);
                            System.out.println("interest =" + interest);
                            System.out.println("Total Amount = Principal + Interest");
                            System.out.println("= " + (amount + interest));
                            System.out.println();
                            System.out.println("Thank you for banking with us !!!");
                            break;
                        } else {
                            System.out.println("Interest will not be applied since your deposit is less than 250.00 ");
                            ;
                            break;
                        }

                    case 2:
                        System.out.println("you selected the B account which offers 2.0% interest annually");
                        System.out.println("Enter an amount: ");
                        double amount1 = keyboard.nextDouble();
                        System.out.println();
                        System.out.println("This will be your Annual Interest for this amount");
                        double interest1;
                        interest1 = ((amount1 * 2.0 * 1) / 100);
                        System.out.println("interest =" + interest1);
                        System.out.println("Total Amount to be returned = " + (amount1 + interest1));
                        System.out.println();
                        System.out.println("Thank you for banking with us !!!");
                        break;

                    case 3:
                        System.out.println("you selected the C account which offers 1.5% interest annually");
                        System.out.println("Enter an amount: ");
                        double amount2 = keyboard.nextDouble();
                        System.out.println();
                        System.out.println("This will be your Annual Interest for this amount");
                        double interest2;
                        interest2 = ((amount2 * 1.5 * 1) / 100);
                        System.out.println("interest =" + interest2);
                        System.out.println("Total Amount = Principal + Interest");
                        System.out.println("= " + (amount2 + interest2));
                        System.out.println();
                        System.out.println("Thank you for banking with us !!!");
                        break;

                    case 4:
                        System.out.println("you selected the X account which offers 5.0% interest annually");
                        System.out.println("Enter an amount: ");
                        double amount3 = keyboard.nextInt();
                        System.out.println();
                        System.out.println("This will be your Annual Interest for this amount");
                        double interest3;
                        interest3 = ((double) (amount3 * 5 * 1) / 100);
                        System.out.println("interest = " + interest3);
                        System.out.println("Total Amount = Principal + Interest");
                        System.out.println("= " + (amount3 + interest3));
                        System.out.println();
                        System.out.println("Thank you for banking with us !!!");
                        break;

                    default:
                        System.out.println("No such option, please select (1-4)");
                }
                System.out.println();
                System.out.println("would you like to go again??? (y or n)");
                reply = keyboard.next().charAt(0);
                System.out.println();
            } else {
                System.out.println("Proceed to our nearest branch if you would like to speak to someone, Thank You !!!");
            }
        } while (reply == 'y' || reply == 'Y');

    }
}
