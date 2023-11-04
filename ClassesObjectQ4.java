public class ClassesObjectQ4 {
    public static void main(String[] args){

       /* Consider the following fragment of code that initializes one string constant with
        a password (“java”) and creates a second string to hold the user’s guess for the
        password. The user is then asked to enter their guess:
        (a) Write a line of code that uses the EasyScanner class to read the guess
                from the keyboard.
        (b) Write the code that displays the message “CORRECT PASSWORD” if the
            user entered the correct password and “INCORRECT PASSWORD” if not.*/

        final String PASSWORD = "java";     // set password
        String guess; // to hold user’s guess

        System.out.print("Enter guess:");
        guess = EasyScanner.nextString();

        if (guess.equals(PASSWORD)){
            System.out.println("CORRECT PASSWORD");
        }else{
            System.out.println("INCORRECT PASSWORD");
        }

    }
}
