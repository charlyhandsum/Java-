public class CheckableBankAccount extends BankAccount implements Checkable {


    public CheckableBankAccount(String numberIn, String nameIn) {
        super(numberIn, nameIn);
    }

    @Override
    public boolean check() {
        if (getAccountNumber().length() != 8) {
            return false;
        }

        for (int i = 0; i < getAccountNumber().length(); i++) {
            if (!Character.isDigit(getAccountNumber().charAt(i))){
                return false;
            }
        }
        return true;
    }
}
