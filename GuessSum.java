import java.util.Scanner;

public class GuessSum {
    public static void main(String[] args) {
       /* Design and implement a program that asks the user to enter two numbers and
        then guess at the sum of those two numbers. If the user guesses correctly a
        congratulatory message is displayed, otherwise a commiseration message is
        displayed along with the correct answer.*/

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first number :");
        int firstNum = keyboard.nextInt();

        System.out.println("Enter second number :");
        int secondNum = keyboard.nextInt();

        System.out.println("guess the sum of the numbers you entered:");
        int guessNum = keyboard.nextInt();

        if (guessNum == (firstNum + secondNum)) {
            System.out.println("Congratulations, you guessed right");
        }
        else {
            System.out.println("oops!! Sorry you were wrong");
            System.out.println("the correct answer is " + (firstNum+secondNum));
        }
        System.out.println("thanks for stopping by.");
    }

}
