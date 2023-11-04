import java.util.Arrays;
import java.util.Scanner;

public class ArrayAsParameters {
    public static void main(String[] args) {
        double[] temperature;
        temperature = ReturnArray();
        ArrayList.DisplayTemperature(temperature);


    }

    static double[] ReturnArray() {

        Scanner keyboard = new Scanner(System.in);
        //Creating array within method
        double[] temperatureOutput = new double[5];
        System.out.println("*** TEMPERATURE INPUT ***");
        // using a loop, so I can store data element in the array
        System.out.println();
        for (int i = 0; i < temperatureOutput.length; i++) {
            System.out.println("Input temperature for Day " + (i + 1) + ":");
            temperatureOutput[i] = keyboard.nextDouble();
        }
        return temperatureOutput;
    }
}

