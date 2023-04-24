package remote;
import java.util.Scanner;

import vendors.Television;

/**
 * A child class of action that adds a channel to a tv's channel list.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class Subscribe extends Action
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
    public Subscribe(Television tv, Scanner userInput)
    {
        super("Subscribe");
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
        String channelToAdd = userInput.nextLine();
        if (tv.hasChannel(channelToAdd))
        {
            System.out.printf("%s is already on station %d on this tv.",
                channelToAdd, tv.getStationAtChannel(channelToAdd));
            return false;
        }
        tv.subscribeToChannel(channelToAdd);
        System.out.printf("Channel %s added\n", channelToAdd);
        return true;
    }
}
