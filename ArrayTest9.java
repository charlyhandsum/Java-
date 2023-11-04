import java.util.Scanner;

public class ArrayTest9 {
    public static void main (String[] args) {

        /*Consider an application that records the punctuality of trains on a certain route.
        (a) Declare a 2D array, late, to hold the number of times a train on this route
        was late for each day of the week, and for each week of the year.
        (b) Write a fragment of code that adds up the total number of days in the year
        when a train was late more than twice in a given day.*/

        int [][] late = new int[53][7];
        enterLateDays(late);
        System.out.println(totalLate(late));

    }

    static void enterLateDays(int[][] lateIn)
    {
        //creating a loop to control the weeks of the year
        for (int week = 0; week < lateIn.length; week++)
        {
            for (int day = 0; day < lateIn[0].length; day++)
            {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("enter the No of time train had been late for Week "+ (week+1)+","+" Day "+(day+1));
                lateIn[week][day] = keyboard.nextInt();
            }
        }

    }
    static int totalLate(int[][] lateIn){
        //starting with implementing my loop to control the months of the year
        int total = 0;
        for (int weeks = 0; weeks < lateIn.length; weeks++)
        {
            // creating a loop to control the days of the week
            for (int day = 0; day < lateIn[0].length; day++)
            {
                total = total + lateIn[weeks][day];
            }

        }
        return total;
    }
}
