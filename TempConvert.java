import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args){

        /*Write a menu-driven program that provides three options:
        • the first option allows the user to enter a temperature in Celsius and displays
          the corresponding Fahrenheit temperature;
        • the second option allows the user to enter a temperature in Fahrenheit and
          displays the corresponding Celsius temperature;
        • the third option allows the user to quit.*/
        int reply;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** TEMPERATURE CONVERTER ***");
        do {
            System.out.println();
            System.out.println("choose an option");
            System.out.println("1. convert from Celsius to Fahrenheit");
            System.out.println("2. convert from Fahrenheit to Celsius");
            System.out.println("3. quit this Program");
            System.out.println();

            reply = keyboard.nextInt();

            /*Adapt the program so that the user is not allowed to
            enter a temperature below absolute zero; this is −273.15C, or −459.67F.*/

            if (reply == 1) {
                System.out.println("Temperature should not be below absolute zero (i.e −273.15C)");
                System.out.println("Enter Celsius temperature: ");
                double CelsiusIn = keyboard.nextDouble();
                while (CelsiusIn < -273.15){
                    System.out.println("Temperature is below absolute temperature");
                    System.out.println("Enter Celsius temperature: ");
                    CelsiusIn = keyboard.nextDouble();
                }
                if (CelsiusIn > -273.15) {
                    System.out.println("Temperature in Fahrenheit = " + CtoFahrenheit(CelsiusIn));
                }
            } else if (reply == 2) {
                System.out.println("Temperature should not be below absolute zero (i.e −459.67F)");
                System.out.println("Enter Fahrenheit temperature: ");
                double FahrenheitIn = keyboard.nextDouble();
                while (FahrenheitIn < -459.67){
                    System.out.println("Temperature is below absolute temperature");
                    System.out.println("Enter Celsius temperature: ");
                    FahrenheitIn = keyboard.nextDouble();
                }
                if (FahrenheitIn > -459.67)
                    System.out.println("Temperature in Celsius = " + FtoCelsius(FahrenheitIn));
            }
        } while (!(reply == 3));
    }

    static double FtoCelsius(double FahrenheitIn){
        return (((FahrenheitIn-32)*5)/9);
    }

    static double CtoFahrenheit(double CelsiusIn){
        return (((9*CelsiusIn)/5)+32);
    }
}
