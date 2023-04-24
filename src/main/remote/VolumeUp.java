package remote;
import vendors.Television;

/**
 * A child class of action that increases the volume of a tv.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public class VolumeUp extends Action
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
    public VolumeUp(Television tv)
    {
        super ("Volume Up");
        this.tv = tv;
    }

    /**
     * Turns the volume of the tv up by one.
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
        else if (tv.getVolume() == tv.getMaxVolume())
        {
            System.out.println("Volume already at maximum");
            return false;
        }
        else
        {
            tv.increaseVolume();
            System.out.printf("Volume up. Now at %d\n", tv.getVolume());
            return true;
        }
    }
}
