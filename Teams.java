import java.util.Scanner;

public class Teams {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter No. of Student : ");
        int Student = keyboard.nextInt();

        System.out.println("How many Students do you want per team");
        int Team = keyboard.nextInt();

        int teamsPossible = (Student / Team);
        int studentLeft = (Student % Team);

        System.out.println("Total number of Teams possible will be : " + teamsPossible);
        System.out.println("Number of Student that will be left without a Team will be " + studentLeft);
    }
}
