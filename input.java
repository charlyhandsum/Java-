import java.util.Scanner;
public class input {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input your Name: ");
        String name = input.next();

        System.out.println("Input your age: ");
        int number = input.nextInt();

        System.out.println("your Name is : " + name);
        System.out.println("you are " + number + " years old");




        input.close();

    }

}
