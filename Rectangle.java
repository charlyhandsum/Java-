import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double Length, Width;

        System.out.println("Enter Length of rectangle : ");
        Length = keyboard.nextDouble();

        System.out.println("Enter Width of rectangle");
        Width = keyboard.nextDouble();

        double area = calculateArea(Length, Width);
        System.out.println("Area of rectangle is " + area);

        double perimeter = caculatePerimeter(Length, Width);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
    static double calculateArea(double Length, double Width){
        double Area;
        Area = (Length * Width);
        return Area;
    }

    static double caculatePerimeter(double Length, double Width){
        double Perimeter;
        Perimeter = ((2*Length)+(2*Width));
        return Perimeter;
    }
}
