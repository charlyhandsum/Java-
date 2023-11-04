public class GoldAccount extends BankAccount {
    private double overdraftLimit;

    public GoldAccount(String number, String name, double overdraftLimit){
        super(number, name);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    @Override
    public boolean withdraw(double amountIn){
        if (amountIn < (balance + overdraftLimit)){
            balance = balance - amountIn;
            return true;
        }
        return false;
    }


}
