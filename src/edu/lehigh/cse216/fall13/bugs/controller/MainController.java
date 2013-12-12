
package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.persistence.dao.PersistenceFactory;
import edu.lehigh.cse216.fall13.persistence.interfaces.IBugsAndIssues;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Group A
 */
public class MainController {
    /**
     * Global instance variable
     */
    public static MainController instance = new MainController();
    
    private IBugsAndIssues dao;
    
    /**
     * Default constructor
     */
    private MainController() {
        dao = PersistenceFactory.create();
    }
    
    /**
     * Add bug takes a bug and adds it to the database.
     * 
     * @param b
     * @return 
     */
    public Bug add(Bug b) {
        // TODO: we should check to see if the bug exists in the database already
        // and append to it if needed.
        UUID bugId;
        dao.load();        
        bugId = dao.addBug(b);
        dao.save();
        return view(bugId);
    }
    
    /**
     * Method list fetches all the bugs from the database and returns it as an
     * ArrayList. 
     * @return 
     *      ArrayList that holds a list of all the bugs in the database.
     */
    public ArrayList<Bug> list() {
        dao.load();
        ArrayList<Bug> o = dao.listBugs();        
        dao.save();
        return o;
    }
    
    /**
     * Method view takes a bug id and returns the cooresponding bug object.
     * @param bugId
     * @return 
     */
    public Bug view(UUID bugId) {
        dao.load();
        Bug b = dao.getBug(bugId);
        dao.save();
        return b;
    }
    
    /**
     * Edit takes a bug pushes the new version to the database.  
     * @param bugId
     * @return 
     */
    public Bug edit(UUID bugId) {
        dao.load();
        dao.editBug(view(bugId));
        dao.save();
        return view(bugId);
    }
    
    /**
     * Remove takes a unique identifier and removes the cooresponding bug from
     * the database.
     * @param bugId 
     */
    public void remove(UUID bugId) {
        dao.load();
        dao.deleteBug(bugId);
        dao.save();
    }
}
