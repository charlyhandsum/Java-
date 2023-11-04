import java.util.Scanner;

public class FindCostInput {
    public static void main (String[] args){

        Scanner Keyboard = new Scanner(System.in);

        System.out.println("*** Receipt ***");
        System.out.println("Enter Price of Item : ");
        double Price = Keyboard.nextDouble();

        System.out.println("Enter VAT rate");
        double VAT = Keyboard.nextDouble();

        Keyboard.close();

        double FinalPrice = (Price + (Price * VAT/100));

        System.out.println("Final Cost after VAT is :" + FinalPrice);
    }
}
