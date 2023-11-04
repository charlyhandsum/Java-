import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int numInput;
        System.out.println("*** Even numbers from 1 to User Specified Input ***");
        System.out.println();
        System.out.println("Enter number : ");
        numInput = keyboard.nextInt();

        for(int i=1; i <= numInput; i++) // loop through the numbers 10 down to 1
        {
// body of the loop contains in ‘if’ statement
            if (i%2 == 0) // check if number is even
            {
                System.out.println(i + " is even"); // number displayed only when it is checked to be even
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}