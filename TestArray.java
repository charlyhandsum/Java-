public class TestArray {
    public static void main(String[] arg){
        /*Create the equivalent array by using the new operator and then assigning
        the value of each element individually.
        (e) Write a standard for loop that will double the value of every item in
        someArray.*/

        int [] numbers = {6, 13, 16, 5, 9};
        multiplyNumber(numbers);
       // displayNumber(numbers);

    }
    int item;
    static void multiplyNumber(int [] numbersIn)
    {
        for (int i = 0; i < numbersIn.length; i++)
        {
          numbersIn[i] = numbersIn[i] * 2;
        }
    }
    static void displayNumber(int [] numbersIn)
    {
        for (int number : numbersIn) {
            System.out.println("The multiple value of " + number + " is " + number * 2);
        }
    }
}
