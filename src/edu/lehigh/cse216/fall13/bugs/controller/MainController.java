
package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.bugs.database.DatabaseManager;
import java.util.ArrayList;

/**
 *
 * @author Group A
 */
public class MainController {
    /**
     * Global instance variable
     */
    public static MainController instance = new MainController();
    
    /**
     * Default constructor
     */
    private MainController() {

    }
    
    /**
     * Add bug takes a bug and adds it to the database.
     * 
     * @param b
     * @param isEdit
     * @return 
     */
    public Bug add(Bug b, boolean isEdit) {
        // TODO: we should check to see if the bug exists in the database already
        // and append to it if needed.
        if (isEdit) {
            DatabaseManager.instance.updateBug(b);           
        }
        int bugId = DatabaseManager.instance.addBug(b);
        
        return view(bugId);
    }
    
    /**
     * Method list fetches all the bugs from the database and returns it as an
     * ArrayList. 
     * @return 
     *      ArrayList that holds a list of all the bugs in the database.
     */
    public ArrayList<Bug> list() {
        return DatabaseManager.instance.listBugs();        
    }
    
    /**
     * Method view takes a bug id and returns the cooresponding bug object.
     * @param bugId
     * @return 
     */
    public Bug view(int bugId) {
        return DatabaseManager.instance.getBug(bugId);
    }
    
    /**
     * Edit takes a bug pushes the new version to the database.  
     * @param b bug to be updated.
     */
    public void edit(Bug b) {
        DatabaseManager.instance.editBug(b);
        //TODO: return the correct bug to the gui.
    }
}
