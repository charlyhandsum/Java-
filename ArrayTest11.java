import java.util.Scanner;

public class ArrayTest11 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Creating a ragged array
        int [][] triangle = new int[4][];
        triangle [0] = new int[1];
        triangle [1] = new int[2];
        triangle [2] = new int[3];
        triangle [3] = new int[4];

        enterNumbers(triangle);
        displayNumbers(triangle);
    }

    static void enterNumbers(int[][] arrayIn){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** RAGGED ARRAY ***");
        System.out.println();
        // Looping through the rows
        for (int row = 0; row < arrayIn.length; row++) {
            // Looping through the columns
            for (int column = 0; column < arrayIn[row].length; column++) {
                System.out.println("enter value for row " + (row+1) + ", column " + (column+1) + ":" );
                arrayIn[row][column] = keyboard.nextInt();

            }
        }
    }

    static void displayNumbers(int[][] arrayIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** RAGGED ARRAY DISPLAY ***");
        System.out.println();
        // Looping through the rows
        for (int[] ints : arrayIn) {
            // Looping through the columns
            for (int column = 0; column < ints.length; column++) {
                System.out.print(ints[column] + " ");
            }
            System.out.println();
        }
    }
}
