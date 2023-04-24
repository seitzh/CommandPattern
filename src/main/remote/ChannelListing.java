package remote;
import vendors.Television;

/**
 * A child class of action that prints all of the channels for a tv.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class ChannelListing extends Action
{
    /**
     * The tv for which to list the channels.
     */
    private Television tv;

    /**
     * Creates this action object.
     * 
     * @param tv the tv to connect to
     */
    public ChannelListing(Television tv)
    {
        super("Channel Listing");
        this.tv = tv;
    }

    /**
     * Prints all of the channels available.
     * 
     * @return true. This action cannot fail
     */
    @Override
    public boolean performAction()
    {
        String[] channels = tv.getChannels();
        if (channels.length == 0)
        {
            System.out.println("No available channels");
        }
        else
        {
            for (int i = 0; i < channels.length; i++)
            {
                System.out.printf("Station %d) %s\n", i, channels[i]);
            }
        }
        return true;
    }
}
