public class ObjectClassPE2 {
    public static void main(String[] args){

       /* 2. Consider a program to enter and confirm a suitable code name for an agent.
        Declare two string objects, called codeName and confirm and then
        (a) Prompt to get the user to enter a suitable name into the codeName string;
        (b) Use a while loop to ensure that the string entered is greater than 6 characters in length,
            if it is not print “INVALID CODENAME” and ask the user to re-enter a code name;
        (c) Once a valid code name has been entered ask the user to re-enter the code
            name into the confirm string and then use an if else statement to ensure
            that the string entered matches the original code name; if it does, print a
            message “CODE NAME CONFIRMED” otherwise print a message saying
            “CODE NAME MIS-MATCH”; */

        String codeName, confirm;

        //Prompting the User to enter a suitable code name
        System.out.println("enter a Code Name (must have more than 6 character and end with an 'X' : ");
        codeName = EasyScanner.nextString();

        while(codeName.length() <= 6){
            System.out.println("INVALID CODENAME");
            System.out.println("(Code Name must be more that 6 character)");
            System.out.println();
            System.out.println("Enter Code Name: ");
            codeName = EasyScanner.nextString();
            System.out.println();
        }

        System.out.println("re-enter Code Name to confirm: ");
        confirm = EasyScanner.nextString();

        if (codeName.equals(confirm)){
            System.out.println("CODE NAME CONFIRMED");
        }else {
            System.out.println("CODE NAME MISMATCH");
        }
        String checkWordAtStart = "Agent";
        boolean checkStart = codeName.startsWith(checkWordAtStart);

        if (checkStart){
            System.out.println("Codename Start word confirmed");
        } else {
            System.out.println("please go back and use specified start word for code name");
        }
        /*(d) Use the charAt method to ensure that the code name ends with an ‘X’
              character;
          (e) Finally use the startsWith method to ensure that, as well as being
              greater than 6 characters in length, the code name entered also starts with the
              words “Agent”.*/

        int Length = codeName.length();
        char confirmX = codeName.charAt(Length-1);

        if (confirmX == 'X'){
            System.out.println("Code name ends with an 'X' ");
            System.out.println("Valid Username");
        } else {
            System.out.println("Username does not end with an 'X'");
            System.out.println("Invalid Username");
        }
    }
}
