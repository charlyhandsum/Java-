/*Write a program that makes use of nested for loops to display the following
        shapes:
        (a) ******
            ******
            ******

        (b) ***
            ***
            *********
            *********
            ***
            ***

        Hint: make use of an if…else statement inside your for loops.
        (c) ****
            ***
            **
            *

            /****/

public class Square {
    public static void main (String[] args){

        int i;
        System.out.println("*** This program will draw a square ***");
        System.out.println();

        for (i=1; i <= 3; i++){
            for (int j = 1; j <= 1 ; j++) {
                System.out.println("******");
            }
        }
    }
}
