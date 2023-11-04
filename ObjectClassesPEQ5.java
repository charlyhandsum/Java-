public class ObjectClassesPEQ5 {
    public static void main (String[] args){

       /* Write a program that creates an array of Oblong objects to represent the
        dimensions of rooms in an apartment as described in self test question 6. The
        program should allow the user to:
        • Determine the number of rooms;
        • Enter the dimensions of the rooms;
        • Retrieve the area and dimensions of any of the rooms.*/

        System.out.println("Enter number of rooms: ");
        int noOfRoom = EasyScanner.nextInt();

        //creating array reference from user input to hold objects
        Oblong[] room = new Oblong[noOfRoom];
        System.out.println();

        // Allowing user to enter the dimensions of the room
        for (int row = 0; row < room.length; row++) {
            System.out.println("set dimension of room " + (row+1));
            System.out.println("Enter length: ");
            double length = EasyScanner.nextDouble();
            System.out.println("Enter height: ");
            double height = EasyScanner.nextDouble();
            System.out.println();

            //creating the object
            room[row] = new Oblong(length, height);
        }

        // Retrieving the area and dimension of any room
        System.out.println("DISPLAY AREA AND DIMENSION");
        System.out.println("Enter room number: ");
        int roomNo = EasyScanner.nextInt();
        System.out.println();
        System.out.println("The area of room " + roomNo + " is " + room[roomNo-1].calculateArea());
        System.out.println();
        System.out.println("Dimension");
        System.out.println("length = " + room[roomNo-1].getLength());
        System.out.println("height = " + room[roomNo-1].getHeight());
    }
}
