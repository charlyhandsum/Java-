import java.util.Scanner;

public class ArrayTest10 {
    public static void main(String[] args){

        char[][] magicSquare = new char[4][4];
        enterLetters(magicSquare);
        System.out.println();
        displayRow(magicSquare);
        System.out.println();
        displayColumn(magicSquare);
    }
    static void enterLetters(char[][] magicSquare){
        System.out.println("***** MAGIC SQUARE WORD *****");
        Scanner keyboard = new Scanner(System.in);
        for (int row = 0; row < magicSquare.length; row++) {
            for (int column = 0; column < magicSquare[0].length; column++) {
                System.out.println("enter letter you wish to store in row " + (row+1)+", column" + (column+1) + ":");
                magicSquare[row][column] = keyboard.next().charAt(0);
            }

        }
    }
   static void displayRow(char[][] magicSquare){
        //asking user for row number so that the word on the row would be displayed
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter row number to display word on row: ");
       int rowNumber = keyboard.nextInt();

       // Input validation: row number should be between 1 and 4
       while (rowNumber < 1 || rowNumber > 4)
       {
           System.out.println("Invalid row number!!");
           System.out.print("Enter again choose from (1-4 only): ");
           rowNumber = keyboard.nextInt();
       }
       System.out.println();
       System.out.println("*** WORD EMBEDDED IN ROW " +(rowNumber)+" ***");
       //since row number has been defined, we will create a loop for the column
       for (int column = 1; column <= magicSquare[0].length; column++)
       {
           System.out.print(magicSquare[rowNumber-1][column-1]);
           System.out.println();
       }

   }

    static void displayColumn(char[][] magicSquare){
        //asking user for row number so that the word on the row would be displayed
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter column number to display word on column: ");
        int columnNumber = keyboard.nextInt();

        // Input validation: column number should be between 1 and 4
        while (columnNumber < 1 || columnNumber > 4)
        {
            System.out.println("Invalid column number!!");
            System.out.print("Enter again choose from (1-4 only): ");
            columnNumber = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("*** WORD EMBEDDED IN COLUMN " +(columnNumber)+" ***");
        //since column number has been defined, we will create a loop for row
        for (int row = 1; row <= magicSquare.length; row++)
        {
            System.out.print(magicSquare[row-1][columnNumber-1]);
        }

    }
}
