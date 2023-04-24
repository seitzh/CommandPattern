package remote;
import java.util.Scanner;

import vendors.Television;

/**
 * A child class of action that removes a channel to a tv's channel list.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class Unsubscribe extends Action
{
    /**
     * The tv being used.
     */
    private Television tv;

    Scanner userInput;

    /**
     * Creates this action object.
     * 
     * @param tv the tv to connect to
     */
    public Unsubscribe(Television tv, Scanner userInput)
    {
        super("Unsubscribe");
        this.tv = tv;
        this.userInput = userInput;
    }

    /**
     * Changes the channel of the provided tv forward by one.
     * 
     * @return false if the tv is not on yet, true otherwise
     */
    @Override
    public boolean performAction()
    {
        String channelToRemove = userInput.nextLine();
        if (!tv.hasChannel(channelToRemove))
        {
            System.out.printf("%s is not in the current channel list.", channelToRemove);
            return false;
        }
        tv.unsubscribeFromChannel(channelToRemove);
        System.out.printf("Channel %sremoved\n", channelToRemove);
        return true;
    }
}
