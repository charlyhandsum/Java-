public class AnonymousClass2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("01587375011", "");

        Checkable checkableAccout = new Checkable() {
            @Override
            public boolean check() {
                if (account.getAccountNumber().length() != 11) {
                    return false;
                }
                return true;
            }
        };

        Checkable checkableAccount2 = new Checkable() {
            @Override
            public boolean check() {
                if (!account.getAccountName().isEmpty()) {
                    return true;
                }
                return false;
            }
        };

        System.out.println("Account " + checkValidity(checkableAccout));
        System.out.println("Account " + checkValidity(checkableAccount2));
    }

        public static String checkValidity(Checkable accountIn){
            if (accountIn.check()){
                return "is Valid";
            }
            return "is Invalid";
        }
    }
