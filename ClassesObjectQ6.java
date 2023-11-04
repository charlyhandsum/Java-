import java.util.ArrayList;

public class ClassesObjectQ6 {
    public static void main(String[] args){

   /*6. (a) Declare an array called rooms, to hold three Oblong objects. Each
            Oblong object will represent the dimensions of a room in an apartment.
        (b) The three rooms in the apartment have the following dimensions:
            Add three appropriate Oblong objects to the rooms array to represent
            these 3 rooms.
        (c) Write the line of code that would make use of the rooms array to display
            the area of room 3 to the screen.*/

        // declaring an array called rooms
        //Oblong[] room = new Oblong[3];

        ArrayList <Oblong> roomList = new ArrayList<>();

        roomList.add (new Oblong(4.7, 5.2));
        roomList.add (new Oblong(5.7, 5.2));
        roomList.add (new Oblong(5.0, 8.1));

        // Displaying the area of room 3 unto the screen
        System.out.println();
        System.out.println("The area of room 3 is " + roomList.get(2).calculateArea());
    }
}
