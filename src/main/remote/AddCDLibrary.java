package remote;
import vendors.StereoSystem;

import java.util.Scanner;

public class AddCDLibrary extends Action{

    private StereoSystem ss;

    Scanner userInput;

    public AddCDLibrary(StereoSystem ss, Scanner userInput) {
        super("AddCDLibrary");
        this.ss = ss;
        this.userInput = userInput;
    }

    @Override
    public boolean performAction() {
        System.out.print("Name of the brand spanking new CD: ");
        String x = userInput.nextLine();
        ss.addCDToLibrary(x);
        return true;
    }
    
}
