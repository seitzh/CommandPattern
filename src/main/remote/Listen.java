package remote;
import vendors.StereoSystem;

public class Listen extends Action{

    private StereoSystem ss;

    public Listen(StereoSystem ss) {
        super("Listen");
        this.ss = ss;
    }

    @Override
    public boolean performAction() {
        ss.listen();
        return true;
    }
    
}
