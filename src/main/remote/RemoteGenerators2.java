package remote;
import java.util.Scanner;
import vendors.StereoSystem;

public class RemoteGenerators2 {
    
    /**
     * @param ss the ss to connect the remote to
     * @param userInput a method of getting input when subscribing or unsubsrcibing to channels.
     * @return the created remote.
     */
    public static Remote stereoSystem(StereoSystem ss, Scanner userInput)
    {
        Remote stereoSystem = new Remote(2);
        stereoSystem.setButton(new CheckLibrary(ss), 0);
        stereoSystem.setButton(new AddCDLibrary(ss, userInput), 1);
        return stereoSystem;
    }
}
