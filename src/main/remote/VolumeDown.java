package remote;
import vendors.Television;

/**
 * A child class of action that decreases the volume of a tv.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class VolumeDown extends Action
{
    /**
     * The tv for which to change the volume.
     */
    private Television tv;

    /**
     * Creates this action object.
     * 
     * @param tv the tv to connect to
     */
    public VolumeDown(Television tv)
    {
        super ("Volume Down");
        this.tv = tv;
    }

    /**
     * Turns the volume of the tv down by one.
     * 
     * @return false if the tv is not on yet or the volume is at zero, true otherwise
     */
    @Override
    public boolean performAction()
    {
        if (!tv.isOn())
        {
            System.out.println("You need to turn on the tv before you can change the volume.");
            return false;
        }
        else if (tv.getVolume() == 0)
        {
            System.out.println("Volume already at zero");
            return false;
        }
        else
        {
            tv.decreaseVolume();
            System.out.printf("Volume down. Now at %d\n", tv.getVolume());
            return true;
        }
    }
}
