import java.util.Scanner;

public class ArrayTest6 {
    public static void main (String[] arg)
    {
        /*Grades are recorded for 4 tutorial groups, and each tutorial group consists of 20
        students.
                (a) How many dimensions does this array have?
                (b) What is the value of grades.length?
                (c) What is the value of grades[0].length?
                (d) Write the instruction to record the grade ‘B’ for the first student in the first
                    tutorial group.*/
        char[][] grades = new char[4][20];
        recordGrade(grades);

        System.out.println("Grade for Student 1 in Tutorial group 1 is : ");
        System.out.println(grades [0][0]);
    }
        static void recordGrade(char[][] gradesIn){
            System.out.println("** ENTER GRADE ***");
            Scanner keyboard = new Scanner(System.in);
                    System.out.println("Enter grade of student 1 in Tutorial group 1 : ");
                    char grade = keyboard.next().charAt(0);
                    gradesIn [0][0] = grade;
                }



    }
