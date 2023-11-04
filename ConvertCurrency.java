import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** Welcome to Charly FX ***");
        
        int reply;
        double amountIn = 0;
        double rateIn = 0;
        double result = 0;
        char reply2;

        do {
            System.out.println();
            amountIn = EnterSum();
            rateIn = EnterRate();
            result = Conversion(amountIn, rateIn);
            System.out.println("you will be receiving $" + result);
            System.out.println();
            System.out.println("will you like to run the program again?");
            System.out.println("Enter Y for 'Yes' and 'N, for No ");
            reply2 = keyboard.next().charAt(0);
        } while (reply2 == 'y' || reply2 == 'Y');

    }
    static Scanner keyboard = new Scanner(System.in);
    static double EnterRate() {
        System.out.println("Enter an exchange rate: ");
        return keyboard.nextDouble();

    }
    static double EnterSum() {
        System.out.println("Enter an amount: ");
        return keyboard.nextDouble();
    }

    static double Conversion(double amount, double rate){
        return (amount/rate);
    }
}

