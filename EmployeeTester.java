public class EmployeeTester {
    public static void main(String[] args) {

    BankAccount acc = new BankAccount("0072648933", "Charles Ebong");

        System.out.println(acc.toString());
       /* PartTimeEmployee two = new PartTimeEmployee("003","Ferdinand Dante", 1050);
        FullTimeEmployee three = new FullTimeEmployee("005", "Charles Ebong", 830000);

        System.out.println("PartTimeEmployee Details");
        System.out.println("Employee name: " + two.getName());
        System.out.println("Employee number: " + two.getNumber());
        two.setHourlyPay(280);
        System.out.println("Hourly pay: " + two.getHourlyPay());
        System.out.println("Pay for hours worked = " + two.calculateWeeklyPay(40));
        TestStatus(two);
        System.out.println();

        System.out.println("FullTimeEmployee Details");
        System.out.println("Employee name: " + three.getName());
        System.out.println("Employee number: " + three.getNumber());
        three.getAnnualSalary();
        System.out.println("Monthly pay: " + three.calculateMonthlyPay());
        TestStatus(three);
        System.out.println();

        GoldAccount gc = new GoldAccount("0354271293", "mmyene obo", 700);
        gc.deposit(1000);

       if (gc.withdraw(1500)){
           System.out.println("Money withdrawn successfully");
        } else {
           System.out.println("Insufficient funds");
       }

        System.out.println("Balance: "+ gc.getBalance());
    }

    static void TestStatus(Employee employeeIn){
        System.out.println("He/She works "+ employeeIn.getStatus());
    }

*/
    }
}