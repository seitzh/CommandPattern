import java.util.Scanner;
import vendors.Television;

public class Client
{
 /**
     * Runs the demo program.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Television tv = new Television(100);
        Remote remote = tvRemote(tv, kb);
        remoteDemo(remote, kb);
    }

    /**
     * Allows a user to repeatedly press different buttons on a remote.
     * 
     * @param remote the remote to play with
     * @param userInput a method of getting input from the user
     */
    private static void remoteDemo(Remote remote, Scanner userInput)
    {
        int choice;
        String input;
        do {
            System.out.printf("\nSelect a button number or type exit:\n%s\nSelection: ", remote);
            input = userInput.nextLine();
            System.out.println();
            choice = convertInput(input, remote.getNumButtons(), 0);
            if (input.equals("exit"))
            {
                System.out.println("Goodbye!");
            }
            else if (choice == -1)
            {
                System.out.printf("Please enter a valid button selection: ");
            }
            else
            {
                remote.clickButton(choice);
            }
        } while (!input.equals("exit"));
    }

    /**
     * Checks a string to see if it is an int within a specific range.
     * 
     * @param input the string to convert
     * @param upper the highest valid number
     * @param lower the lowest valid number
     * @return the string converted to an int if it is valid or -1 if it is invalid
     */
    private static int convertInput(String input, int upper, int lower)
    {
        try
        {
            int output = Integer.parseInt(input);
            return output < lower || output > upper ? -1 : output;
        }
        catch (NumberFormatException e)
        {
            return -1;
        }
    }

    /**
     * Creates a remote for managing a tv.
     * Here the client connects the receiver (tv) to concrete commands (ie Power) and sets them in the invoker (Remote)
     * 
     * @param tv the tv to connect the remote to
     * @param userInput a method of getting input when subscribing or unsubsrcibing to channels.
     * @return the created remote.
     */
    private static Remote tvRemote(Television tv, Scanner userInput)
    {
        Remote tvRemote = new Remote(8);
        tvRemote.setButton(new Power(tv), 0);
        tvRemote.setButton(new ChannelListing(tv), 1);
        tvRemote.setButton(new VolumeUp(tv), 2);
        tvRemote.setButton(new VolumeDown(tv), 3);
        tvRemote.setButton(new ChannelForward(tv), 4);
        tvRemote.setButton(new ChannelBackward(tv), 5);
        tvRemote.setButton(new Subscribe(tv, userInput), 6);
        tvRemote.setButton(new Unsubscribe(tv, userInput), 7);
        return tvRemote;
    }
}
