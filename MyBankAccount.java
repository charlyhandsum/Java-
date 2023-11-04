public class MyBankAccount {
    public static void main(String[] args){

        System.out.println("*** MY BANK ACCOUNT PROGRAM ***");
        System.out.println();
        // Creating an object of BankAccount Class
        BankAccount myAccount = new BankAccount("81801332", "Charles Ebong");

        // Returning the account name on the screen
        System.out.println("Account Name: " + myAccount.getAccountName());

        // Returning the account number on the screen
        System.out.println("Account Number: " + myAccount.getAccountNumber());

        // Making a Deposit
        System.out.println();
        System.out.println("Make a deposit");
        System.out.println("Enter amount: ");
        double amountIn = EasyScanner.nextDouble();
        myAccount.deposit(amountIn);

        // Showing new account balance
        System.out.println();
        System.out.println("new account balance = " + myAccount.getBalance());

        // Make a withdrawal
        System.out.println();
        System.out.println("Enter withdrawal amount: ");
        double withdrawalAmount = EasyScanner.nextDouble();

        myAccount.withdraw(withdrawalAmount);

        System.out.println("Available Balance: " + myAccount.getBalance());
    }
}
