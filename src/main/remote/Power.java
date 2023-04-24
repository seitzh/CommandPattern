package remote;
import vendors.Television;

/**
* A child class of action that turns a tv on or off.
* 
* @author Willow Sapphire
* @version Fall 2022
*/
public class Power extends Action
{
    /**
     * The tv to turn on.
     */
    private Television tv;

    /**
     * Creates this action object.
     * 
     * @param tv the tv to connect to
     */
    public Power(Television tv)
    {
        super("Power");
        this.tv = tv;
    }

    /**
     * Turns the tv on if it is off or off if it is on.
     * 
     * @return true. this action cannot fail.
     */
    @Override
    public boolean performAction()
    {
        tv.power();
        System.out.printf("The tv has turned %s\n", tv.isOn() ? "on" : "off");
        if (tv.isOn())
        {
            System.out.printf("Volume: %d\nChannel: %s\n", tv.getVolume(), tv.getCurrentChannel());
        }
        return true;
    }
}
