import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {

        double[] temperature = {23.3, 27.1,31.4, 22.7, 20.2};
       //calling my methods
        System.out.println();
        System.out.println("sending an array as a Parameter");
        DisplayTemperature(temperature);
        /*System.out.println();
        System.out.println("Individual Values of temperature as a Parameter");
        DisplayTemperature(40.3, 30.5, 22.4, 31.2);
        System.out.println();
        System.out.println("One Value of temperature as a Parameter");
        DisplayTemperature(30.0);
        System.out.println();*/
    }

//    creating 2 Methods from code (i.e. GetTemperature and DisplayTemperature)
// Storing values in the array (applying the concept of Indexing)
   /* static void GetTemperature(double[] temperatureInput) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("*** TEMPERATURE INPUT ***");
        // using a loop, so I can store data element in the array
        System.out.println();
        for (int i = 0; i < temperatureInput.length; i++) {
            System.out.println("Input temperature for Day " + (i + 1) + ":");
            temperatureInput[i] = Keyboard.nextDouble();
        }
    }*/


        // Displaying the content of the array
    static void DisplayTemperature(double... temperatureInput){
        int i = 0;
        System.out.println("*** DISPLAY TEMPERATURE ***");
        System.out.println();
       /* for (int i = 0; i < temperatureInput.length; i++) {
            System.out.println("Temperature for Day "+(i+1)+" = "+ temperatureInput[i] ) ;*/
        for (double item: temperatureInput) {
            System.out.println("Temperature for Day "+ (i+1)+" = "+ item ) ;
            i++;
        }
        }

    }