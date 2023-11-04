import java.util.Scanner;

public class StringComparisonIgnoreCase
    {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            String string1, string2;

// get two strings from the user
            System.out.print("Enter a String: ");
            string1 = keyboard.next().trim();
            System.out.print("Enter another String: ");
            string2 = keyboard.next().trim();
// compare the strings
            boolean comparison = (string1.equalsIgnoreCase(string2));
            if(comparison) // compareTo returned a negative number
            {
                System.out.println("The strings are identical");
            }
            else {
                System.out.println("The Strings are not identical");
            }

/*      (a) Rewrite the program so that it ignores case;
        (b) Rewrite the program, using the equals method, so that all it does is to test
        whether the two strings are the same;
        (c) Repeat (b) using the equalsIgnoreCase method;
        (d) Use the trim method so that the program ignores leading or trailing spaces*/
        }
    }
