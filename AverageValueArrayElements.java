public class AverageValueArrayElements {
    public static void main(String[] args) {

        //creating an array
        int[] Number = new int[5];

        // prompting the user for input
        for (int element = 0; element < Number.length; element++) {
            System.out.println("Input num " + (element + 1) + ":");
            Number[element] = EasyScanner.nextInt();
        }

        // Calculating the Average
        int sumValue = 0;
        int average = 0;
        for (int i : Number) {
            sumValue = sumValue + i;
            average = sumValue / (Number.length);
        }
        System.out.println(sumValue);
        System.out.println("Average is " + average);
    }
}
