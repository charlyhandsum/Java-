public class ClassesObjectTest {
    public static void main(String[] args){

    /* (a) Write the code that will create two BankAccount objects, acc1 and
            acc2. The account number and account name of each should be set at the
               time the object is created.
            (b) Write the lines of code that will deposit an amount of 200 into acc1 and
                100 into acc2.
            (c) Write the lines of code that attempt to withdraw an amount of 150 from
                acc1 and displays the message “WITHDRAWAL SUCCESSFUL” if the
                amount was withdrawn successfully and “INSUFFICIENT FUNDS” if it was not.
            (d) Write a line of code that will display the balance of acc1.
            (e) Write a line of code that will display the balance of acc2.*/

    // creating a BankAccount Reference using ArrayList Collection Class
    BankAccount[] myAccount = new BankAccount[2];
    String numberIn;
    String nameIn;

    // setting Account Number and name
        // Creating Bank Account
        System.out.println("*** CREATE ACCOUNT ***");
        for (int row = 0; row < myAccount.length; row++) {
        System.out.println("enter account number: ");
        numberIn = EasyScanner.nextString();

        System.out.println("enter account name: ");
        nameIn = EasyScanner.nextString();

        myAccount[row] = new BankAccount(numberIn, nameIn);
            System.out.println();
    }
        // Displaying the Accounts Created
        System.out.println("ACCOUNTS CREATED");
        for (int row = 0; row < myAccount.length; row++) {
            System.out.println("Account Name: " + myAccount[row].getAccountName());
            System.out.println("Account Number: " + myAccount[row].getAccountNumber());
            System.out.println("Balance: " + myAccount[row].getBalance());
            System.out.println();
        }

      // depositing money into Acct 1 and Acct 2
        System.out.println("DEPOSIT");
        System.out.println("Enter 1 or 2 to select an account you want to deposit into");
        System.out.println("1. " + myAccount[0].getAccountName());
        System.out.println("2. " + myAccount[1].getAccountName());
        System.out.println();
        int reply = EasyScanner.nextInt();

        if (reply == 1){
            System.out.println("Enter deposit amount: ");
            double depositAmount = EasyScanner.nextDouble();

            myAccount[0].deposit(depositAmount);
            System.out.println("DEPOSIT SUCCESSFUL");
            System.out.println();
        } else if (reply == 2)
        {
            System.out.println("Enter deposit amount: ");
            double depositAmount = EasyScanner.nextDouble();

            myAccount[1].deposit(depositAmount);
            System.out.println("DEPOSIT SUCCESSFUL");
            System.out.println();
        }

        // Withdrawing
        System.out.println("WITHDRAWAL");
        System.out.println("choose account to withdraw from");
        System.out.println("1. " + myAccount[0].getAccountName());
        System.out.println("2. " + myAccount[1].getAccountName());
        System.out.println();
        int reply1 = EasyScanner.nextInt();

        if (reply1 == 1){
            boolean ok;
            System.out.println("Welcome " + myAccount[0].getAccountName());
            System.out.println("Enter withdrawal amount: ");
            double withdrawalAmount = EasyScanner.nextDouble();

            ok = myAccount[0].withdraw(withdrawalAmount);
            if (ok){
                System.out.println("WITHDRAWAL SUCCESSFUL");
            }else {
                System.out.println("INSUFFICIENT FUNDS");
            }
            System.out.println("WITHDRAW SUCCESSFUL");
            System.out.println();

            // Showing the balance
            reply1 = reply - 1;
            System.out.println("Account Name: " + myAccount[reply1].getAccountName());
            System.out.println("Account Number: " + myAccount[reply1].getAccountNumber());
            System.out.println("Balance: " + myAccount[reply1].getBalance());
        }
        else if (reply1 == 2)
        {
            boolean ok;
            System.out.println("Welcome" + myAccount[1].getAccountName());
            System.out.println("Enter withdrawal amount: ");
            double withdrawalAmount = EasyScanner.nextDouble();

            ok = myAccount[0].withdraw(withdrawalAmount);
            if (ok){
                System.out.println("WITHDRAWAL SUCCESSFUL");
            }else {
                System.out.println("INSUFFICIENT FUNDS");
            }
            System.out.println("WITHDRAW SUCCESSFUL");

            // Showing the balance
            reply1 = 1;
            System.out.println("Account Name: " + myAccount[reply1].getAccountName());
            System.out.println("Account Number: " + myAccount[reply1].getAccountNumber());
            System.out.println("Balance: " + myAccount[reply1].getBalance());
        }

    }
}
