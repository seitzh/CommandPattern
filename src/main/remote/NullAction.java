package remote;
public class NullAction extends Action {
    public NullAction() { super("No Action");}
    public boolean performAction() { return false; }
}