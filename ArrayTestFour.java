import java.util.Scanner;

public class ArrayTestFour {
    public static void main(String[] args)
    {
     /*int [] studentScore = enterExamMarks();
        System.out.println();
        System.out.println("** INCREASE SCORES BY 5 **");
        increaseMark(studentScore);
        System.out.println();
        System.out.println("Did all students pass? True = YES and False = N0");
        System.out.println(allHavePassed(studentScore));*/

        System.out.println(contains(5, 31, 15, 23, 5, 14));

    }
/*    This array is to be used to store a list of student exam marks. Now, for each of
    the following methods, write the code for the given method and the instruction
    in main to call this method:
            (a) A method, enterExamMarks, that prompts the user to enter some exam
                marks (as integers), stores the marks in an array and then returns this array.
            (b) A method, increaseMarks, that accepts an array of exam marks and
                increases each mark by 5.
            (c) A method, allHavePassed, that accepts an array of exam marks and
                returns true if all marks are greater than or equal to 40, and false otherwise.*/

    static int[] enterExamMarks(){
        System.out.println("RESULT SHEET");
        int[] examMarks;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int number = keyboard.nextInt();
        examMarks = new int [number];
        // storing the scores in the array
        for (int i = 0; i < examMarks.length; i++) {
            System.out.println("Enter mark of Student "+ (i+1));
            examMarks[i] = keyboard.nextInt();
        }
        return examMarks;
    }

     /* A method, increaseMarks, that accepts an array of exam marks and
    increases each mark by 5.*/
    static void increaseMark(int[] examMarks){
        for (int i = 0; i < examMarks.length; i++)
        {
            int addMark;
            addMark = 5;

            System.out.println("total mark for Student " + (1+i)+" = " + (examMarks[i] + addMark));
        }
    }

    /*A method, allHavePassed, that accepts an array of exam marks and
    returns true if all marks are greater than or equal to 40, and false otherwise.*/
    static boolean allHavePassed(int[] examMarks){
        for (int i = 0; i < examMarks.length; i++)
        {
            int passMark = 40;
            if (examMarks[i] < passMark)
            {
                return false;
            }
        }
        return true;
    }

    static boolean contains(int valueIn, int ... arrayIn) {
// enhanced 'for' loop used here
        for (int currentElement : arrayIn)
        {
            if (currentElement == valueIn)
            {
                return true; // exit loop early if value found
            }
        }
        return false; // value not present
    }
}
