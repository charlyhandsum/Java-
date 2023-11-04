public class salesTax {
    public static void main(String[] args){
//        a calculation to work out the price of a product after a sales tax as been added.
//        If the initial price of the product is 500 and the rate of sales tax is  17.5%

        double priceOfGood = 500, Tax;
        double finalPrice;
        final double governmentRequest = 17.5;

        Tax = (priceOfGood * (governmentRequest/100));
        finalPrice = (priceOfGood + Tax);

        System.out.println("**** Product Price Check ****");
        System.out.println("Cost after tax = " + finalPrice);
        System.out.println("thank you and come again next time");


    }
}
