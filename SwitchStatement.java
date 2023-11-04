import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Find out you time for Practicals");
        System.out.println("Enter your name : ");
        String name = keyboard.next();

        switch (name){
            case "Charly": case "Frank" : System.out.println("time for Practical is 10:00am");
                        break;

            case "Sean":   System.out.println("time for Practical is 1:00pm");
                        break;

            case "Vee":   System.out.println("time for Practical is 3:00pm");
                        break;

            default:   System.out.println("No such name in directory");
        }

    }

}