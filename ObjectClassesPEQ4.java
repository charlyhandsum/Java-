public class ObjectClassesPEQ4 {
    public static void main(String[] args) {
      /*  . Design and implement a program that performs in the following way:
            • When the program starts, two bank accounts are created, using names and
                    numbers which are written into the code;
            • The user is then asked to enter an account number, followed by an amount to
                    deposit in that account;
            • The balance of the appropriate account is then updated accordingly—or if an
                    incorrect account number was entered a message to this effect is displayed;
            • The user is then asked if he or she wishes to make more deposits;
            • If the user answers does wish to make more deposits, the process continues;
            • If the user does not wish to make more deposits, then details of both accounts
              (account number, account name and balance) are displayed.*/

        // creating an array reference for 2 bank account object
        BankAccount[] account = new BankAccount[2];

        // Creating the 2 bank accounts to be stored in the array reference
        account[0] = new BankAccount("3077351859", "Charles Ebong");
        account[1] = new BankAccount("0158737501", "Virtue Felix");

        System.out.println("*** WELCOME TO CHARLIE BANK ***");
        // Prompting the user for an account number
        int reply;
        do {
            System.out.println("Enter account number: ");
            String accountNumber = EasyScanner.nextString();

            if (accountNumber.equals(account[0].getAccountNumber())) {
                System.out.println("Hello " + account[0].getAccountName() + ", Welcome !!!");
                System.out.println();
                // Prompting user to input deposit amount
                System.out.println("Enter deposit amount: ");
                double depositIn = EasyScanner.nextDouble();
                // adding deposit amount to balance
                account[0].deposit(depositIn);
                System.out.println("DEPOSIT SUCCESSFUL !!!");
                System.out.println("new balance: " + account[0].getBalance());
                System.out.println();

            } else if (accountNumber.equals(account[1].getAccountNumber())) {
                System.out.println("Hello " + account[1].getAccountName() + ", Welcome !!!");
                System.out.println();
                // Prompting user to input deposit amount
                System.out.println("Enter deposit amount: ");
                double depositIn = EasyScanner.nextDouble();
                // adding deposit amount to balance
                account[1].deposit(depositIn);
                System.out.println("DEPOSIT SUCCESSFUL !!!");
                System.out.println("new balance: " + account[1].getBalance());
                System.out.println();

            } else {
                System.out.println("INVALID ACCOUNT NUMBER");
            }

            System.out.println("Do you wish to make more deposits?");
            System.out.println("Enter 1 for 'YES' and 2 for 'NO'");
            reply = EasyScanner.nextInt();
        } while (reply != 2);

        for (int row = 0; row < account.length; row++) {
            System.out.println("Account Name: " + account[row].getAccountName());
            System.out.println("Account Number: " + account[row].getAccountNumber());
            System.out.println("Balance: " + account[row].getBalance());
            System.out.println();
        }
    }
 }
