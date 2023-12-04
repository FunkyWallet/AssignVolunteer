import java.util.Scanner;
public class AssignVolunteer
{
    public static void main(String[] args)
    {

    // Variables and Constants.
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Johnny Tsunami";
        final String FURNITURE_PRICER = "Mr. Dinkle";
        final String ELECTRONICS_PRICER = "Tartar Martyr";
        final String OTHER_PRICER = "Zeedis Lapeetus";
        Scanner kbd = new Scanner(System.in);

    // Input Phase.
        System.out.print("\nWhat type of donation is this?" + "\nEnter " + CLOTHING_CODE + " for CLOTHING,\n" + FURNITURE_CODE + " for FURNITURE,\n" + ELECTRONICS_CODE + " for ELECTRONICS,\n" + OTHER_CODE + " for ANYTHING ELSE >> ");
        donationType = kbd.nextInt();

    // Processing Phase.
        // While loop to validate the user input.
        while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
        {
            System.out.println("*!*!*!*!*You entered: " + donationType + ". This is not a valid donation type.*!*!*!*!*");
            System.out.print("\nWhat type of donation is this?" + "\nEnter " + CLOTHING_CODE + " for CLOTHING,\n" + FURNITURE_CODE + " for FURNITURE,\n" + ELECTRONICS_CODE + " for ELECTRONICS,\n" + OTHER_CODE + " for ANYTHING ELSE >> ");
            donationType = kbd.nextInt();
        }// End of while loop.
        switch (donationType)
        {
            case(CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case(FURNITURE_CODE):
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case(ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            case(OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = " ~*INVALID*~";
                message = " ~ *INVALID*~";
                break;
        }// End of switch statement.

    // Output Phase.
        System.out.println("\nYou entered: " + donationType + "\nThis is " + message + "\nThe volunteer who will price this item is: " + volunteer);
        kbd.close();
    } // End of main.
} // End of class.