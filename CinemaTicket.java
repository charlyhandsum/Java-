import java.util.Scanner;

    public class CinemaTicket
    {
        public static void main(String[] args)
        {
            double price = 10.00;
            double newPrice;
            int age;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter your age: ");
            age = keyboard.nextInt();
// code to reduce ticket price for children goes here
            if (age <= 14){
                System.out.println("We share pay half of your ticket cost since you are under 14yrs od age");
                newPrice = (price * 0.5);
                System.out.println("Ticket price = " + newPrice);
            }
            else {
                System.out.println("Ticket price = " + price);
            }
            System.out.println("Thank you for coming, Enjoy !!!");
        }
    }
