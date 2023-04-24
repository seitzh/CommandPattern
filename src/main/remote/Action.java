package remote;
/**
 * Performs an action that can be used in a remote.
 * All the different actions will subclass this
 * so the remote can use them all in the same array.
 * 
 * @author Willow Sapphire
 * @version Fall 2022
 */
public abstract class Action
{
    /**
     * Centralized location to access null actions.
     */
    public static final Action NULL = new NullAction();

    /**
     * The name of the action.
     */
    private String actionName;
    
    /**
     * Creates the action object.
     * 
     * @param actionName the name of the action
     */
    public Action(String actionName)
    {
        setActionName(actionName);
    }

    /**
     * This is the method that child classes will override.
     * They can make it do whatever action they want.
     * 
     * @return true if the action was successful. false if something goes wrong.
     *      In this case, it always returns true.
     */
    public abstract boolean performAction();

    /**
     * Getter for the name of the action.
     * 
     * @return the action name
     */
    public String getActionName()
    {
        return this.actionName;
    }

    /**
     * Setter for the name of the action.
     * Sets the name as "No Name" if null is provided.
     * 
     * @param actionName the new action name
     */
    public void setActionName(String actionName)
    {
        this.actionName = actionName == null ? "No Name" : actionName;
    }

    /**
     * Use the name of the action when the action is printed.
     * 
     * @return the name of the action
     */
    @Override
    public String toString()
    {
        return actionName;
    }
}
