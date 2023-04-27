package remote;

import vendors.StereoSystem;

public class EjectCD extends Action {

    private StereoSystem ss;

    public EjectCD(StereoSystem ss) {
        super("EjectCD");
        this.ss = ss;
    }

    @Override
    public boolean performAction() {
        ss.ejectCD();
        return true;
    }
    
}
