package remote;
import vendors.StereoSystem;

public class CheckLibrary extends Action{
    

    private StereoSystem ss;

    public CheckLibrary(StereoSystem ss)
    {
        super("CheckLibrary");
        this.ss = ss;
    }

    @Override
    public boolean performAction() {
        ss.checkLibrary();
        return true;
    }
}
