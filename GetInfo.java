import java.util.Scanner;

public class GetInfo {
    public static void main(String[] args){
        // Creating an object of Scanner
       Scanner Input = new Scanner(System.in);

       // Taking Input from User
        System.out.println("Your Name : ");
        String fullname = Input.next();

        System.out.println("Your Nationality : ");
        String Nationality = Input.next();

        System.out.println("Your Age : ");
        int Age = Input.nextInt();

        System.out.println("Your Weight : ");
        float Weight = Input.nextFloat();

        System.out.println("Your Grade : ");
        char Grade = Input.next().charAt(0);

        Input.close ();


        System.out.println("Name :" + fullname);
        System.out.println("Nationality :" + Nationality);
        System.out.println("Age :" + Age);
        System.out.println("Weight :" + Weight);
        System.out.println("Grade :" + Grade);
    }
}
