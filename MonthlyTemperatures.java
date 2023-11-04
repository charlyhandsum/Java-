import java.util.Scanner;

public class MonthlyTemperatures
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char choice;
        double[][] temperature = new double[4][2];
        {
            do {
                System.out.println();
                System.out.println("[1] Enter temperatures");
                System.out.println("[2] Display all");
                System.out.println("[3] Display one week");
                System.out.println("[4] Display day of the week");
                System.out.println("[5] Display day with the maximum temperature");
                System.out.println("[6] Exit");
                System.out.print("Enter choice [1-6]: ");
                choice = keyboard.next().charAt(0);
                System.out.println();

                switch (choice) {
                    case '1': enterTemps(temperature);
                              break;
                    case '2': displayAllTemps(temperature);
                              break;
                    case '3': displayWeek(temperature);
                              break;
                    case '4': displayDays(temperature);
                              break;
                    case '5': System.out.println(getMax(temperature));
                              break;
                    case '6': System.out.println("Goodbye");
                              break;
                    default:  System.out.println("ERROR: options 1-5 only!");
                }
            } while (choice != '5');
        }
    }

    // method to enter temperatures in a 2D array requires a nested loop
    static void enterTemps(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        // the outer loop controls the week number
        for (int week = 1; week <= temperatureIn.length; week++)
        {
            // the inner loop controls the day number
            for (int day = 1; day <= temperatureIn[0].length; day++)
                {
                    System.out.println("enter temperature for week " + (week) + " and day " + (day));
                    temperatureIn[week-1][day-1] = keyboard.nextDouble();
                }
            }
        }

        //method to display all temperatures in the 2D array requires a nested loop
        static void displayAllTemps(double[][] temperatureIn){
            System.out.println();
            System.out.println("***TEMPERATURES ENTERED***");
            for (int week = 1; week <= temperatureIn.length; week++)
            {
                for (int day = 1; day <= temperatureIn[0].length; day++)
                {
                    System.out.println("week " + week + " day " + day + ": " + temperatureIn[week-1][day-1]);
                }
            }
        }

        // method to display temperature for a single week requires a single loop
        static void displayWeek(double[][] temperatureIn) {
            Scanner keyboard = new Scanner (System.in);
            int week;
            //Enter week number
            System.out.print("Enter week number, choose from (1-4): ");
            week = keyboard.nextInt();
            // Input validation: week number should be between 1 and 4
            while (week<1 || week > 4)
            {
                System.out.println("Invalid week number!!");
                System.out.print("Enter again choose from (1-4 only): ");
                week = keyboard.nextInt();
            }
            // display temperature for given week
            System.out.println();
            System.out.println("***TEMPERATURES ENTERED FOR WEEK "+week+"***");
            System.out.println();
            // week number is fixed so loop is required to process day only
            for (int day = 1; day <= temperatureIn[0].length; day++)
            {
                System.out.println("week "+week+" day "+day+": "+ temperatureIn[week-1][day-1]);

            }
    }

   // method to display temperature for a single day of each week requires using a single loop
    static void displayDays(double[][] temperatureIn)
    {
        Scanner keyboard = new Scanner (System.in);
        int day;
        // enter day number
        System.out.print("Enter day number (1-7): ");
        day = keyboard.nextInt();
        // input validation: day number should be between 1 and 7
        while (day<1 || day > 7)
            {
                System.out.println("Invalid day number!!");
                System.out.print("Enter again (1-7 only): ");
                day = keyboard.nextInt();
            }
            // display temperature for the given day of the week
                System.out.println();
                System.out.println("***TEMPERATURES ENTERED FOR DAY "+day+"***");
                System.out.println();
                // day number is fixed so loop required to process week number only
                    for (int week = 1; week <= temperatureIn.length; week++)
                    {
                        System.out.println("week "+week+" day "+day+": " + temperatureIn[week-1][day-1]);
                    }
    }
   /* Consider the MonthlyTemperatures program of Sect. 6.9.4. Write an
    additional method, max, that returns the maximum temperature recorded in the
    given two-dimensional array.
    Hint: look back at the algorithm for finding the maximum value in a one dimensional array*/
    static double getMax(double[][] temperatureIn){
    // writing the first loop which will deal with the weeks
        double maxNumber = temperatureIn[0][0];
        for (int week = 0; week < temperatureIn.length; week++)
        {
        // dealing with the days (searching all 28 days for highest value)
            for (int day = 0; day < temperatureIn[0].length; day++)
            {
                if (temperatureIn[week][day]>maxNumber)
                {
                    maxNumber = temperatureIn[week][day];
                }
            }
        }
        return maxNumber;

    }
}