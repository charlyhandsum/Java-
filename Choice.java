import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Find out you time for Practicals");
        System.out.println("Enter your group : ");
        char group = keyboard.next().charAt(0);

        if (group == 'A') {
            System.out.println("Practical is by 9:00am");
        }
        else if (group == 'B') {
            System.out.println("Practical is by 12 noon");
        }
        else if (group == 'C'){
            System.out.println("Practical is by 2:00pm");
        }
        else {
            System.out.println("This group does not exist");
        }

        System.out.println("Be careful in the laboratory always");
    }

}