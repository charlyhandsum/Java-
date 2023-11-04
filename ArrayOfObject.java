
public class ArrayOfObject {
    public static void main(String[] args){

        // Creating a reference for the bank accounts
        BankAccount[] myAccounts = new BankAccount[3];

        // Creating the Objects of BankAccount Class
        myAccounts[0] = new BankAccount("8180133296", "Charles Ebong");
        myAccounts[1] = new BankAccount("0956797099", "Oddy Bassey");
        myAccounts[2] = new BankAccount("8099665445", "Thomas Sean");

       /* // Performing operations on Bank Accounts
        myAccounts[0].deposit(3000);

        myAccounts[1].deposit(1500);

        myAccounts[2].deposit(1000);*/

        // Showing details on the Bank Accounts
        for (int i = 0; i < myAccounts.length; i++)
        {
            System.out.println("Account Name: " + myAccounts[i].getAccountName());
            System.out.println("Account Number: " + myAccounts[i].getAccountNumber());
            System.out.println("Account Balance: " + myAccounts[i].getBalance());
            System.out.println();
        }

    }
}

