import java.util.Scanner;

public class ExamsGrade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Exams Score : ");
        int Score = keyboard.nextInt();

        if (Score <= 39)
        {
            System.out.println("You have failed this examinations");
        }
            else if (Score >= 40 && Score <= 69) {
            System.out.println("Congratulations, you passed !!! ");
        }
            else if (Score >= 70) {
            System.out.println("you have been awarded a distinction for your high grade");
        }

            System.out.println("GoodLuck with your next examinations");

    }

}
