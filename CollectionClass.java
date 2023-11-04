import java.util.ArrayList;
public class CollectionClass {
    ArrayList<BankAccount>bankList = new ArrayList<>();

    private int search (String accountNumIn){
        //creating a loop to go through the list
        for (int i = 0; i < bankList.size(); i++) {
            BankAccount firstAccount = bankList.get(i);
            String accountNumber = firstAccount.getAccountNumber();
            if (accountNumber.equals(accountNumIn)){
                return (i);
            }
        }
        return -999;
    }

    public int getTotal (){
        return bankList.size();
    }

    public BankAccount getItem(String accountIn){
        int index = search(accountIn);
        if (index != -999){
            return bankList.get(index);
        }else {
            return null;
        }
    }

    public boolean addAccount(String accNumIn, String accNameIn){
        if (search(accNumIn)!= -999){
            bankList.add(new BankAccount(accNumIn, accNameIn));
            return true;
        } else {
            return false;
        }
    }

    public boolean depositMoney(String accountNumIn, double amountIn) {
        int InputtedAccount = search(accountNumIn);
        if (InputtedAccount != -999) {
            bankList.get(InputtedAccount).deposit(amountIn);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean withdrawMoney(String acctNumIn, double amountIn){
        BankAccount inputtedAcc = getItem(acctNumIn);
        if (inputtedAcc != null && inputtedAcc.getBalance() >= amountIn){
            inputtedAcc.withdraw(amountIn);
            return true;
        }else {
            return false;
        }
    }

   public boolean removeAccount(String accountIn){
       int index = search(accountIn);
       if (index != 999){
           bankList.remove(index);
           return true;
       } else {
           return false;
       }
   }
}
