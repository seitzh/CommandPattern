package remote;
import vendors.Television;

/**
 * A child class of action that changes the channel of a tv.
 * It move the channel backward in the list of channels.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class ChannelBackward extends Action
{
    /**
     * The tv for which to change the channel.
     */
    private Television tv;

    /**
     * Creates this action object.
     * 
     * @param tv the tv to connect to
     */
    public ChannelBackward(Television tv)
    {
        super("Channel Backward");
        this.tv = tv;
    }

    /**
     * Changes the channel of the provided tv backward by one.
     * @return false if the tv is not on yet, true otherwise
     */
    @Override
    public boolean performAction()
    {
        if (!tv.isOn())
        {
            System.out.println("You need to turn on the tv before you can change the channel.");
            return false;
        }
        else
        {
            tv.goToChannel((tv.getCurrentStation() - 1 + tv.getNumChannels()) % tv.getNumChannels());
            System.out.printf("Channel Backward. Now on station %d: %s\n",
                tv.getCurrentStation(), tv.getCurrentChannel());
            return true;
        }
    }


}
