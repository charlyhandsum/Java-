public class InnerClass {
    public static void main(String[] args) {

        class CheckableBankAccount extends BankAccount implements Checkable {

            // creating the constructor for this class
            public CheckableBankAccount(String numberIn, String nameIn, double balance) {
                super(numberIn, nameIn);
                this.balance = balance;
            }

            // Implementing the method from Checkable
            @Override
            public boolean check() {
                if (getAccountNumber().length() == 8) {
                    return true;
                }
                return false;
            }
        }


        CheckableBankAccount bank1 = new CheckableBankAccount("324374682", "Charles E.", 230000);
        CheckableBankAccount bank2 = new CheckableBankAccount("32437468", "Virtue E.", 20000);

        System.out.println("Bank 1 is " + checkVailidity(bank1));
        System.out.println("Bank 2 is " + checkVailidity(bank2));


    }

    public static String checkVailidity(Checkable bankIn) {
        if (bankIn.check() == true) {
            return ("is valid");
        } else {
            return ("is Invalid");
        }
    }
}