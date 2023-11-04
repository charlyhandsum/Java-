/* This program attempts to swap the value of two variables - it doesn't give the desired 
result however! */

import java.util.Scanner;
public class SwapValues
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
// declare variables
        int x, y;
// enter values
        System.out.print("Enter value for x ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y ");
        y = keyboard.nextInt();

//display results
        System.out.println("x = " + y);
        System.out.println("y = " + x);
    }
}