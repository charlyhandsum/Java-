public class MyOwnBankClass {
     private String accountName;

     private String accountNumber;

     private double balance;


    public MyOwnBankClass (String accountNumIn, String accountNameIn){
        accountName = accountNameIn;
        accountNumber = accountNumIn;
        balance = 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amountIn){
        balance = balance + amountIn;
    }

    public boolean withdraw(double amountIn){
        if (amountIn>balance){
            return false;
        } else {
            balance = balance - amountIn;
            return true;
        }
    }
}
