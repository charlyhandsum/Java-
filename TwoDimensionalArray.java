import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){

        double [][] Temperature = new double[4][7];

        GetValues(Temperature);
      /*  DisplayTemp(Temperature);
        DisplayTempWeek(Temperature);*/
        DisplayTempDay(Temperature);
    }

    static void GetValues(double[][] tempIn){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** MONTHLY TEMPERATURE RECORDER ***");
        for (int week = 0; week < tempIn.length; week++)
        {
            for (int day = 0; day < tempIn[0].length; day++)
            {
                System.out.println("Enter temperature for Week "+(week+1)+ "," +"day " + (day+1));
                tempIn[week][day] = keyboard.nextDouble();
                System.out.println();
            }

        }
    }


    static void DisplayTemp(double [][] tempIn) {
        // the outer loop controls the week row
        System.out.println("*** MONTHLY TEMPERATURE RESULT ***");
        for (int week = 0; week < tempIn.length; week++) {
            // the inner loop controls the day column
            for (int day = 0; day < tempIn[0].length; day++) {

                System.out.println("week " + (week + 1) + ", day " + (day + 1) + "= " + tempIn[week][day]);
            }
        }
    }

        public static void DisplayTempWeek ( double[][] tempIn){
            System.out.println("Enter Week: ");
            Scanner keyboard = new Scanner(System.in);
            int week = keyboard.nextInt();
            week = week - 1;

            System.out.println("*** WEEKLY TEMPERATURE RESULT ***");

            for (int day = 0; day < tempIn[0].length; day++) {
                System.out.println("week " + (week + 1) + ", day " + (day + 1) + "= " + tempIn[week][day]);
            }
        }

    public static void DisplayTempDay ( double[][] tempIn){
        System.out.println("Enter Day: ");
        Scanner keyboard = new Scanner(System.in);
        int day = keyboard.nextInt();
        day = day - 1;

        System.out.println("*** DAILY TEMPERATURE RESULT ***");

        for (int week = 0; day < tempIn.length; week++) {
            System.out.println("week " + (week + 1) + ", day " + (day + 1) + "= " + tempIn[week][day]);
        }
    }

    }

