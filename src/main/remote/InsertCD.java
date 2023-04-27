package remote;
import vendors.StereoSystem;

import java.util.Scanner;

public class InsertCD extends Action {

    private StereoSystem ss;

    Scanner userInput;

    public InsertCD(StereoSystem ss, Scanner userInput) {
        super("InsertCD");
        this.ss = ss;
        this.userInput = userInput;
    }

    @Override
    public boolean performAction() {
        ss.insertCD(userInput);
        return true;
    }
}
